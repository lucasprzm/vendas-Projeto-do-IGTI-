package com.lucasprzm.vendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasprzm.vendas.DTO.ClienteDTO;
import com.lucasprzm.vendas.entities.Cliente;
import com.lucasprzm.vendas.services.ClienteService;

@RestController // classe vai ter endpoints
@RequestMapping("/clientes")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<ClienteDTO>> findAll() {
		List <ClienteDTO> lista = clienteService.findAll();
		return ResponseEntity.ok(lista);
	}
}
