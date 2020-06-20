package dto;

public class ResultadoDTO {
	
	private String resultadoID;
	private String practicaID;
	private String valor;
	private String descripcion;
	private EstadoEnumDTO estado;
	
	public ResultadoDTO(String resultadoID, String practicaID, String valor, String descripcion, EstadoEnumDTO estado) {
		super();
		this.resultadoID = resultadoID;
		this.practicaID = practicaID;
		this.valor = valor;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	
	public ResultadoDTO() {
		super();
	}

	public String getResultadoID() {
		return resultadoID;
	}
	public void setResultadoID(String resultadoID) {
		this.resultadoID = resultadoID;
	}
	public String getPracticaID() {
		return practicaID;
	}
	public void setPracticaID(String practicaID) {
		this.practicaID = practicaID;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public EstadoEnumDTO getEstado() {
		return estado;
	}
	public void setEstado(EstadoEnumDTO estado) {
		this.estado = estado;
	}
	
	
}