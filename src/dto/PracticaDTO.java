package dto;

public class PracticaDTO {
	private String practicaID;
	private String nombre;
	private String grupo;
	private String valoresCriticos;
	private String valoresReservados;
	private String tiempoEntrega;
	private EstadoHabilitacionEnumDTO estadoHabilitacion;
	
	
	public PracticaDTO(String practicaID, String nombre, String grupo, String valoresCriticos, String valoresReservados,
			String tiempoEntrega, EstadoHabilitacionEnumDTO estadoHabilitacion) {
		super();
		this.practicaID = practicaID;
		this.nombre = nombre;
		this.grupo = grupo;
		this.valoresCriticos = valoresCriticos;
		this.valoresReservados = valoresReservados;
		this.tiempoEntrega = tiempoEntrega;
		this.estadoHabilitacion = estadoHabilitacion;
	}
	
	public PracticaDTO() {
		super();
	}

	public String getPracticaID() {
		return practicaID;
	}
	public void setPracticaID(String practicaID) {
		this.practicaID = practicaID;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getValoresCriticos() {
		return valoresCriticos;
	}
	public void setValoresCriticos(String valoresCriticos) {
		this.valoresCriticos = valoresCriticos;
	}
	public String getValoresReservados() {
		return valoresReservados;
	}
	public void setValoresReservados(String valoresReservados) {
		this.valoresReservados = valoresReservados;
	}
	public String getTiempoEntrega() {
		return tiempoEntrega;
	}
	public void setTiempoEntrega(String tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}
	public EstadoHabilitacionEnumDTO getEstadoHabilitacion() {
		return estadoHabilitacion;
	}
	public void setEstadoHabilitacion(EstadoHabilitacionEnumDTO estadoHabilitacion) {
		this.estadoHabilitacion = estadoHabilitacion;
	}
	
	
}