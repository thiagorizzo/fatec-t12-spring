package com.fatec.controllers;

public abstract class Controller {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Controller(String nome) {
		super();
		this.nome = nome;
	}
}
