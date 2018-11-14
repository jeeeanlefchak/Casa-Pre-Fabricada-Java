package br.fadep.casa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

import br.fadep.casa.model.generic.AbstractEntityImpl;

@Entity
public class Slide extends AbstractEntityImpl{
	
	@Lob
	private String imagem;
	@Column
	private Double posicao;
	
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public Double getPosicao() {
		return posicao;
	}
	public void setPosicao(Double posicao) {
		this.posicao = posicao;
	}
}
