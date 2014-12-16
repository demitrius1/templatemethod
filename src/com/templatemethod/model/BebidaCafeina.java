package com.templatemethod.model;

public abstract class BebidaCafeina {

	final void prepararReceita() {
		ferverAgua();
		adicionarCafe();
		colocarNaXicara();
		adicionarElemento();
	}

	abstract void adicionarCafe();
	abstract void adicionarElemento();

	public void ferverAgua() {
		System.out.println("Ferver agua");
	}

	public void colocarNaXicara() {
		System.out.println("Colocar na xicara");
	}
} 