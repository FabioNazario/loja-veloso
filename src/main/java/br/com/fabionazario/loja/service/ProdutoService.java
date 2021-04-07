package br.com.fabionazario.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fabionazario.loja.model.Produto;
import br.com.fabionazario.loja.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	public List<Produto> findAll() {
		return (List<Produto>) produtoRepository.findAll();
	}
	
	public Produto save(Produto produto) {
		  return produtoRepository.save(produto);
	}

}
