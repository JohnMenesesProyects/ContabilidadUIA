package uia.com.contabilidad;


import java.util.ArrayList;

import uia.com.contabilidad.clientes.InfoUIA;
import uia.com.contabilidad.gestor.DecoradorCuentas;
import uia.com.contabilidad.gestor.DecoradorProveedores;
import uia.com.contabilidad.gestor.Gestor;
import uia.com.presentacion.ClienteJSP;
import uia.com.presentacion.CuentasJSP;

public class ContabilidadUIAcuentas {
	
	
	public DecoradorCuentas gestorCuentas = null;
	
	public ArrayList<CuentasJSP> listaCuentas = null;
	
	public ContabilidadUIAcuentas()
	{
	 Gestor contabilidad2 = new Gestor("C:\\Users\\jonat\\Desktop\\ContabilidadUIA-web-master\\ContabilidadUIA-web-master\\ContabilidadUIA-web\\ListaProveedores.json");		
	 DecoradorCuentas gestorCuentas = new DecoradorCuentas(contabilidad2, "proveedor");		 
	 gestorCuentas.Print();
	 listaCuentas = gestorCuentas.getLista();
	}

	public DecoradorCuentas getGestorCuentas() {
		return gestorCuentas;
	}

	public void setGestorCuentas(DecoradorCuentas gestorCuentas) {
		this.gestorCuentas = gestorCuentas;
	}

	public ArrayList<CuentasJSP> getListaCuentas() {
		return listaCuentas;
	}

	public void setListaCuentas(ArrayList<CuentasJSP> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}

	

}
