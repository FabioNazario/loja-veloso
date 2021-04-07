package br.com.fabionazario.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fabionazario.loja.model.Pedido;
import br.com.fabionazario.loja.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	
	public List<Pedido> findAll() {
		return (List<Pedido>) pedidoRepository.findAll();
	}
	
	public Pedido save(Pedido pedido) {
		  return pedidoRepository.save(pedido);
	}

}
