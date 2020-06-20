package dto;

import java.util.Date;

public class PacienteDTO {
	private String pacienteID;
	private String nombre;
	private String dni;
	private String domicilio;
	private String mail;
	private SexoEnumDTO sexo;
	private String fechaNacimiento;
	
	
	public PacienteDTO(String pacienteID, String nombre, String dni, String domicilio, String mail, SexoEnumDTO sexo,
			String fechaNacimiento) {
		super();
		this.pacienteID = pacienteID;
		this.nombre = nombre;
		this.dni = dni;
		this.domicilio = domicilio;
		this.mail = mail;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
	}


	public PacienteDTO() {
		super();
	}

	public String getPacienteID() {
		return pacienteID;
	}


	public void setPacienteID(String pacienteID) {
		this.pacienteID = pacienteID;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public SexoEnumDTO getSexo() {
		return sexo;
	}


	public void setSexo(SexoEnumDTO sexo) {
		this.sexo = sexo;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}