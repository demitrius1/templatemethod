package com.templatemethod.model;

public abstract class Couro {

	final void produzirCasaco() {
		medirCouro();
		cortarCouro();
		costurarCouro();
		pregarBotoes();
	}

	abstract void cortarCouro();
	abstract void pregarBotoes();

	public void medirCouro() {
		System.out.println("Medir couro");
	}

	public void costurarCouro() {
		System.out.println("Costurar couro");
	}
}