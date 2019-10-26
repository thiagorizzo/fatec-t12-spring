package com.fatec.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sun.istack.NotNull;

@Entity
public class ItemPedido {
	@Id
	@GeneratedValue
	private int codigo;
	
	@NotNull
	private int quantidade;
	
	@ManyToOne
	@JoinColumn(name="cod_pedido")
	private Pedido pedido;

	@ManyToOne
	@JoinColumn(name="cod_produto")
	private Produto produto;
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
