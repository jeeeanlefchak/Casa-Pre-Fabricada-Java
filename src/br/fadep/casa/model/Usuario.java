package br.fadep.casa.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.fadep.casa.model.generic.AbstractEntityImpl;

@Entity
public class Usuario extends AbstractEntityImpl{
	
	@Column(length=200)
	private String nome;
	
	@Column
	private Integer idade;
	
	@Column
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
