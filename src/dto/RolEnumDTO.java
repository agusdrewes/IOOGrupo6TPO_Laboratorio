package dto;

public enum RolEnumDTO {
	Recepcion("Recepcion"), 
	Laboratorista("Laboratorista"),
	Administrador("Administrador");
	
	private String rolValue;
	 
    RolEnumDTO(String envRol) {
        this.rolValue = envRol;
    }
 
    public String getRolValue() {
        return rolValue;
    }
}
