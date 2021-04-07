package br.com.fabionazario.loja.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.fabionazario.loja.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
	
	
}
