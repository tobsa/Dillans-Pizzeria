package savi.tobsa.dillanspizzeria.domain;

import java.util.Locale;

public enum Type {
	Standard,
	Inbakad,
	Stark,
	HalvtInbakad("halvt inbakad"),
	Dubbelinbakad;
	
	private final String toString;
	
	private Type() {
		toString = this.name().toLowerCase(Locale.getDefault());
	}
	
	private Type(String toString) {
		this.toString = toString.toLowerCase(Locale.getDefault());
	}
	
	@Override
	public String toString() {
		return toString;
	}
}
