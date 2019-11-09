package com.fatec.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.controllers.contract.IClienteService;
import com.fatec.models.Cliente;
import com.fatec.repositories.IClienteRepository;

// "empty" é o nome qualificador para injeção de dependência
@Service("empty")
public class ClienteServiceEmpty implements IClienteService {
	
	
	@Override
	public List<Cliente> listClientes() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		return clientes;
	}

	@Override
	public Optional<Cliente> getByCodigo(int codigo) {
		return null;
	}
	
	@Override
	public List<Cliente> listByNome(String nome) {
		return null;
	}
	
	@Override
	public Cliente create(Cliente cliente) {
		return null;
	}
	
	@Override
	public void remove(Cliente cliente) {
		
	}

	@Override
	public Cliente update(Cliente cliente) {
		return null;
	}	
}
	
