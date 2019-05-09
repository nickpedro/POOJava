package com.poo.heranca;

public class PessoaJuridica extends Cliente{
	private String razaoSocial;
	private String cnpj;
	private String nomeFantasia;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(String razaoSocial, String cnpj, String nomeFantasia) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	public PessoaJuridica(String razaoSocial, String cnpj, String nomeFantasia,int id, String telefone, String endereco, String email) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		super.setId(id);
		super.setEmail(email);
		super.setTelefone(telefone);
		super.setEndereco(endereco);
		
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	

}
