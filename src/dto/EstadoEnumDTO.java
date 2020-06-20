package dto;

public enum EstadoEnumDTO {

	Finalizado("Finalizado"),
	En_Curso("En Curso");

	private String estado;

	private EstadoEnumDTO(String estado) {
		this.estado = estado;
	}

	public String getEstado () {
		return estado;
	}
	
}
