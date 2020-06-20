package dto;

public class UsuarioDTO {
	
	private String usuarioID;
	private String nombreUsuario;
	private String email;
	private String password;
	private String nombre;
	private String domicilio;
	private String dni;
	private String fchNacimiento;
	private String rol;

	
	public UsuarioDTO(String nombreUsuario, String email, String password, String nombre, String domicilio, String dni, String fchNacimiento, String rol)
	{
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.password = password;
		this.nombre =  nombre;
		this.domicilio = domicilio;
		this.dni = dni;
		this.fchNacimiento = fchNacimiento;
		this.rol = rol;

	}
	
	public UsuarioDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getUsuarioID() {
		return usuarioID;
	}

	public void setUsuarioID(String usuarioID) {
		this.usuarioID = usuarioID;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String Email) {
		this.email = Email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFchNacimiento() {
		return fchNacimiento;
	}
	public void setFchNacimiento(String fch) {
		this.fchNacimiento = fch;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}


}
