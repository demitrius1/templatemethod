package com.templatemethod.model;

public abstract class Tecido {

	final void produzirCamisa() {
		medirTecido();
		cortarTecido();
		costurarTecido();
		pregarBotoes();
	}

	abstract void cortarTecido();
	abstract void pregarBotoes();

	public void medirTecido() {
		System.out.println("Medir tecido");
	}

	public void costurarTecido() {
		System.out.println("Costurar tecido");
	}
} 