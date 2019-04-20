package mavenWebApp.com.projectrest.jaxrs.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import mavenWebApp.com.projectrest.jaxrs.model.Time;

public class TimeDAO {

	public List<Time> getTimes() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mavenWebApp");
		EntityManager manager = fabrica.createEntityManager();
		
		List<Time> times = manager.createQuery("select t from Time as t",Time.class).getResultList();
		return times;
	}

	public Time adicionarTime(Time time) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mavenWebApp");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(time);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
		return time;
	}

	public void deletarTime(int id) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mavenWebApp");
		EntityManager manager = fabrica.createEntityManager();
		
		Time time = manager.find(Time.class, id);
		
		manager.getTransaction().begin();
		manager.remove(time);
		manager.getTransaction().commit();
	}

	public Time atualizarTime(Time time) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mavenWebApp");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(time);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
		return time;
	}

	public Time buscarPorId(int id) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mavenWebApp");
		EntityManager manager = fabrica.createEntityManager();
		
		Time time = manager.find(Time.class, id);
		
		manager.close();
		fabrica.close();
		
		return time;
	}

}
