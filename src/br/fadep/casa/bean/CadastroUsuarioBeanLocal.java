package br.fadep.casa.bean;

import br.fadep.casa.model.Usuario;

public interface CadastroUsuarioBeanLocal extends AbstractBean<Usuario>{
	
	public Usuario saveUser(Usuario user) throws Exception;
	
	public Usuario getUser(Usuario user) throws Exception;

}
