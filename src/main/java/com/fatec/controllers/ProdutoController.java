package com.fatec.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fatec.components.ILoggerComponent;
import com.fatec.controllers.contract.IProdutoService;
import com.fatec.models.Produto;

public class ProdutoController extends ControllerBase {
	
	@Autowired
	private IProdutoService produtoService;
	
	@Autowired
	private ILoggerComponent loggerComponent;
	
	public ProdutoController() {
		super("ProdutoController");
		loggerComponent.setController(this);
	}
	
	@GetMapping
	public ResponseEntity<List<Produto>> listClientes() throws IOException {
		try {
			List<Produto> produtos = produtoService.listProdutos();
			return new ResponseEntity<List<Produto>>(produtos, HttpStatus.OK);
		} catch(Exception ex) {
			loggerComponent.error(ex.getMessage());
			return null;
		}
	}

	@GetMapping(path = "/{codigo}")
	public ResponseEntity<Optional<Produto>> getProduto(@PathVariable("codigo") int codigo) {
		Optional<Produto> produto = produtoService.getByCodigo(codigo);
		return new ResponseEntity<Optional<Produto>>(produto, HttpStatus.OK);
	}
}
