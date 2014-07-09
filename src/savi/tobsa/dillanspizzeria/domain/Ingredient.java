package savi.tobsa.dillanspizzeria.domain;

import java.util.Locale;

public enum Ingredient {
	Ananas,
	
	Bacon,
	Banan,
	Bearnaisesås,
	BlåMusslor("Blå Musslor"),
	
	Cayennepeppar,
	Champinjoner,
	Curry,
	
	Feferoni,
	Fetaost,
	Fläskfile("Fläskfilé"),
	FärskTomat("Färsk Tomat"),
	FärskVitlök("Färsk Vitlök"),
	
	Gorgonzola,
	GreenChili("Green Chili"),
	Gurka,
	
	Isbergssallad,
	
	Jalapeno,
	Jordnötter,
	
	Kebabkött,
	Kebabsås,
	Kronärtskocka,
	Kräftor,
	Kräftstjärtar,
	Kyckling,
	Köttfärs,
	Köttfärssås,

	Lök,
	
	MangoChutney("Mango Chutney"),
	Mortadella,
	Mozzarella,
	Musslor,
	
	Nötter,
	
	Oliver,
	Olivolja,
	Ost,
	Oxfile("Oxfilé"),
	
	Paprika,
	Parmaskinka,
	Pepparsalami,
	Pesto,
	PommesFrites("Pommes Frites"),
	
	Ruccolasallad,
	RåLök("Rå Lök"),
	Räkor,
	
	Salami,
	Scampi,
	Skinka,
	SoltorkadeTomater("Soltorkade Tomater"),
	Sparris,
	StarkSås("Stark Sås"),
	
	Tacokryddmix,
	Tacosås,
	Tomat,
	Tonfisk,
	
	
	ValfriSås("Valfri Sås"),
	Vitlök,
	Vitlökssås,

	Ägg,
	
	;
	
	private final String toString;
		
	private Ingredient() {
		toString = this.name().toLowerCase(Locale.getDefault());
	}
	
	private Ingredient(String toString) {
		this.toString = toString.toLowerCase(Locale.getDefault());
	}
	
	@Override
	public String toString() {
		return toString;
	}
}


