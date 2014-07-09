package savi.tobsa.dillanspizzeria.domain;

import java.util.ArrayList;
import java.util.List;


public class Pizza {
	public static final int InvalidNumber = -1;
	
	private int number;
	private String name;
	private Ingredient[] ingredients;
	private Type[] types;
		
	public Pizza(String name, Ingredient[] ingredients) {
		this.number = InvalidNumber;
		this.name = name;
		this.ingredients = ingredients;
		types = new Type[]{Type.Standard};
	}
	
	public Pizza(String name, Ingredient[] ingredients, Type[] types) {
		this.number = InvalidNumber;
		this.name = name;
		this.ingredients = ingredients;
		this.types = types;
	}
	
	public Pizza(int number, String name, Ingredient[] ingredients) {
		this.number = number;
		this.name = name;
		this.ingredients = ingredients;
		types = new Type[]{Type.Standard};
	}
	
	public Pizza(int number, String name, Ingredient[] ingredients, Type[] types) {
		this.number = number;
		this.name = name;
		this.ingredients = ingredients;
		this.types = types;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public Ingredient[] getIngredients() {
		return ingredients;
	}
	
	public Type[] getTypes() {
		return types;
	}
	
	public boolean containsIngredients(List<String> containedIngredients) {
		List<String> listIngredients = new ArrayList<String>();
		
		for(Ingredient ingredient : ingredients)
			listIngredients.add(ingredient.toString());
		
		return listIngredients.containsAll(containedIngredients);
	}
	
	public boolean containsTypes(List<String> containedTypes) {
		List<String> listTypes = new ArrayList<String>();
		
		for(Type type : types)
			listTypes.add(type.toString());
		
		return listTypes.containsAll(containedTypes);
	}
	
	@Override
	public String toString() {
		String str = "";
		for(int i = 0; i < ingredients.length; i++)
			str += ingredients[i].toString() + ", ";
		
		try {
			return str.substring(0, str.length() - 2);
		} catch(StringIndexOutOfBoundsException ex) {
			return "";
		}
	}
}
