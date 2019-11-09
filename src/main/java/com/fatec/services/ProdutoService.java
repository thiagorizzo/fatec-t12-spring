package com.fatec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fatec.controllers.contract.IProdutoService;
import com.fatec.models.Produto;
import com.fatec.repositories.IProdutoRepository;

public class ProdutoService implements IProdutoService {

	@Autowired
	private IProdutoRepository produtoRepository;
	
	@Override
	public List<Produto> listProdutos() {
		return produtoRepository.findAll();
	}

	@Override
	public Optional<Produto> getByCodigo(int codigo) {
		return produtoRepository.findById(codigo);
	}
}
