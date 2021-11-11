package com.lucasprzm.vendas.DTO;

import com.lucasprzm.vendas.entities.Cliente;

public class ClienteDTO {
	private int id;
	private String nome;
	private String dn;
	
	public ClienteDTO(Cliente entidade) {
		super();
		this.id = entidade.getId();
		this.nome = entidade.getNome();
		this.dn = entidade.getDn();
	}
	
	public ClienteDTO(int id, String nome, String dn) {
		super();
		this.id = id;
		this.nome = nome;
		this.dn = dn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDn() {
		return dn;
	}
	public void setDn(String dn) {
		this.dn = dn;
	}
	
}
