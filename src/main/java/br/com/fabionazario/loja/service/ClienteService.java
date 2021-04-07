package br.com.fabionazario.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fabionazario.loja.model.Cliente;
import br.com.fabionazario.loja.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteRepository.findAll();
	}
	
	public Cliente save(Cliente cliente) {
		  return clienteRepository.save(cliente);
	}

}
