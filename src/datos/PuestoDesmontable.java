package datos;

import java.util.Set;

public class PuestoDesmontable extends UnidadVenta {
private int cantidadCarpas;
private int tiempoInstalacion;
public PuestoDesmontable() {
	super();
}
public PuestoDesmontable( String nombre, Double superficie, Set<Empleado> empleados,
		int cantidadCarpas, int tiempoInstalacion) {
	super( nombre, superficie, empleados);
	this.cantidadCarpas = cantidadCarpas;
	this.tiempoInstalacion = tiempoInstalacion;
}
public int getCantidadCarpas() {
	return cantidadCarpas;
}
public void setCantidadCarpas(int cantidadCarpas) {
	this.cantidadCarpas = cantidadCarpas;
}
public int getTiempoInstalacion() {
	return tiempoInstalacion;
}
public void setTiempoInstalacion(int tiempoInstalacion) {
	this.tiempoInstalacion = tiempoInstalacion;
}
@Override
public String toString() {
	return super.toString() + "PuestoDesmontable [cantidadCarpas=" + cantidadCarpas + ", tiempoInstalacion=" + tiempoInstalacion + "]";
}


}
