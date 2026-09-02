package datos;

public class Item {
	private int idItem;
	private int cantidad;
	private Plato plato;
	public Item() {
	}
	public Item(int cantidad, Plato plato) {
		super();
		this.cantidad = cantidad;
		this.plato = plato;
	}
	
	public int getIdItem() {
		return idItem;
	}
	protected void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Plato getPlato() {
		return plato;
	}
	public void setPlato(Plato plato) {
		this.plato = plato;
	}
	@Override
	public String toString() {
		return "Item [idItem=" + idItem + ", cantidad=" + cantidad + ", plato=" + plato + "]";
	}
	
	
	

}
