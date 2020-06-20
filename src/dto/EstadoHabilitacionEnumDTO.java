package dto;

public enum EstadoHabilitacionEnumDTO {

	Habilitado("Habilitado"),
	Inhabilitado("Inhabilitado");

	private String estado;

	private EstadoHabilitacionEnumDTO(String estado) {
		this.estado = estado;
	}

	public String getEstado () {
		return estado;
	}
	
}
