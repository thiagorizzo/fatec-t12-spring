package com.fatec.controllers.contract;

import java.util.List;
import java.util.Optional;

import com.fatec.models.Produto;

public interface IProdutoService {
	List<Produto> listProdutos();
	Optional<Produto> getByCodigo(int codigo);
}
