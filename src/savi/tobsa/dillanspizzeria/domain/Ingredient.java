package savi.tobsa.dillanspizzeria.domain;

import java.util.Locale;

public enum Ingredient {
	Ananas,
	
	Bacon,
	Banan,
	Bearnaises�s,
	Bl�Musslor("Bl� Musslor"),
	
	Cayennepeppar,
	Champinjoner,
	Curry,
	
	Feferoni,
	Fetaost,
	Fl�skfile("Fl�skfil�"),
	F�rskTomat("F�rsk Tomat"),
	F�rskVitl�k("F�rsk Vitl�k"),
	
	Gorgonzola,
	GreenChili("Green Chili"),
	Gurka,
	
	Isbergssallad,
	
	Jalapeno,
	Jordn�tter,
	
	Kebabk�tt,
	Kebabs�s,
	Kron�rtskocka,
	Kr�ftor,
	Kr�ftstj�rtar,
	Kyckling,
	K�ttf�rs,
	K�ttf�rss�s,

	L�k,
	
	MangoChutney("Mango Chutney"),
	Mortadella,
	Mozzarella,
	Musslor,
	
	N�tter,
	
	Oliver,
	Olivolja,
	Ost,
	Oxfile("Oxfil�"),
	
	Paprika,
	Parmaskinka,
	Pepparsalami,
	Pesto,
	PommesFrites("Pommes Frites"),
	
	Ruccolasallad,
	R�L�k("R� L�k"),
	R�kor,
	
	Salami,
	Scampi,
	Skinka,
	SoltorkadeTomater("Soltorkade Tomater"),
	Sparris,
	StarkS�s("Stark S�s"),
	
	Tacokryddmix,
	Tacos�s,
	Tomat,
	Tonfisk,
	
	
	ValfriS�s("Valfri S�s"),
	Vitl�k,
	Vitl�kss�s,

	�gg,
	
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


