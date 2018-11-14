package br.fadep.casa.bean;
import java.util.List;

import javax.ejb.Local;

import br.fadep.casa.model.Modelo;

@Local
public interface ModeloBeanLocal extends AbstractBean<Modelo>{
	
	public List<Modelo> salvarLista(List<Modelo> modelos) throws Exception;
	
	public List<Modelo> buscarModelos() throws Exception;
}
