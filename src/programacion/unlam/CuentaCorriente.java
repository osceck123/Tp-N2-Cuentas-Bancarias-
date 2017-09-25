package programacion.unlam;

public class CuentaCorriente extends CuentaSueldo {
	
	Integer limiteAdcionalQueSeOtorgaALasCuentasCorrientes;

	public CuentaCorriente(Integer dineroQueDisponeLaCuenta)
	{
		super(dineroQueDisponeLaCuenta);
	}

	public Integer getLimiteAdcionalQueSeOtorgaALasCuentasCorrientes() {
		return limiteAdcionalQueSeOtorgaALasCuentasCorrientes;
	}

	public void setLimiteAdcionalQueSeOtorgaALasCuentasCorrientes(Integer limiteAdcionalQueSeOtorgaALasCuentasCorrientes) {
		this.limiteAdcionalQueSeOtorgaALasCuentasCorrientes = limiteAdcionalQueSeOtorgaALasCuentasCorrientes;
	}
	
	@Override
	public Integer retiroDeDineroDeLaCuenta(Integer montoAExtraer) {
		
		if(montoAExtraer < getDineroQueDisponeLaCuenta())
		{
			int dineroQueLeQuedara=getDineroQueDisponeLaCuenta()-montoAExtraer;
			setDineroQueDisponeLaCuenta(dineroQueLeQuedara);
		}
		else
		{
			int dineroConExtra= (getDineroQueDisponeLaCuenta()+getLimiteAdcionalQueSeOtorgaALasCuentasCorrientes());
			int dineroquetengo=(int) ((dineroConExtra-montoAExtraer)*1.05);
			setDineroQueDisponeLaCuenta(dineroquetengo);
		}
		return getDineroQueDisponeLaCuenta();
	}
	
	

}
