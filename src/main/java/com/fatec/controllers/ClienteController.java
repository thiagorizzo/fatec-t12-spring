package com.fatec.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.controllers.contract.IClienteService;
import com.fatec.models.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private IClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> listClientes() {
		List<Cliente> clientes = clienteService.listClientes();
		return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
	}

	@GetMapping(path = "/{codigo}")
	public ResponseEntity<Optional<Cliente>> getCliente(@PathVariable("codigo") int codigo) {
		Optional<Cliente> cliente = clienteService.getByCodigo(codigo);
		return new ResponseEntity<Optional<Cliente>>(cliente, HttpStatus.OK);
	}
	
	
	
	@PostMapping
	public void createCliente(Cliente cliente) {
		
	}	
}
