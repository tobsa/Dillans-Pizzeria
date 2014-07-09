package savi.tobsa.dillanspizzeria.domain;

import java.util.ArrayList;
import java.util.List;

public class PizzaGroup {
	private String name;
	private int cost;
	private int costChildren;
	private int costPartner;
	private int costFamily;
	private List<Pizza> menuItems = new ArrayList<Pizza>();
	
	public PizzaGroup(String name, int cost, int costChildren, int costPartner, int costFamily) {
		this.name = name;
		this.cost = cost;
		this.costChildren = costChildren;
		this.costPartner = costPartner;
		this.costFamily = costFamily;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCost() {
		return cost;
	}
	
	public int getCostChildren() {
		return costChildren;
	}
	
	public int getCostPartner() {
		return costPartner;
	}
	
	public int getCostFamily() {
		return costFamily;
	}
	
	public void addPiza(Pizza item) {
		menuItems.add(item);
	}
	
	public List<Pizza> getPizzas() {
		return menuItems;
	}
}
