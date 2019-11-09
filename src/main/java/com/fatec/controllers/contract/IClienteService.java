package com.fatec.controllers.contract;

import java.util.List;
import java.util.Optional;

import com.fatec.models.Cliente;

public interface IClienteService {
	Cliente update(Cliente cliente);
	void remove(Cliente cliente);
	Cliente create(Cliente cliente);
	List<Cliente> listClientes();
	Optional<Cliente> getByCodigo(int codigo);
	List<Cliente> listByNome(String nome);
}
