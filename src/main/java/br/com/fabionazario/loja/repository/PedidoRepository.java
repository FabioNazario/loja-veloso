package br.com.fabionazario.loja.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.fabionazario.loja.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {
	
	
}
