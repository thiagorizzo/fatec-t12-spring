package com.fatec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.fatec.controllers.contract.IClienteService;
import com.fatec.models.Cliente;
import com.fatec.repositories.IClienteRepository;

@Service
public class ClienteService implements IClienteService {
	
	@Autowired
	private IClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> listClientes() {
		return clienteRepository.findAll();
	}

	@Override
	public Optional<Cliente> getByCodigo(int codigo) {
		return clienteRepository.findById(codigo);
	}
}
	
