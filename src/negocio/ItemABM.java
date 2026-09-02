package negocio;

import java.util.List;

import dao.ItemDao;
import datos.Item;
import datos.Plato;

public class ItemABM {
	
	ItemDao dao = new ItemDao();
	public Item traer(long idItem) {
	return dao.traer(idItem);
	}
	
	public int agregar(int cantidad, Plato plato){
	Item i = new Item(cantidad,plato);
	return dao.agregar(i);
	}
	public void modificar(Item i){
	
	dao.actualizar(i);
	}
	public void modificar(long idItem , int cantidadN, Plato platoN)throws Exception{
	    Item itemParaModificar=dao.traer(idItem);
		if(itemParaModificar == null) {
			throw new Exception("el item no existe");
		}
		itemParaModificar.setCantidad(cantidadN);
		itemParaModificar.setPlato(platoN);
		
		
		dao.actualizar(itemParaModificar);
	}
	public void eliminar(long idItem) throws Exception {
	
		
	Item i = dao.traer(idItem);
	
	if(i==null) {
		throw new Exception("el item no existe");
	}
	dao.eliminar(i);
	}
	public List<Item> traer() {
	return dao.traer();
	
}
}
