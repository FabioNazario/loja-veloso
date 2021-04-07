package br.com.fabionazario.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fabionazario.loja.model.Produto;
import br.com.fabionazario.loja.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public List<Produto> getTodosProdutos() {
		return produtoService.findAll();
	}
	
	@PostMapping
    public Produto incluirProduto(@RequestBody Produto produto) {
    	return produtoService.save(produto);
    }
}
