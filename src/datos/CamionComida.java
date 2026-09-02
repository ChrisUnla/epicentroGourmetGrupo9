package datos;

import java.util.Set;

public class CamionComida extends UnidadVenta {
	private String dominio;
	private boolean usaElectrisidad;
	public CamionComida() {
		super();
	}
	public CamionComida( String nombre, Double superficie, Set<Empleado> empleados, String dominio,
			boolean usaElectrisidad) {
		super( nombre, superficie, empleados);
		this.dominio = dominio;
		this.usaElectrisidad = false;
	}
	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	public boolean isUsaElectrisidad() {
		return usaElectrisidad;
	}
	public void setUsaElectrisidad(boolean usaElectrisidad) {
		this.usaElectrisidad = usaElectrisidad;
	}
	@Override
	public String toString() {
		return super.toString() + "CamionComida [dominio=" + dominio + ", usaElectrisidad=" + usaElectrisidad + "]";
	}
	
	
	
	

}
