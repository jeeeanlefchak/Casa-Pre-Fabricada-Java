package br.fadep.casa.rest;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Stateless
@Path("servidor")
public class ServidorWS{
	
	@GET
	@Path("conexao")
    @Produces({MediaType.APPLICATION_JSON +";charset=utf-8"})
	public Response verificaConexao() throws Exception{
		return Response.ok(true).build();
	}
}
