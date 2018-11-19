package br.fadep.casa.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.fadep.casa.bean.AbstractBean;
import br.fadep.casa.bean.SlideBeanLocal;
import br.fadep.casa.model.Slide;

@Stateless
@Path("slide")
public class SlideWs extends AbstractWs<Slide> {

	@EJB
	private SlideBeanLocal slideBean;
	
	@Override
	public AbstractBean<Slide> getDAS() {
		// TODO Auto-generated method stub
		return slideBean;
	}

	@GET
	@Path("buscarslides")
    @Produces({MediaType.APPLICATION_JSON +";charset=utf-8"})
	public Response buscarSlides() throws Exception{
		List<Slide> lista = slideBean.buscaSlides();
		return Response.ok(lista).build();
	}
}
