package ejercicio1;

public class Televisor extends Electrodomestico {

	private Integer pulgadas;
	private Boolean poseeHDMI;
	
	public Televisor(Integer _pulgadas, Boolean _poseeHDMI) 
	{
		pulgadas = _pulgadas;
		poseeHDMI = _poseeHDMI;
	}
	
	public Televisor(){}
	
	public Integer getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	public void setPulgadas(String pulgadas) {
		this.pulgadas = Integer.valueOf(pulgadas);
	}
	public Boolean getPoseeHDMI() {
		return poseeHDMI;
	}
	
	public void setPoseeHDMI(Boolean poseeHDMI) {
		this.poseeHDMI = poseeHDMI;
	}
	
	
	public String toString()
	{
		String auxiliar;
		if(poseeHDMI) auxiliar = "Tiene HDMI";
		else auxiliar = "No tiene HDMI";
		return this.toString() + pulgadas.toString() + auxiliar;
	}
	
}
