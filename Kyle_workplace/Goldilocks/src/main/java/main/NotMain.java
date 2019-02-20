package main;

import java.util.ArrayList;
import java.util.List;

public class NotMain {

	public String doThings(int weight, int temp) {
		
		Goldlilocks gold = new Goldlilocks(weight, temp);
		
		List<Chair> chairList = new ArrayList<>();
		List<Porridge> porridgeList = new ArrayList<>();
		
		
		chairList.add(new Chair(30));
		chairList.add(new Chair(130));
		
		porridgeList.add(new Porridge(50));
		porridgeList.add(new Porridge(60));
		
		if (gold.equals(null)) {
			return "She doesn't exist";
		}
		
		if (chairList.isEmpty()) {
			return "You have no chairs";
		}
		
		if (porridgeList.isEmpty()) {
			return "You have no porridge";
		}
		
		String answer = gold.findChair(gold, chairList, porridgeList);
		
		return answer;
		
	}
	
	
	
}