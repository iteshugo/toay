package ejercicio1;

public class Electrodomestico {

	private String modelo;
	private Double precio;
	private Integer stock;
	private Fabricante fabricante;
	
	public Electrodomestico(String _modelo, Double _precio, Integer _stock, Fabricante _fabricante )
	{
		modelo = _modelo;
		precio = _precio;
		stock = _stock;
		fabricante = _fabricante;
	}
	
	public Electrodomestico()
	{
		
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
		
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public void setPrecio(String precio) {
		this.precio = Double.valueOf(precio);
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public void setStock(String stock) {
		this.stock = Integer.decode(stock);
	}
	public Fabricante getTipo() {
		return fabricante;
	}
	public void setTipo(Fabricante tipo) {
		this.fabricante = tipo;
	}
public String toString(){
	
	return modelo + stock.toString() + fabricante;
}

}
