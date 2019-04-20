package mavenWebApp.com.projectrest.jaxrs.service;

import java.util.List;

import mavenWebApp.com.projectrest.jaxrs.data.TimeDAO;
import mavenWebApp.com.projectrest.jaxrs.model.Time;

public class TimeService {
	
	private TimeDAO timeDAO = new TimeDAO();

	public List<Time> getTimes() {
		return timeDAO.getTimes();
	}

	public Time getTimePorId(int id) {
		return timeDAO.buscarPorId(id);
	}

	public Time adicionarTime(Time time) {
		return timeDAO.adicionarTime(time);
	}

	public void deletar(int id) {
		timeDAO.deletarTime(id);
		
	}

	public Time atualizarTime(Time time) {
		return timeDAO.atualizarTime(time);
	}

}
