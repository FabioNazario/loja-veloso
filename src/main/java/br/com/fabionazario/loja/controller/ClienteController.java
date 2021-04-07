package br.com.fabionazario.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fabionazario.loja.model.Cliente;
import br.com.fabionazario.loja.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> getTodosClientes() {
		return clienteService.findAll();
	}
	
	@PostMapping
    public Cliente incluirCliente(@RequestBody Cliente cliente) {
    	return clienteService.save(cliente);
    }
}
