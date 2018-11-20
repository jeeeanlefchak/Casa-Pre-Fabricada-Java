package br.fadep.casa.bean;

import br.fadep.casa.model.Usuario;

public interface UsuarioBeanLocal extends AbstractBean<Usuario>{
	
	
	public Usuario getUser(Usuario user) throws Exception;

}
