package br.fadep.casa.rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.fadep.casa.bean.AbstractBean;
import br.fadep.casa.bean.UsuarioBeanLocal;
import br.fadep.casa.model.Usuario;

@Stateless
@Path("usuario")
public class UsuarioWS extends AbstractWs<Usuario>{
	

	@EJB
	private UsuarioBeanLocal usuarioBean;

	@Override
	public AbstractBean<Usuario> getDAS() {
		return usuarioBean;
	}
	
	@GET
	@Path("getUser")
    @Produces({MediaType.APPLICATION_JSON +";charset=utf-8"})
	public Response getUser(Usuario user) throws Exception{
		Usuario usuario = usuarioBean.getUser(user);
		return Response.ok(usuario).build();
	}

}
