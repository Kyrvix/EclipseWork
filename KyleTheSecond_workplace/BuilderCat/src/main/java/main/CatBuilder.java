package main;

public class CatBuilder {
	String weight;
	String name;
	String lives;
	private static CatBuilder builder;
	
	private CatBuilder() {
		
	}
	
	public static CatBuilder getInstance() { //Singleton
		if(builder == null) {
			builder = new CatBuilder();
		}
		return builder;
	}
	
	public CatBuilder weight(String weight) {
		this.weight = weight;
		return this;
	}
	public CatBuilder name(String name) {
		this.name = name;
		return this;
	}
	public CatBuilder lives(String lives) {
		this.lives = lives;
		return this;
	}
	public Cat buildCat() {
		return new Cat(weight, name, lives);
	}
}
