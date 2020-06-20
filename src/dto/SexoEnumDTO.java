package dto;

public enum SexoEnumDTO {

	Masculino("Masculino"),
	Femenino("Femenino");

	private String sexo;

	private SexoEnumDTO(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo () {
		return sexo;
	}
}
