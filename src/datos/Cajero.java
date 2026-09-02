package datos;

import java.time.LocalDate;

public class Cajero extends Empleado{
	private String turno;

	public Cajero() {
		super();
	}

	public Cajero( int dni, String nombre, String apellido, LocalDate fechaNacimiento,
			LocalDate fechaIngreso, float sueldo, boolean esEncargado, int puestoDondeTrabaja, String turno) {
		super( dni, nombre, apellido, fechaNacimiento, fechaIngreso, sueldo, esEncargado, puestoDondeTrabaja);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return super.toString() + "Cajero [turno=" + turno + "]";
	}
	

}
