package savi.tobsa.dillanspizzeria.domain;

import java.util.ArrayList;
import java.util.List;

public class PizzaManager {
	
	public static List<PizzaGroup> getIngredientFilteredList(List<String> ingredients) {
		List<PizzaGroup> groups = new ArrayList<PizzaGroup>();
		
		for(PizzaGroup group : getDefaultList()) {
			int costChildren = group.getCostChildren();
			int costPartner  = group.getCostPartner();
			int costFamily   = group.getCostFamily();
			
			PizzaGroup filteredGroup = new PizzaGroup(group.getName(), group.getCost(), costChildren, costPartner, costFamily);
			
			for(Pizza pizza : group.getPizzas()) {
				if(pizza.containsIngredients(ingredients))
					filteredGroup.addPiza(pizza);
			}
			
			groups.add(filteredGroup);
		}
		
		return groups;
	}
	
	public static List<PizzaGroup> getTypeFilteredList(List<String> types) {
		List<PizzaGroup> groups = new ArrayList<PizzaGroup>();
		
		for(PizzaGroup group : getDefaultList()) {
			int costChildren = group.getCostChildren();
			int costPartner  = group.getCostPartner();
			int costFamily   = group.getCostFamily();
			
			PizzaGroup filteredGroup = new PizzaGroup(group.getName(), group.getCost(), costChildren, costPartner, costFamily);
			
			for(Pizza pizza : group.getPizzas()) {
				if(pizza.containsTypes(types))
					filteredGroup.addPiza(pizza);
			}
			
			groups.add(filteredGroup);
		}
		
		return groups;
	}
	
	public static List<PizzaGroup> getDefaultList() {
		List<PizzaGroup> groups = new ArrayList<PizzaGroup>();
		
		PizzaGroup group1 = new PizzaGroup("Prisklass 1", 55, 50, 80, 120);
		PizzaGroup group2 = new PizzaGroup("Prisklass 2", 60, 55, 85, 130);
		PizzaGroup group3 = new PizzaGroup("Prisklass 3", 65, 60, 95, 140);
		PizzaGroup group4 = new PizzaGroup("Prisklass 4", 70, 65, 100, 150);
		PizzaGroup group5 = new PizzaGroup("Prisklass 5", 75, 70, 105, 160);
		PizzaGroup group6 = new PizzaGroup("Mozzarella",  75, 70, 105, 160);	
		
		group1.addPiza(new Pizza(1, "Margherita", 			new Ingredient[]{}));
		group1.addPiza(new Pizza(2, "Vesuvio",    			new Ingredient[]{Ingredient.Skinka}));
		group1.addPiza(new Pizza(3, "Calzone",				new Ingredient[]{Ingredient.Skinka}, new Type[]{Type.Inbakad}));
		group1.addPiza(new Pizza(4, "Kasalinka", 			new Ingredient[]{Ingredient.Champinjoner}));
		group1.addPiza(new Pizza(5, "Bari", 				new Ingredient[]{Ingredient.Salami}));
		group1.addPiza(new Pizza(6, "Al Tono", 				new Ingredient[]{Ingredient.Tonfisk}));
		
		group2.addPiza(new Pizza(7,  "Tomasso", 	new Ingredient[]{Ingredient.Skinka, Ingredient.R�kor}));
		group2.addPiza(new Pizza(8,  "Capricciosa", new Ingredient[]{Ingredient.Skinka, Ingredient.Champinjoner}));
		group2.addPiza(new Pizza(9,  "Primavera", 	new Ingredient[]{Ingredient.Bacon, Ingredient.L�k}));
		group2.addPiza(new Pizza(10, "Orientale", 	new Ingredient[]{Ingredient.K�ttf�rss�s}));
		group2.addPiza(new Pizza(11, "Hawaii", 		new Ingredient[]{Ingredient.Skinka, Ingredient.Ananas}));
		group2.addPiza(new Pizza(12, "Dilbahar", 	new Ingredient[]{Ingredient.Skinka, Ingredient.K�ttf�rss�s}));
		group2.addPiza(new Pizza(13, "Marinara", 	new Ingredient[]{Ingredient.R�kor, Ingredient.Musslor}));
		group2.addPiza(new Pizza(14, "Vegetariana", new Ingredient[]{Ingredient.Champinjoner, Ingredient.Paprika, Ingredient.Oliver, Ingredient.L�k, Ingredient.Vitl�k, Ingredient.Kron�rtskocka}));
		group2.addPiza(new Pizza(15, "Afrikana", 	new Ingredient[]{Ingredient.Ananas, Ingredient.Banan, Ingredient.Curry}));
				
		group3.addPiza(new Pizza(16, "Quattro Stagioni", 			new Ingredient[]{Ingredient.Skinka, Ingredient.R�kor, Ingredient.Musslor, Ingredient.Champinjoner, Ingredient.Oliver, Ingredient.Kron�rtskocka}));
		group3.addPiza(new Pizza(17, "Mexicana",					new Ingredient[]{Ingredient.K�ttf�rs, Ingredient.L�k, Ingredient.Paprika}, new Type[]{Type.Stark}));
		group3.addPiza(new Pizza(18, "Calzone Special",				new Ingredient[]{Ingredient.Gorgonzola, Ingredient.K�ttf�rss�s}, new Type[]{Type.Inbakad}));
		group3.addPiza(new Pizza(19, "Daniels Special", 			new Ingredient[]{Ingredient.Champinjoner, Ingredient.R�kor, Ingredient.K�ttf�rss�s}));
		group3.addPiza(new Pizza(20, "Opera", 						new Ingredient[]{Ingredient.Skinka, Ingredient.R�kor, Ingredient.Tonfisk}));
		group3.addPiza(new Pizza(21, "Prinsessa", 					new Ingredient[]{Ingredient.Skinka, Ingredient.R�kor, Ingredient.Ananas}));
		group3.addPiza(new Pizza(22, "Pigalle", 					new Ingredient[]{Ingredient.Champinjoner, Ingredient.R�kor, Ingredient.Feferoni}));
		group3.addPiza(new Pizza(23, "Mesopotamia",					new Ingredient[]{Ingredient.L�k, Ingredient.K�ttf�rs, Ingredient.Salami}, new Type[]{Type.Stark}));
		group3.addPiza(new Pizza(24, "Disco", 						new Ingredient[]{Ingredient.Skinka, Ingredient.R�kor, Ingredient.K�ttf�rss�s}));
		group3.addPiza(new Pizza(25, "Jamaica", 					new Ingredient[]{Ingredient.Skinka, Ingredient.Champinjoner, Ingredient.R�kor}));
		group3.addPiza(new Pizza(26, "Maffioso", 					new Ingredient[]{Ingredient.Champinjoner, Ingredient.Skinka, Ingredient.Gorgonzola}));
		group3.addPiza(new Pizza(27, "Amigo", 						new Ingredient[]{Ingredient.Champinjoner, Ingredient.L�k, Ingredient.Paprika, Ingredient.K�ttf�rss�s}));
		group3.addPiza(new Pizza(28, "Vakern", 						new Ingredient[]{Ingredient.Kyckling, Ingredient.Jordn�tter}));
		group3.addPiza(new Pizza(29, "Mamma Mia", 					new Ingredient[]{Ingredient.Skinka, Ingredient.R�kor, Ingredient.Gorgonzola}, new Type[]{Type.Inbakad}));
		
		group4.addPiza(new Pizza(30, "Pizza Mexi", 			new Ingredient[]{Ingredient.K�ttf�rs, Ingredient.Tacokryddmix, Ingredient.Vitl�k, Ingredient.L�k, Ingredient.Tacos�s, Ingredient.GreenChili}));
		group4.addPiza(new Pizza(31, "Pizza Azteka", 		new Ingredient[]{Ingredient.Skinka, Ingredient.Tacokryddmix, Ingredient.Tacos�s, Ingredient.Jalapeno, Ingredient.Vitl�kss�s}));
		group4.addPiza(new Pizza(32, "Ciao-Ciao", 			new Ingredient[]{Ingredient.Champinjoner, Ingredient.Oxfile, Ingredient.L�k, Ingredient.Vitl�kss�s}));
		group4.addPiza(new Pizza(33, "Jonte", 				new Ingredient[]{Ingredient.Champinjoner, Ingredient.Ananas, Ingredient.Kebabk�tt, Ingredient.Bacon}));
		group4.addPiza(new Pizza(34, "San Marco", 			new Ingredient[]{Ingredient.L�k, Ingredient.Paprika, Ingredient.Bacon, Ingredient.Champinjoner, Ingredient.K�ttf�rss�s}));
		group4.addPiza(new Pizza(35, "Regina",	 			new Ingredient[]{Ingredient.Champinjoner, Ingredient.Oxfile, Ingredient.Bearnaises�s}));
		group4.addPiza(new Pizza(36, "Larnaca", 			new Ingredient[]{Ingredient.Bacon, Ingredient.Salami, Ingredient.R�kor, Ingredient.L�k, Ingredient.Champinjoner, Ingredient.Paprika}));
		group4.addPiza(new Pizza(37, "Bella Napoli", 		new Ingredient[]{Ingredient.Skinka, Ingredient.Paprika, Ingredient.Oxfile, Ingredient.Bearnaises�s}));
		group4.addPiza(new Pizza(38, "Kebab Pizza", 		new Ingredient[]{Ingredient.Champinjoner, Ingredient.Kebabk�tt, Ingredient.ValfriS�s}));
		group4.addPiza(new Pizza(39, "Amore", 				new Ingredient[]{Ingredient.Skinka, Ingredient.Champinjoner, Ingredient.Bacon, Ingredient.L�k, Ingredient.�gg}, new Type[]{Type.Stark}));
		group4.addPiza(new Pizza(40, "Herrljunga Special", 	new Ingredient[]{Ingredient.Oxfile, Ingredient.Gorgonzola, Ingredient.L�k}));
		
		group5.addPiza(new Pizza(41, "Lena", 								new Ingredient[]{Ingredient.L�k, Ingredient.Paprika, Ingredient.Oxfile, Ingredient.R�kor, Ingredient.Bearnaises�s}));
		group5.addPiza(new Pizza(42, "Reale", 								new Ingredient[]{Ingredient.F�rskTomat, Ingredient.L�k, Ingredient.Paprika, Ingredient.Oxfile, Ingredient.Bearnaises�s}, new Type[]{Type.HalvtInbakad}));
		group5.addPiza(new Pizza(43, "Babylon", 							new Ingredient[]{Ingredient.Skinka, Ingredient.Kebabk�tt, Ingredient.Vitl�kss�s}, new Type[]{Type.Inbakad}));
		group5.addPiza(new Pizza(44, "B�ten", 								new Ingredient[]{Ingredient.Champinjoner, Ingredient.Skinka, Ingredient.R�kor, Ingredient.Paprika, Ingredient.Bearnaises�s}, new Type[]{Type.HalvtInbakad}));
		group5.addPiza(new Pizza(45, "57:an Special", 						new Ingredient[]{Ingredient.L�k, Ingredient.Paprika, Ingredient.Champinjoner, Ingredient.Oxfile, Ingredient.Vitl�kss�s}, new Type[]{Type.Stark}));
		group5.addPiza(new Pizza(46, "Gourme", 								new Ingredient[]{Ingredient.Champinjoner, Ingredient.Paprika, Ingredient.Oxfile, Ingredient.Bearnaises�s}, new Type[]{Type.HalvtInbakad}));
		group5.addPiza(new Pizza(47, "Favoriten", 							new Ingredient[]{Ingredient.Skinka, Ingredient.L�k, Ingredient.Kebabk�tt, Ingredient.Kebabs�s}));
		group5.addPiza(new Pizza(48, "Husets Special", 						new Ingredient[]{Ingredient.Skinka, Ingredient.L�k, Ingredient.Champinjoner, Ingredient.Oxfile, Ingredient.Bearnaises�s}));
		group5.addPiza(new Pizza(49, "Tefat", 								new Ingredient[]{Ingredient.Skinka, Ingredient.Champinjoner, Ingredient.R�kor, Ingredient.Salami, Ingredient.L�k}, new Type[]{Type.Dubbelinbakad, Type.Stark}));
		group5.addPiza(new Pizza(50, "Dillans", 							new Ingredient[]{Ingredient.Champinjoner, Ingredient.L�k, Ingredient.Feferoni, Ingredient.Kebabk�tt, Ingredient.Isbergssallad, Ingredient.F�rskTomat, Ingredient.ValfriS�s}));
		group5.addPiza(new Pizza(51, "Vikingb�t", 							new Ingredient[]{Ingredient.Champinjoner, Ingredient.Feferoni, Ingredient.Kebabk�tt, Ingredient.Bearnaises�s, Ingredient.L�k}, new Type[]{Type.HalvtInbakad}));
		group5.addPiza(new Pizza(52, "Tropical Special", 					new Ingredient[]{Ingredient.Banan, Ingredient.MangoChutney, Ingredient.Kr�ftstj�rtar, Ingredient.Curry, Ingredient.Vitl�kss�s}));
		group5.addPiza(new Pizza(53, "K�r & Galen", 						new Ingredient[]{Ingredient.L�k, Ingredient.R�kor, Ingredient.K�ttf�rs, Ingredient.Kr�ftstj�rtar, Ingredient.Bearnaises�s}, new Type[]{Type.Stark}));
		group5.addPiza(new Pizza(54, "Bombey", 								new Ingredient[]{Ingredient.Jordn�tter, Ingredient.Fl�skfile, Ingredient.Banan, Ingredient.MangoChutney, Ingredient.Curry, Ingredient.StarkS�s}));
		group5.addPiza(new Pizza(55, "La Banana", 							new Ingredient[]{Ingredient.Fl�skfile, Ingredient.Ananas, Ingredient.Banan, Ingredient.Curry, Ingredient.ValfriS�s}));
		group5.addPiza(new Pizza(56, "Bagarens Special", 					new Ingredient[]{Ingredient.Skinka, Ingredient.Kebabk�tt, Ingredient.Kebabs�s, Ingredient.PommesFrites}));
		group5.addPiza(new Pizza(57, "Messina", 							new Ingredient[]{Ingredient.Kebabk�tt, Ingredient.Ananas, Ingredient.StarkS�s}));
		group5.addPiza(new Pizza(58, "Ravelli", 							new Ingredient[]{Ingredient.Kebabk�tt, Ingredient.Tacos�s, Ingredient.Jalapeno, Ingredient.L�k, Ingredient.Vitl�k, Ingredient.Kebabs�s}));
		group5.addPiza(new Pizza(59, "Malta",								new Ingredient[]{Ingredient.Ost, Ingredient.Kebabk�tt, Ingredient.L�k, Ingredient.Isbergssallad, Ingredient.Tomat, Ingredient.Gurka, Ingredient.Feferoni, Ingredient.Kebabs�s}, new Type[]{Type.Inbakad}));
		group5.addPiza(new Pizza(60, "Alpina", 								new Ingredient[]{Ingredient.Fl�skfile, Ingredient.L�k, Ingredient.Vitl�k, Ingredient.Tacos�s, Ingredient.Kebabs�s}));
		group5.addPiza(new Pizza(61, "Herkules", 							new Ingredient[]{Ingredient.Fl�skfile, Ingredient.Champinjoner, Ingredient.L�k, Ingredient.Bearnaises�s}));
		group5.addPiza(new Pizza(62, "Rimini", 								new Ingredient[]{Ingredient.Fl�skfile, Ingredient.L�k, Ingredient.Skinka, Ingredient.Bearnaises�s}));
		group5.addPiza(new Pizza(63, "Petto", 								new Ingredient[]{Ingredient.Kyckling, Ingredient.Kr�ftstj�rtar, Ingredient.Ananas, Ingredient.Banan, Ingredient.Curry, Ingredient.Jordn�tter, Ingredient.Kebabs�s}));
		group5.addPiza(new Pizza(64, "Florens", 							new Ingredient[]{Ingredient.Kyckling, Ingredient.Skinka, Ingredient.L�k, Ingredient.Tomat, Ingredient.Gurka, Ingredient.Isbergssallad, Ingredient.Feferoni, Ingredient.Kebabs�s}));
		group5.addPiza(new Pizza(65, "H�ng �ver", 							new Ingredient[]{Ingredient.L�k, Ingredient.Kebabk�tt, Ingredient.Kyckling, Ingredient.Jordn�tter, Ingredient.Kr�ftstj�rtar, Ingredient.F�rskVitl�k, Ingredient.Kebabs�s}));
		group5.addPiza(new Pizza(66, "El Peligro", 							new Ingredient[]{Ingredient.Kebabk�tt, Ingredient.K�ttf�rss�s, Ingredient.Champinjoner, Ingredient.Banan, Ingredient.Curry, Ingredient.Vitl�kss�s}));
		group5.addPiza(new Pizza(67, "Kyckling Special", 					new Ingredient[]{Ingredient.Kyckling, Ingredient.Skinka, Ingredient.Paprika, Ingredient.Ananas, Ingredient.Banan, Ingredient.N�tter, Ingredient.Curry, Ingredient.Kebabs�s}));
		group5.addPiza(new Pizza(68, "Lotta Special", 						new Ingredient[]{Ingredient.Kyckling, Ingredient.R�kor, Ingredient.L�k, Ingredient.F�rskVitl�k, Ingredient.Curry, Ingredient.Champinjoner, Ingredient.Kr�ftstj�rtar, Ingredient.Kebabs�s}));
		group5.addPiza(new Pizza(69, "Pizza Acapulco", 						new Ingredient[]{Ingredient.Oxfile, Ingredient.Tacokryddmix, Ingredient.Vitl�k, Ingredient.L�k, Ingredient.Jalapeno, Ingredient.Champinjoner, Ingredient.Tacos�s}));
		group5.addPiza(new Pizza(70, "Sofia Special", 						new Ingredient[]{Ingredient.F�rskVitl�k, Ingredient.Bacon, Ingredient.Oxfile, Ingredient.K�ttf�rss�s, Ingredient.L�k}));
		group5.addPiza(new Pizza(71, "Havets Special", 						new Ingredient[]{Ingredient.Tonfisk, Ingredient.R�kor, Ingredient.Musslor, Ingredient.Kr�ftor, Ingredient.ValfriS�s}));
		group5.addPiza(new Pizza(72, "Nina Special", 						new Ingredient[]{Ingredient.Champinjoner, Ingredient.Skinka, Ingredient.Fetaost, Ingredient.Oliver, Ingredient.Oxfile, Ingredient.Bearnaises�s}));
		group5.addPiza(new Pizza(73, "Quattro Formaggi (4 olika ostar)", 	new Ingredient[]{Ingredient.Mozzarella, Ingredient.Gorgonzola, Ingredient.Fetaost, Ingredient.Oxfile, Ingredient.F�rskTomat}));
		group5.addPiza(new Pizza(74, "BMW Special", 						new Ingredient[]{Ingredient.Kebabk�tt, Ingredient.R�L�k, Ingredient.Bearnaises�s, Ingredient.Kebabs�s}));
		group5.addPiza(new Pizza(75, "Sk�terskan", 							new Ingredient[]{Ingredient.Champinjoner, Ingredient.Paprika, Ingredient.L�k, Ingredient.Fl�skfile, Ingredient.Banan, Ingredient.Curry}, new Type[]{Type.HalvtInbakad}));
		group5.addPiza(new Pizza(76, "Medelhavet", 							new Ingredient[]{Ingredient.Bl�Musslor, Ingredient.Scampi, Ingredient.Sparris, Ingredient.Vitl�k}));
		group5.addPiza(new Pizza(77, "H.S.K", 								new Ingredient[]{Ingredient.Skinka, Ingredient.Champinjoner, Ingredient.R�kor, Ingredient.Fl�skfile, Ingredient.Bearnaises�s}));
		group5.addPiza(new Pizza(78, "UFO", 								new Ingredient[]{Ingredient.L�k, Ingredient.Paprika, Ingredient.Champinjoner, Ingredient.Vitl�k, Ingredient.Fl�skfile}, new Type[]{Type.Dubbelinbakad}));
		group5.addPiza(new Pizza(79, "Black & White",						new Ingredient[]{Ingredient.Skinka, Ingredient.Champinjoner, Ingredient.Oxfile, Ingredient.Fl�skfile, Ingredient.Bearnaises�s}));
		group5.addPiza(new Pizza(80, "Gabriel", 							new Ingredient[]{Ingredient.Fl�skfile, Ingredient.Banan, Ingredient.Ananas, Ingredient.Jordn�tter, Ingredient.Curry}, new Type[]{Type.HalvtInbakad}));
		
		group6.addPiza(new Pizza("Le Chef", 	new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.SoltorkadeTomater, Ingredient.Parmaskinka, Ingredient.Ruccolasallad}));
		group6.addPiza(new Pizza("Musti", 		new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.Vitl�k, Ingredient.SoltorkadeTomater, Ingredient.Parmaskinka, Ingredient.Mortadella, Ingredient.Pepparsalami}));
		group6.addPiza(new Pizza("Vatikan", 	new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.Champinjoner, Ingredient.Oxfile, Ingredient.F�rskTomat, Ingredient.Bearnaises�s}));
		group6.addPiza(new Pizza("Bogart", 		new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.Champinjoner, Ingredient.Fl�skfile, Ingredient.L�k, Ingredient.F�rskTomat, Ingredient.Bearnaises�s}));
		group6.addPiza(new Pizza("Chisto", 		new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.L�k, Ingredient.Feferoni, Ingredient.Cayennepeppar, Ingredient.Pepparsalami}));
		group6.addPiza(new Pizza("Izo", 		new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.SoltorkadeTomater, Ingredient.Parmaskinka, Ingredient.Pesto, Ingredient.Ruccolasallad}));
		group6.addPiza(new Pizza("Parma", 		new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.Champinjoner, Ingredient.Oliver, Ingredient.Parmaskinka, Ingredient.Ruccolasallad}));
		group6.addPiza(new Pizza("Ruccola", 	new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.F�rskTomat, Ingredient.Ruccolasallad, Ingredient.Olivolja, Ingredient.Champinjoner, Ingredient.Oliver}));
		group6.addPiza(new Pizza("Fanny", 		new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.Paprika, Ingredient.Champinjoner, Ingredient.Parmaskinka, Ingredient.Mortadella}));
		group6.addPiza(new Pizza("Sinatra", 	new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.Champinjoner, Ingredient.Paprika, Ingredient.L�k, Ingredient.Fl�skfile, Ingredient.Bearnaises�s}, new Type[]{Type.HalvtInbakad}));
		group6.addPiza(new Pizza("Italiens", 	new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.Skinka, Ingredient.Champinjoner, Ingredient.F�rskTomat}));
		
		groups.add(group1);
		groups.add(group2);
		groups.add(group3);
		groups.add(group4);
		groups.add(group5);
		groups.add(group6);
		
		return groups;
	}
	
}
