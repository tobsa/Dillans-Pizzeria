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
		
		group2.addPiza(new Pizza(7,  "Tomasso", 	new Ingredient[]{Ingredient.Skinka, Ingredient.Räkor}));
		group2.addPiza(new Pizza(8,  "Capricciosa", new Ingredient[]{Ingredient.Skinka, Ingredient.Champinjoner}));
		group2.addPiza(new Pizza(9,  "Primavera", 	new Ingredient[]{Ingredient.Bacon, Ingredient.Lök}));
		group2.addPiza(new Pizza(10, "Orientale", 	new Ingredient[]{Ingredient.Köttfärssås}));
		group2.addPiza(new Pizza(11, "Hawaii", 		new Ingredient[]{Ingredient.Skinka, Ingredient.Ananas}));
		group2.addPiza(new Pizza(12, "Dilbahar", 	new Ingredient[]{Ingredient.Skinka, Ingredient.Köttfärssås}));
		group2.addPiza(new Pizza(13, "Marinara", 	new Ingredient[]{Ingredient.Räkor, Ingredient.Musslor}));
		group2.addPiza(new Pizza(14, "Vegetariana", new Ingredient[]{Ingredient.Champinjoner, Ingredient.Paprika, Ingredient.Oliver, Ingredient.Lök, Ingredient.Vitlök, Ingredient.Kronärtskocka}));
		group2.addPiza(new Pizza(15, "Afrikana", 	new Ingredient[]{Ingredient.Ananas, Ingredient.Banan, Ingredient.Curry}));
				
		group3.addPiza(new Pizza(16, "Quattro Stagioni", 			new Ingredient[]{Ingredient.Skinka, Ingredient.Räkor, Ingredient.Musslor, Ingredient.Champinjoner, Ingredient.Oliver, Ingredient.Kronärtskocka}));
		group3.addPiza(new Pizza(17, "Mexicana",					new Ingredient[]{Ingredient.Köttfärs, Ingredient.Lök, Ingredient.Paprika}, new Type[]{Type.Stark}));
		group3.addPiza(new Pizza(18, "Calzone Special",				new Ingredient[]{Ingredient.Gorgonzola, Ingredient.Köttfärssås}, new Type[]{Type.Inbakad}));
		group3.addPiza(new Pizza(19, "Daniels Special", 			new Ingredient[]{Ingredient.Champinjoner, Ingredient.Räkor, Ingredient.Köttfärssås}));
		group3.addPiza(new Pizza(20, "Opera", 						new Ingredient[]{Ingredient.Skinka, Ingredient.Räkor, Ingredient.Tonfisk}));
		group3.addPiza(new Pizza(21, "Prinsessa", 					new Ingredient[]{Ingredient.Skinka, Ingredient.Räkor, Ingredient.Ananas}));
		group3.addPiza(new Pizza(22, "Pigalle", 					new Ingredient[]{Ingredient.Champinjoner, Ingredient.Räkor, Ingredient.Feferoni}));
		group3.addPiza(new Pizza(23, "Mesopotamia",					new Ingredient[]{Ingredient.Lök, Ingredient.Köttfärs, Ingredient.Salami}, new Type[]{Type.Stark}));
		group3.addPiza(new Pizza(24, "Disco", 						new Ingredient[]{Ingredient.Skinka, Ingredient.Räkor, Ingredient.Köttfärssås}));
		group3.addPiza(new Pizza(25, "Jamaica", 					new Ingredient[]{Ingredient.Skinka, Ingredient.Champinjoner, Ingredient.Räkor}));
		group3.addPiza(new Pizza(26, "Maffioso", 					new Ingredient[]{Ingredient.Champinjoner, Ingredient.Skinka, Ingredient.Gorgonzola}));
		group3.addPiza(new Pizza(27, "Amigo", 						new Ingredient[]{Ingredient.Champinjoner, Ingredient.Lök, Ingredient.Paprika, Ingredient.Köttfärssås}));
		group3.addPiza(new Pizza(28, "Vakern", 						new Ingredient[]{Ingredient.Kyckling, Ingredient.Jordnötter}));
		group3.addPiza(new Pizza(29, "Mamma Mia", 					new Ingredient[]{Ingredient.Skinka, Ingredient.Räkor, Ingredient.Gorgonzola}, new Type[]{Type.Inbakad}));
		
		group4.addPiza(new Pizza(30, "Pizza Mexi", 			new Ingredient[]{Ingredient.Köttfärs, Ingredient.Tacokryddmix, Ingredient.Vitlök, Ingredient.Lök, Ingredient.Tacosås, Ingredient.GreenChili}));
		group4.addPiza(new Pizza(31, "Pizza Azteka", 		new Ingredient[]{Ingredient.Skinka, Ingredient.Tacokryddmix, Ingredient.Tacosås, Ingredient.Jalapeno, Ingredient.Vitlökssås}));
		group4.addPiza(new Pizza(32, "Ciao-Ciao", 			new Ingredient[]{Ingredient.Champinjoner, Ingredient.Oxfile, Ingredient.Lök, Ingredient.Vitlökssås}));
		group4.addPiza(new Pizza(33, "Jonte", 				new Ingredient[]{Ingredient.Champinjoner, Ingredient.Ananas, Ingredient.Kebabkött, Ingredient.Bacon}));
		group4.addPiza(new Pizza(34, "San Marco", 			new Ingredient[]{Ingredient.Lök, Ingredient.Paprika, Ingredient.Bacon, Ingredient.Champinjoner, Ingredient.Köttfärssås}));
		group4.addPiza(new Pizza(35, "Regina",	 			new Ingredient[]{Ingredient.Champinjoner, Ingredient.Oxfile, Ingredient.Bearnaisesås}));
		group4.addPiza(new Pizza(36, "Larnaca", 			new Ingredient[]{Ingredient.Bacon, Ingredient.Salami, Ingredient.Räkor, Ingredient.Lök, Ingredient.Champinjoner, Ingredient.Paprika}));
		group4.addPiza(new Pizza(37, "Bella Napoli", 		new Ingredient[]{Ingredient.Skinka, Ingredient.Paprika, Ingredient.Oxfile, Ingredient.Bearnaisesås}));
		group4.addPiza(new Pizza(38, "Kebab Pizza", 		new Ingredient[]{Ingredient.Champinjoner, Ingredient.Kebabkött, Ingredient.ValfriSås}));
		group4.addPiza(new Pizza(39, "Amore", 				new Ingredient[]{Ingredient.Skinka, Ingredient.Champinjoner, Ingredient.Bacon, Ingredient.Lök, Ingredient.Ägg}, new Type[]{Type.Stark}));
		group4.addPiza(new Pizza(40, "Herrljunga Special", 	new Ingredient[]{Ingredient.Oxfile, Ingredient.Gorgonzola, Ingredient.Lök}));
		
		group5.addPiza(new Pizza(41, "Lena", 								new Ingredient[]{Ingredient.Lök, Ingredient.Paprika, Ingredient.Oxfile, Ingredient.Räkor, Ingredient.Bearnaisesås}));
		group5.addPiza(new Pizza(42, "Reale", 								new Ingredient[]{Ingredient.FärskTomat, Ingredient.Lök, Ingredient.Paprika, Ingredient.Oxfile, Ingredient.Bearnaisesås}, new Type[]{Type.HalvtInbakad}));
		group5.addPiza(new Pizza(43, "Babylon", 							new Ingredient[]{Ingredient.Skinka, Ingredient.Kebabkött, Ingredient.Vitlökssås}, new Type[]{Type.Inbakad}));
		group5.addPiza(new Pizza(44, "Båten", 								new Ingredient[]{Ingredient.Champinjoner, Ingredient.Skinka, Ingredient.Räkor, Ingredient.Paprika, Ingredient.Bearnaisesås}, new Type[]{Type.HalvtInbakad}));
		group5.addPiza(new Pizza(45, "57:an Special", 						new Ingredient[]{Ingredient.Lök, Ingredient.Paprika, Ingredient.Champinjoner, Ingredient.Oxfile, Ingredient.Vitlökssås}, new Type[]{Type.Stark}));
		group5.addPiza(new Pizza(46, "Gourme", 								new Ingredient[]{Ingredient.Champinjoner, Ingredient.Paprika, Ingredient.Oxfile, Ingredient.Bearnaisesås}, new Type[]{Type.HalvtInbakad}));
		group5.addPiza(new Pizza(47, "Favoriten", 							new Ingredient[]{Ingredient.Skinka, Ingredient.Lök, Ingredient.Kebabkött, Ingredient.Kebabsås}));
		group5.addPiza(new Pizza(48, "Husets Special", 						new Ingredient[]{Ingredient.Skinka, Ingredient.Lök, Ingredient.Champinjoner, Ingredient.Oxfile, Ingredient.Bearnaisesås}));
		group5.addPiza(new Pizza(49, "Tefat", 								new Ingredient[]{Ingredient.Skinka, Ingredient.Champinjoner, Ingredient.Räkor, Ingredient.Salami, Ingredient.Lök}, new Type[]{Type.Dubbelinbakad, Type.Stark}));
		group5.addPiza(new Pizza(50, "Dillans", 							new Ingredient[]{Ingredient.Champinjoner, Ingredient.Lök, Ingredient.Feferoni, Ingredient.Kebabkött, Ingredient.Isbergssallad, Ingredient.FärskTomat, Ingredient.ValfriSås}));
		group5.addPiza(new Pizza(51, "Vikingbåt", 							new Ingredient[]{Ingredient.Champinjoner, Ingredient.Feferoni, Ingredient.Kebabkött, Ingredient.Bearnaisesås, Ingredient.Lök}, new Type[]{Type.HalvtInbakad}));
		group5.addPiza(new Pizza(52, "Tropical Special", 					new Ingredient[]{Ingredient.Banan, Ingredient.MangoChutney, Ingredient.Kräftstjärtar, Ingredient.Curry, Ingredient.Vitlökssås}));
		group5.addPiza(new Pizza(53, "Kär & Galen", 						new Ingredient[]{Ingredient.Lök, Ingredient.Räkor, Ingredient.Köttfärs, Ingredient.Kräftstjärtar, Ingredient.Bearnaisesås}, new Type[]{Type.Stark}));
		group5.addPiza(new Pizza(54, "Bombey", 								new Ingredient[]{Ingredient.Jordnötter, Ingredient.Fläskfile, Ingredient.Banan, Ingredient.MangoChutney, Ingredient.Curry, Ingredient.StarkSås}));
		group5.addPiza(new Pizza(55, "La Banana", 							new Ingredient[]{Ingredient.Fläskfile, Ingredient.Ananas, Ingredient.Banan, Ingredient.Curry, Ingredient.ValfriSås}));
		group5.addPiza(new Pizza(56, "Bagarens Special", 					new Ingredient[]{Ingredient.Skinka, Ingredient.Kebabkött, Ingredient.Kebabsås, Ingredient.PommesFrites}));
		group5.addPiza(new Pizza(57, "Messina", 							new Ingredient[]{Ingredient.Kebabkött, Ingredient.Ananas, Ingredient.StarkSås}));
		group5.addPiza(new Pizza(58, "Ravelli", 							new Ingredient[]{Ingredient.Kebabkött, Ingredient.Tacosås, Ingredient.Jalapeno, Ingredient.Lök, Ingredient.Vitlök, Ingredient.Kebabsås}));
		group5.addPiza(new Pizza(59, "Malta",								new Ingredient[]{Ingredient.Ost, Ingredient.Kebabkött, Ingredient.Lök, Ingredient.Isbergssallad, Ingredient.Tomat, Ingredient.Gurka, Ingredient.Feferoni, Ingredient.Kebabsås}, new Type[]{Type.Inbakad}));
		group5.addPiza(new Pizza(60, "Alpina", 								new Ingredient[]{Ingredient.Fläskfile, Ingredient.Lök, Ingredient.Vitlök, Ingredient.Tacosås, Ingredient.Kebabsås}));
		group5.addPiza(new Pizza(61, "Herkules", 							new Ingredient[]{Ingredient.Fläskfile, Ingredient.Champinjoner, Ingredient.Lök, Ingredient.Bearnaisesås}));
		group5.addPiza(new Pizza(62, "Rimini", 								new Ingredient[]{Ingredient.Fläskfile, Ingredient.Lök, Ingredient.Skinka, Ingredient.Bearnaisesås}));
		group5.addPiza(new Pizza(63, "Petto", 								new Ingredient[]{Ingredient.Kyckling, Ingredient.Kräftstjärtar, Ingredient.Ananas, Ingredient.Banan, Ingredient.Curry, Ingredient.Jordnötter, Ingredient.Kebabsås}));
		group5.addPiza(new Pizza(64, "Florens", 							new Ingredient[]{Ingredient.Kyckling, Ingredient.Skinka, Ingredient.Lök, Ingredient.Tomat, Ingredient.Gurka, Ingredient.Isbergssallad, Ingredient.Feferoni, Ingredient.Kebabsås}));
		group5.addPiza(new Pizza(65, "Häng Över", 							new Ingredient[]{Ingredient.Lök, Ingredient.Kebabkött, Ingredient.Kyckling, Ingredient.Jordnötter, Ingredient.Kräftstjärtar, Ingredient.FärskVitlök, Ingredient.Kebabsås}));
		group5.addPiza(new Pizza(66, "El Peligro", 							new Ingredient[]{Ingredient.Kebabkött, Ingredient.Köttfärssås, Ingredient.Champinjoner, Ingredient.Banan, Ingredient.Curry, Ingredient.Vitlökssås}));
		group5.addPiza(new Pizza(67, "Kyckling Special", 					new Ingredient[]{Ingredient.Kyckling, Ingredient.Skinka, Ingredient.Paprika, Ingredient.Ananas, Ingredient.Banan, Ingredient.Nötter, Ingredient.Curry, Ingredient.Kebabsås}));
		group5.addPiza(new Pizza(68, "Lotta Special", 						new Ingredient[]{Ingredient.Kyckling, Ingredient.Räkor, Ingredient.Lök, Ingredient.FärskVitlök, Ingredient.Curry, Ingredient.Champinjoner, Ingredient.Kräftstjärtar, Ingredient.Kebabsås}));
		group5.addPiza(new Pizza(69, "Pizza Acapulco", 						new Ingredient[]{Ingredient.Oxfile, Ingredient.Tacokryddmix, Ingredient.Vitlök, Ingredient.Lök, Ingredient.Jalapeno, Ingredient.Champinjoner, Ingredient.Tacosås}));
		group5.addPiza(new Pizza(70, "Sofia Special", 						new Ingredient[]{Ingredient.FärskVitlök, Ingredient.Bacon, Ingredient.Oxfile, Ingredient.Köttfärssås, Ingredient.Lök}));
		group5.addPiza(new Pizza(71, "Havets Special", 						new Ingredient[]{Ingredient.Tonfisk, Ingredient.Räkor, Ingredient.Musslor, Ingredient.Kräftor, Ingredient.ValfriSås}));
		group5.addPiza(new Pizza(72, "Nina Special", 						new Ingredient[]{Ingredient.Champinjoner, Ingredient.Skinka, Ingredient.Fetaost, Ingredient.Oliver, Ingredient.Oxfile, Ingredient.Bearnaisesås}));
		group5.addPiza(new Pizza(73, "Quattro Formaggi (4 olika ostar)", 	new Ingredient[]{Ingredient.Mozzarella, Ingredient.Gorgonzola, Ingredient.Fetaost, Ingredient.Oxfile, Ingredient.FärskTomat}));
		group5.addPiza(new Pizza(74, "BMW Special", 						new Ingredient[]{Ingredient.Kebabkött, Ingredient.RåLök, Ingredient.Bearnaisesås, Ingredient.Kebabsås}));
		group5.addPiza(new Pizza(75, "Sköterskan", 							new Ingredient[]{Ingredient.Champinjoner, Ingredient.Paprika, Ingredient.Lök, Ingredient.Fläskfile, Ingredient.Banan, Ingredient.Curry}, new Type[]{Type.HalvtInbakad}));
		group5.addPiza(new Pizza(76, "Medelhavet", 							new Ingredient[]{Ingredient.BlåMusslor, Ingredient.Scampi, Ingredient.Sparris, Ingredient.Vitlök}));
		group5.addPiza(new Pizza(77, "H.S.K", 								new Ingredient[]{Ingredient.Skinka, Ingredient.Champinjoner, Ingredient.Räkor, Ingredient.Fläskfile, Ingredient.Bearnaisesås}));
		group5.addPiza(new Pizza(78, "UFO", 								new Ingredient[]{Ingredient.Lök, Ingredient.Paprika, Ingredient.Champinjoner, Ingredient.Vitlök, Ingredient.Fläskfile}, new Type[]{Type.Dubbelinbakad}));
		group5.addPiza(new Pizza(79, "Black & White",						new Ingredient[]{Ingredient.Skinka, Ingredient.Champinjoner, Ingredient.Oxfile, Ingredient.Fläskfile, Ingredient.Bearnaisesås}));
		group5.addPiza(new Pizza(80, "Gabriel", 							new Ingredient[]{Ingredient.Fläskfile, Ingredient.Banan, Ingredient.Ananas, Ingredient.Jordnötter, Ingredient.Curry}, new Type[]{Type.HalvtInbakad}));
		
		group6.addPiza(new Pizza("Le Chef", 	new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.SoltorkadeTomater, Ingredient.Parmaskinka, Ingredient.Ruccolasallad}));
		group6.addPiza(new Pizza("Musti", 		new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.Vitlök, Ingredient.SoltorkadeTomater, Ingredient.Parmaskinka, Ingredient.Mortadella, Ingredient.Pepparsalami}));
		group6.addPiza(new Pizza("Vatikan", 	new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.Champinjoner, Ingredient.Oxfile, Ingredient.FärskTomat, Ingredient.Bearnaisesås}));
		group6.addPiza(new Pizza("Bogart", 		new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.Champinjoner, Ingredient.Fläskfile, Ingredient.Lök, Ingredient.FärskTomat, Ingredient.Bearnaisesås}));
		group6.addPiza(new Pizza("Chisto", 		new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.Lök, Ingredient.Feferoni, Ingredient.Cayennepeppar, Ingredient.Pepparsalami}));
		group6.addPiza(new Pizza("Izo", 		new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.SoltorkadeTomater, Ingredient.Parmaskinka, Ingredient.Pesto, Ingredient.Ruccolasallad}));
		group6.addPiza(new Pizza("Parma", 		new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.Champinjoner, Ingredient.Oliver, Ingredient.Parmaskinka, Ingredient.Ruccolasallad}));
		group6.addPiza(new Pizza("Ruccola", 	new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.FärskTomat, Ingredient.Ruccolasallad, Ingredient.Olivolja, Ingredient.Champinjoner, Ingredient.Oliver}));
		group6.addPiza(new Pizza("Fanny", 		new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.Paprika, Ingredient.Champinjoner, Ingredient.Parmaskinka, Ingredient.Mortadella}));
		group6.addPiza(new Pizza("Sinatra", 	new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.Champinjoner, Ingredient.Paprika, Ingredient.Lök, Ingredient.Fläskfile, Ingredient.Bearnaisesås}, new Type[]{Type.HalvtInbakad}));
		group6.addPiza(new Pizza("Italiens", 	new Ingredient[]{Ingredient.Tomat, Ingredient.Mozzarella, Ingredient.Skinka, Ingredient.Champinjoner, Ingredient.FärskTomat}));
		
		groups.add(group1);
		groups.add(group2);
		groups.add(group3);
		groups.add(group4);
		groups.add(group5);
		groups.add(group6);
		
		return groups;
	}
	
}
