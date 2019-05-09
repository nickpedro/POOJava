package com.construtores;

public class Cliente {
	
	private int id;
	private String nome;
	private String email;
	
	/*
	 * M�todos de acesso get set...
	 */
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome; 
	}
	public void setEmail(String email) {
		this.email = email;		
	}
	public String getEmail() {
		return this.email;
	}
	
	
	/*
	 * Sempre p�blico
	 * Sempre com o mesmo nome da classe
	 * N�o tem tipo de retorno, ou seja, n�o � void ou qualquer ou tipo
	 */
	public Cliente(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;		
	}
	public Cliente() {}
	
	public String cadastrar() {
		return "Cadastro realizado";
	}

	public String nomePorId(int id) {
		
		String msg="";
		
		if(id==id) {
			msg = this.nome;
		}
		else {
			msg = "N�o localizado";
		}
		return msg;
	}
}
