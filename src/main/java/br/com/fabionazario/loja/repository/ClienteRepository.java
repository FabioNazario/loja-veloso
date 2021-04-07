package br.com.fabionazario.loja.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.fabionazario.loja.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	
	
}
