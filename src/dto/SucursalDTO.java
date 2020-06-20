package dto;

import java.util.Date;

public class SucursalDTO {
	private int numero;
	private String direccion;
	private String responsableTecnico;

	
	public SucursalDTO(int numero, String direccion, String responsableTecnico)
	{
		this.numero = numero;
		this.direccion = direccion;
		this.responsableTecnico = responsableTecnico;

	}
	
	public SucursalDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String Direccion) {
		this.direccion = Direccion;
	}
	public String getResponsableTecnico() {
		return responsableTecnico;
	}
	public void setResponsableTecnico(String responsableTecnico) {
		this.responsableTecnico = responsableTecnico;
	}
	
	

}
