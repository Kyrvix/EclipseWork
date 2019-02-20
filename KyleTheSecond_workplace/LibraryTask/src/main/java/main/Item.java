package main;

import java.util.ArrayList;

public abstract class Item {
	private int id;
	public static ArrayList<Item> inventory = new ArrayList<Item>();
	public static ArrayList<Item> checkedOut = new ArrayList<Item>();
	

	public Item(int id) {
		this.id = id;
		inventory.add(this);
	}
	
	public void checkingIn(int idNum) {
		for(int i = 0; i < checkedOut.size(); i++) {
			if(checkedOut.get(i).getId() == idNum) {
				inventory.add(this);
				checkedOut.remove(i);
			}
		}
	}
	
	public void checkingOut(int idNum) {
		for(int i = 0; i < inventory.size(); i++) {
			if(inventory.get(i).getId() == idNum) {
				checkedOut.add(this);
				inventory.remove(i);
			}
		}
	}

	public void remove(int idNum) {
		for(int i = 0; i < inventory.size(); i++) {
			if(inventory.get(i).getId() == idNum) {
				inventory.remove(i);
			}
		}
	}
	
	public void updateItem(int idNum) {
		for(int i = 0; i < inventory.size(); i++) {
			if(inventory.get(i).getId() == idNum) {
				
			}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
