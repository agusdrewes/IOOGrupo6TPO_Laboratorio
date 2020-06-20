package dto;

public enum Rol {
	Recepcion("Recepcion"), 
	Laboratorista("Laboratorista"),
	Administrador("Administrador");
	
	private String rolValue;
	 
    Rol(String envRol) {
        this.rolValue = envRol;
    }
 
    public String getRolValue() {
        return rolValue;
    }
}
