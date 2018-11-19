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
import br.fadep.casa.bean.CadastroUsuarioBeanLocal;
import br.fadep.casa.model.Usuario;

@Stateless
@Path("cadastroUsuario/")
public class CadastroUsuarioWS extends AbstractWs<Usuario>{
	

	@EJB
	private CadastroUsuarioBeanLocal cadastroUsuarioBean;

	@Override
	public AbstractBean<Usuario> getDAS() {
		return cadastroUsuarioBean;
	}
	
	@POST
	@Path("saveUser")
    @Produces({MediaType.APPLICATION_JSON +";charset=utf-8"})
//	@Context HttpHeaders headers,
	public Response saveUser(Usuario user) throws Exception {
    	Usuario usuario = cadastroUsuarioBean.saveUser(user); 
        return Response.ok(toJson(usuario)).build();
    }
	
	@GET
	@Path("getUser")
    @Produces({MediaType.APPLICATION_JSON +";charset=utf-8"})
	public Response getUser(Usuario user) throws Exception{
		Usuario usuario = cadastroUsuarioBean.getUser(user);
		return Response.ok(usuario).build();
	}

}
