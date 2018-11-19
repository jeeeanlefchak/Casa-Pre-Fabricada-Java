package br.fadep.casa.rest;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("rest")
public class ApplicationRest extends Application{

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<>();
		addRestResourcesClasses(resources);
		return resources;
	}
	private void addRestResourcesClasses(Set<Class<?>> resources) {
		resources.add(br.fadep.casa.rest.filtros.FilterRequestHeader.class);
		resources.add(br.fadep.casa.rest.ModeloWs.class);
		resources.add(br.fadep.casa.rest.SlideWs.class);
	}
		
}
