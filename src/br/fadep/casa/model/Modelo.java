package br.fadep.casa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

import br.fadep.casa.model.generic.AbstractEntityImpl;

//@SqlResultSetMapping(name="dadosgraficonota",
//classes={@ConstructorResult(targetClass=DadosGrafico.class, columns={
//		@ColumnResult(name="dataInicio",type=Date.class),
//		@ColumnResult(name="dataFinal",type=Date.class),
//		@ColumnResult(name="idVendedor",type=Long.class),
//		@ColumnResult(name="nota1",type=Double.class),
//		@ColumnResult(name="nota2",type=Double.class),
//		@ColumnResult(name="nota3",type=Double.class),
//		@ColumnResult(name="nota4",type=Double.class)
//})})


@Entity
public class Modelo extends AbstractEntityImpl{

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
