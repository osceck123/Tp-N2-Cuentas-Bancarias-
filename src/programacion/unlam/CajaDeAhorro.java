package programacion.unlam;

import java.io.ObjectInputStream.GetField;

public class CajaDeAhorro extends CuentaSueldo
{
	Integer numeroExtraccion;
	
	public CajaDeAhorro(Integer dineroQueDisponeLaCuenta ) {
		super(dineroQueDisponeLaCuenta);
	}
	
	
	
	
	public Integer getNumeroExtraccion() {
		return numeroExtraccion;
	}




	public void setNumeroExtraccion(Integer numeroExtraccion) {
		this.numeroExtraccion = numeroExtraccion;
	}




	public int numeroDeLaExtraccion()
	{
		Integer numero=0;
		numero=getNumeroExtraccion()+1;
		setNumeroExtraccion(numero);
		return getNumeroExtraccion();
		
	}
	
	@Override
	public Integer retiroDeDineroDeLaCuenta(Integer montoAExtraer) {
		if(getNumeroExtraccion()>5 && montoAExtraer<getDineroQueDisponeLaCuenta())
		{
			Integer dineroAlmacenado=getDineroQueDisponeLaCuenta()-montoAExtraer-6;
			setDineroQueDisponeLaCuenta(dineroAlmacenado);
		}
		else
		{
			Integer dineroAlmacenado=getDineroQueDisponeLaCuenta()-montoAExtraer;
			setDineroQueDisponeLaCuenta(dineroAlmacenado);
		}
		return getDineroQueDisponeLaCuenta();
	}
	
	
}
