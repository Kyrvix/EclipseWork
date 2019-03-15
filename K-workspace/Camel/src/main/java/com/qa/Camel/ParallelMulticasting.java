package com.qa.Camel;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.camel.impl.DefaultCamelContext;

import javax.jms.ConnectionFactory;

public class ParallelMulticasting {

	public static void main(String args[]) throws Exception {
		CamelContext context = new DefaultCamelContext();
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost");

		PropertiesComponent prop = context.getComponent("properties", PropertiesComponent.class);
		prop.setLocation("classpath:system-properties.properties");

		context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
		context.addRoutes(new RouteBuilder() {
			@Override
			public void configure() {
				from("ftp://test.rebex.net/pub/example?username=demo&password=password")
				  .choice()
				    .when(header("CamelFileName").endsWith(".png"))
				      .to("activemq:queue:pngOrders")
				    .when(header("CamelFileName").endsWith(".txt"))
				      .to("activemq:queue:txtOrders")
				    .otherwise()
				      .to("activemq:queue:otherOrders")
				  .end()
				.to("activemq:continuedProcessing");
			}
		});
		context.start();
		Thread.sleep(10000);
		context.stop();
	}

}
