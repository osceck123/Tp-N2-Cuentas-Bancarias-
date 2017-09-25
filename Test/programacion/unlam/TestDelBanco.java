package programacion.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDelBanco {

	@Test
	public void test() 
	{
	CuentaSueldo miCuenta= new CuentaSueldo(3000);
	Integer retiro1=miCuenta.retiroDeDineroDeLaCuenta(500);
	Integer valorEsperado=2500;
	assertEquals(valorEsperado, retiro1, 0.0);	
	}
	
	@Test
	public void testDeLaCuentaSueldo() 
	{
	CuentaSueldo miCuenta= new CuentaSueldo(3000);
	miCuenta.retiroDeDineroDeLaCuenta(400);
	Integer retiro1=miCuenta.getDineroQueDisponeLaCuenta();
	Integer valorEsperado=2600;
	
	assertEquals(valorEsperado, retiro1, 0.0);	
	}
	
	@Test
	public void testDeLaCajaDeAhorro() 
	{
	CajaDeAhorro miCuenta= new CajaDeAhorro(3000);
	miCuenta.setNumeroExtraccion(1);
	miCuenta.numeroDeLaExtraccion();
	miCuenta.numeroDeLaExtraccion();
	miCuenta.numeroDeLaExtraccion();
	miCuenta.numeroDeLaExtraccion();
	miCuenta.numeroDeLaExtraccion();
	Integer valor=miCuenta.retiroDeDineroDeLaCuenta(400);
	assertEquals(2594, valor, 0.0);
	
	}
	
	@Test
	public void testDeLaCajaDeAhorroCon4RetirosDeDinero() 
	{
	CajaDeAhorro miCuenta= new CajaDeAhorro(3000);
	miCuenta.setNumeroExtraccion(1);
	miCuenta.numeroDeLaExtraccion();
	miCuenta.numeroDeLaExtraccion();
	miCuenta.numeroDeLaExtraccion();
	miCuenta.numeroDeLaExtraccion();
	
	Integer valor=miCuenta.retiroDeDineroDeLaCuenta(400);
	assertEquals(2600, valor, 0.0);
	
	}
	
	@Test
	public void testDeLaCuentaCorriente() 
	{
		CuentaCorriente miCuenta = new CuentaCorriente(100);
		miCuenta.setLimiteAdcionalQueSeOtorgaALasCuentasCorrientes(150);
		int valor=miCuenta.retiroDeDineroDeLaCuenta(200);
		assertEquals(52, valor, 0.00);
		
				
	}
	
	}
	
	


