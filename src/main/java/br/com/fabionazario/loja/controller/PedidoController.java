package br.com.fabionazario.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fabionazario.loja.model.Pedido;
import br.com.fabionazario.loja.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping
	public List<Pedido> getTodosPedidos() {
		return pedidoService.findAll();
	}
	
	@PostMapping
    public Pedido incluirPedido(@RequestBody Pedido pedido) {
    	return pedidoService.save(pedido);
    }
}
