package com.fatec.controllers;

public abstract class ControllerBase {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ControllerBase(String nome) {
		super();
		this.nome = nome;
	}
}
