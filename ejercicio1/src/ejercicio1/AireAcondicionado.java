package ejercicio1;

public class AireAcondicionado extends Electrodomestico {
private Integer frigorias;


public AireAcondicionado(Integer _frigorias)
{
	frigorias = _frigorias;
}

public AireAcondicionado(){}


public Integer getFrigorias() {
	return frigorias;
}

public void setFrigorias(Integer frigorias) {
	this.frigorias = frigorias;
}

public void setFrigorias(String frigorias) {
	this.frigorias = Integer.valueOf(frigorias);
}

public String toString()
{
return this.toString() + frigorias.toString();
}

}
