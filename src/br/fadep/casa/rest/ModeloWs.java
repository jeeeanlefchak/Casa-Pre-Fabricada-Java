package br.fadep.casa.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.fadep.casa.bean.AbstractBean;
import br.fadep.casa.bean.ModeloBeanLocal;
import br.fadep.casa.model.Modelo;

@Stateless
@Path("modelo")
public class ModeloWs extends AbstractWs<Modelo>{
	
	@EJB
	private ModeloBeanLocal modeloBean;

	@Override
	public AbstractBean<Modelo> getDAS() {
		return modeloBean;
	}
	
	@POST
	@Path("salvarlista")
    @Produces({MediaType.APPLICATION_JSON +";charset=utf-8"})
//	@Context HttpHeaders headers,
	public Response salvarLista(List<Modelo> modelos) throws Exception {
    	List<Modelo> lista = modeloBean.salvarLista(modelos); 
        return Response.ok(toJson(lista)).build();
    }
	
	@GET
	@Path("buscarmodelos")
    @Produces({MediaType.APPLICATION_JSON +";charset=utf-8"})
	public Response buscarModelos() throws Exception{
		List<Modelo> lista = modeloBean.buscarModelos();
		return Response.ok(lista).build();
	}

}
