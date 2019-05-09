package com.poo.heranca;

public class PessoaFisica extends Cliente{
	public String nome;
	public String cpf;
	public String rg;
	
	
	
	public PessoaFisica() {
	}



	public PessoaFisica(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}



	public PessoaFisica(String nome, String cpf, String rg,int id,String email, String telefone, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		super.setId(id);
		super.setEmail(email);
		super.setEndereco(endereco);
		super.setTelefone(telefone);
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	@Override
	public void cadastrar() {
		System.out.println("Os dados do cliente foram cadastrados");
		
	}
	
	

}
