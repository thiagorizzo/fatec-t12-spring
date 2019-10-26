package com.fatec.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@PostMapping
	public void createCliente(Cliente cliente) {
		
	}	
}
