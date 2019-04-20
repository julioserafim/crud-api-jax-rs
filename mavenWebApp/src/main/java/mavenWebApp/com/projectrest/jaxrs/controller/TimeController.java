package mavenWebApp.com.projectrest.jaxrs.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import mavenWebApp.com.projectrest.jaxrs.model.Time;
import mavenWebApp.com.projectrest.jaxrs.service.TimeService;

@Path("/times")
public class TimeController {
	
	TimeService timeService = new TimeService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Time> getTimes(){
		return timeService.getTimes();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Time getTimePorId(@PathParam("id") int id) {
		return timeService.getTimePorId(id);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Time adicionarTime(Time time) {
		return timeService.adicionarTime(time);
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deletarTime(@PathParam("id") int id) {
		timeService.deletar(id);
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Time atualizarTime(Time time) {
		return timeService.atualizarTime(time);
	}
		
	
}
