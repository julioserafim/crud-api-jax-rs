package mavenWebApp.com.projectrest.jaxrs.model;

public class Time {
	int id;
	String nomeDoTime;
	long numeroSocioTorcedor;
	
	
	public Time() {
		
	}
	

	
	public Time(int id, String nomeDoTime, long numeroSocioTorcedor) {
		this.id = id;
		this.nomeDoTime = nomeDoTime;
		this.numeroSocioTorcedor = numeroSocioTorcedor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeDoTime() {
		return nomeDoTime;
	}
	public void setNomeDoTime(String nomeDoTime) {
		this.nomeDoTime = nomeDoTime;
	}
	public long getNumeroSocioTorcedor() {
		return numeroSocioTorcedor;
	}
	public void setNumeroSocioTorcedor(long numeroSocioTorcedor) {
		this.numeroSocioTorcedor = numeroSocioTorcedor;
	}
	
	

}
