package com.fatec.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.models.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@GetMapping
	public ResponseEntity<List<Cliente>> listClientes() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cliente1 = new Cliente() {{
			setCodigo(1);
			setNome("thiago");
		}};
		Cliente cliente2 = new Cliente() {{
			setCodigo(2);
			setNome("maria");
		}};
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		
		return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
	}
	
	@PostMapping
	public void createCliente(Cliente cliente) {
		
	}	
}
