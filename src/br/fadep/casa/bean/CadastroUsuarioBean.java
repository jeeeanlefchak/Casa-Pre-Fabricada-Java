package br.fadep.casa.bean;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.Query;

import br.fadep.casa.model.Usuario;

@Stateless
public class CadastroUsuarioBean extends AbstractBeanImpl<Usuario> implements CadastroUsuarioBeanLocal{
	
	@Override
	public Class<Usuario> getClasses() throws Exception {
		return Usuario.class;
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public Usuario saveUser(Usuario user) throws Exception{
		salvar(user);
		return user;
	}
	
	public Usuario getUser(Usuario user) throws Exception{
		String sql = "select * from usuario where nome = " + user.getNome() + " and senha = " + user.getSenha();
		Query query = entity.createNativeQuery(sql, Usuario.class);
		return (Usuario) query.getSingleResult();
	}

}
