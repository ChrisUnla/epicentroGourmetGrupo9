package negocio;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import dao.FestivalDao;
import datos.Festival;
import datos.Plato;
public class FestivalABM {
	FestivalDao dao = new FestivalDao();
	public Festival traer(long idFestival) {
	return dao.traer(idFestival);
	}
	
	public int agregar(String nombre, String temporada, LocalDate fechaDeInicio, LocalDate fechaDeFin, Set<Plato> platos){
	Festival f = new Festival(nombre, temporada, fechaDeInicio, fechaDeFin,platos);
	return dao.agregar(f);
	}
	public void modificar(Festival f){
	
	dao.actualizar(f);
	}
	public void modificar(long idFestival, String nombreNuevo,String temporadaNuevo,LocalDate nuevaFechaDeInicio,LocalDate nuevaFechaDeFin, Set<Plato> platosNuevo)throws Exception{
	    Festival festivalParaModificar=dao.traer(idFestival);
		if(festivalParaModificar == null) {
			throw new Exception("el festival no existe");
		}
		
		festivalParaModificar.setNombre(nombreNuevo);
		festivalParaModificar.setTemporada(temporadaNuevo);
		festivalParaModificar.setFechaDeInicio(nuevaFechaDeInicio);
		festivalParaModificar.setFechaDeFin(nuevaFechaDeFin);
		festivalParaModificar.setPlatos(platosNuevo);
		
		dao.actualizar(festivalParaModificar);
	}
	public void eliminar(long idFestival) throws Exception {
	
		
	Festival f = dao.traer(idFestival);
	
	if(f==null) {
		throw new Exception("el festival no existe");
	}
	dao.eliminar(f);
	}
	public List<Festival> traer() {
	return dao.traer();
	}
}
