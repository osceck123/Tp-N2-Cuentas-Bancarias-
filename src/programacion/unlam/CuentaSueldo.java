package programacion.unlam;

public class CuentaSueldo {
	
	private Integer dineroQueDisponeLaCuenta;

	public CuentaSueldo(Integer dineroQueDisponeLaCuenta) 
	{
		this.dineroQueDisponeLaCuenta = dineroQueDisponeLaCuenta;
	}

	public Integer getDineroQueDisponeLaCuenta() {
		return dineroQueDisponeLaCuenta;
	}

	public void setDineroQueDisponeLaCuenta(Integer dineroQueDisponeLaCuenta)
	{
		this.dineroQueDisponeLaCuenta = dineroQueDisponeLaCuenta;
	}
	
	public Integer retiroDeDineroDeLaCuenta(Integer montoAExtraer)
	{
		int monto=montoAExtraer;
		if(monto<= dineroQueDisponeLaCuenta)
		{
			dineroQueDisponeLaCuenta=dineroQueDisponeLaCuenta-monto;
		}
		return dineroQueDisponeLaCuenta;
	}
}
