package com.fatec.controllers.contract;

import java.util.List;
import java.util.Optional;

import com.fatec.models.Cliente;

public interface IClienteService {
	List<Cliente> listClientes();
	Optional<Cliente> getByCodigo(int codigo);
}
