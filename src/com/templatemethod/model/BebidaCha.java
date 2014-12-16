package com.templatemethod.model;

public abstract class BebidaCha {

	final void preparaReceita() {
		ferverAgua();
		adicionarCha();
		colocarNaXicara();
		adicionarElemento();
	}

	abstract void adicionarCha();
	abstract void adicionarElemento();

	public void ferverAgua() {
		
	}

	public void colocarNaXicara() {
		
	}
}