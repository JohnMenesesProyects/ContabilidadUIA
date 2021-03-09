package uia.com.contabilidad;

import java.util.ArrayList;

import uia.com.contabilidad.clientes.InfoUIA;
import uia.com.contabilidad.gestor.DecoradorProveedores;
import uia.com.contabilidad.gestor.DecoradorCuentas; /* SE IMPORTA EL DECORADOR CUENTAS PARA PODER MANIPULAR LAS CUENTAS*/
import uia.com.contabilidad.gestor.Gestor;
import uia.com.presentacion.ClienteJSP;
import uia.com.presentacion.CuentasJSP;

public class ContabilidadUIA {
		
		public DecoradorProveedores gestorProveedores = null;
		
		public DecoradorCuentas gestorCuentas = null;
		

		public ArrayList<ClienteJSP> listaProveedores = null;
		
		public ArrayList<CuentasJSP> listaCuentas = null; /* LINEA AÑADIDA PARA MAPEAR LAS CUENTAS*/

		public ContabilidadUIA()
		{
		 Gestor contabilidad = new Gestor("C:\\Users\\jonat\\Desktop\\ContabilidadUIA-web-master\\ContabilidadUIA-web-master\\ContabilidadUIA-web\\ListaProveedores.json");		
		 DecoradorProveedores gestorProveedores = new DecoradorProveedores(contabilidad, "proveedor");		 
		 gestorProveedores.Print();
		 listaProveedores = gestorProveedores.getLista();
		 
		}
		
		
		
		
		public ArrayList<ClienteJSP> getListaProveedores() {
			return listaProveedores;
		}



		public void setListaProveedores(ArrayList<ClienteJSP> listaProveedores) {
			this.listaProveedores = listaProveedores;
		}


		public DecoradorProveedores getGestorProveedores() {
			return gestorProveedores;
		}

		public void setGestorProveedores(DecoradorProveedores gestorProveedores) {
			this.gestorProveedores = gestorProveedores;
		}
		
		/* GETTERS AND SETTERS LISTA*/
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
