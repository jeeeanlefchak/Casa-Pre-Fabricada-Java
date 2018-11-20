package br.fadep.casa.bean;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.Query;

import br.fadep.casa.model.Usuario;

@Stateless
public class UsuarioBean extends AbstractBeanImpl<Usuario> implements UsuarioBeanLocal{
	
	@Override
	public Class<Usuario> getClasses() throws Exception {
		return Usuario.class;
	}
	
	
	public Usuario getUser(Usuario user) throws Exception{
		String sql = "select * from usuario where nome = " + user.getNome() + " and senha = " + user.getSenha();
		Query query = entity.createNativeQuery(sql, Usuario.class);
		return (Usuario) query.getSingleResult();
	}

}
