package uia.com.contabilidad.gestor;

import java.util.ArrayList;
import java.util.Map;

import uia.com.contabilidad.clientes.InfoUIA;
import uia.com.presentacion.ClienteJSP;
import uia.com.presentacion.CuentasJSP;

public class DecoradorCuentas extends Decorador {
	
	public DecoradorCuentas(IGestor gestor, String tipo)
	{
		super(gestor, tipo);
	}
	
	
	public DecoradorCuentas()
	{		
	}
	
	public void validaCuentas()
	{
		super.Print();
	}


	public Map<String, InfoUIA> getCatalogo() {	
		return this.catalogo;
	}
	/* SE IMOPORTA EL LA CLASE PARA CREARLE UN METODO*/
	public ArrayList<CuentasJSP> getLista()
	{
		return super.getLista();
	}


}
