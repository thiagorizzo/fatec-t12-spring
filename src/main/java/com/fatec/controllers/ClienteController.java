package com.fatec.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.components.ILoggerComponent;
import com.fatec.controllers.contract.IClienteService;
import com.fatec.models.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController extends ControllerBase {

	@Autowired // Injeção por atributo
	private IClienteService clienteService;
	
	private ILoggerComponent loggerComponent;

	@Autowired // Injeção por construtor
	public ClienteController(ILoggerComponent loggerComponent) {
		super("ClienteController");

		this.loggerComponent = loggerComponent;
		
		// loggerComponent deve ser prototype, pois cada controller terá
		// uma instância separada
		loggerComponent.setController(this); 
	}

	@GetMapping
	public ResponseEntity<List<Cliente>> listClientes() throws IOException {
		try {
			List<Cliente> clientes = clienteService.listClientes();
			return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
		} catch(Exception ex) {
			loggerComponent.error(ex.getMessage());
			return null;
		}
	}
	
	@PostMapping
	public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) throws IOException {
		try {
			Cliente novoCliente = clienteService.create(cliente);
			return new ResponseEntity<Cliente>(novoCliente, HttpStatus.OK);
		} catch(Exception ex) {
			loggerComponent.error(ex.getMessage());
			return null;
		}
	}
	
	@PutMapping
	public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente) throws IOException {
		try {
			Cliente clienteAtualizado = clienteService.update(cliente);
			return new ResponseEntity<Cliente>(clienteAtualizado, HttpStatus.OK);
		} catch(Exception ex) {
			loggerComponent.error(ex.getMessage());
			return null;
		}
	}
	
	@DeleteMapping
	public ResponseEntity deleteCliente(@RequestBody Cliente cliente) throws IOException {
		try {
			clienteService.remove(cliente);
			return new ResponseEntity(HttpStatus.OK);
		} catch(Exception ex) {
			loggerComponent.error(ex.getMessage());
			return null;
		}
	}	
	
	@GetMapping(path = "/{codigo}")
	public ResponseEntity<Optional<Cliente>> getCliente(@PathVariable("codigo") int codigo) {
		Optional<Cliente> cliente = clienteService.getByCodigo(codigo);
		return new ResponseEntity<Optional<Cliente>>(cliente, HttpStatus.OK);
	}
	
	// http://localhost/cliente/thiago/nome  -> @GetMapping(path = "{nome}/nome")
	// http://localhost/cliente/nome/thiago -> @GetMapping(path = "nome/{nome}")
	
	@GetMapping(path = "{nome}/nome")
	public ResponseEntity<List<Cliente>> listByNome(@PathVariable("nome") String nome) throws IOException {
		try {
			List<Cliente> clientes = clienteService.listByNome(nome);
			return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
		} catch(Exception ex) {
			loggerComponent.error(ex.getMessage());
			return null;
		}
	}
}
