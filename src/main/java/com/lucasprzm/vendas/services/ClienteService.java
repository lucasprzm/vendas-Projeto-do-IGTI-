package com.lucasprzm.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasprzm.vendas.DTO.ClienteDTO;
import com.lucasprzm.vendas.entities.Cliente;
import com.lucasprzm.vendas.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	public List<ClienteDTO> findAll() {
		List <Cliente> res =  clienteRepository.findAll();
		return res.stream().map(c -> new ClienteDTO(c)).collect(Collectors.toList());
	}
}
