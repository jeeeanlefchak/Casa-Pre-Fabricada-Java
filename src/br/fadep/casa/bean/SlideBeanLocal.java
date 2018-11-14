package br.fadep.casa.bean;

import java.util.List;

import javax.ejb.Local;

import br.fadep.casa.model.Slide;

@Local
public interface SlideBeanLocal extends AbstractBean<Slide> {

	public List<Slide> buscaSlides()throws Exception;
}
