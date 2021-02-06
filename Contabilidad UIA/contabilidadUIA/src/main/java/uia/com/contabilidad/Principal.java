package uia.com.contabilidad;

import uia.com.contabilidad.gestor.DecoradorCobranza;
import uia.com.contabilidad.gestor.DecoradorCompras;
import uia.com.contabilidad.gestor.Gestor;

public class Principal {

	public static void main(String[] args) {
		
		
		System.out.println("Hola UIA");
		
		Gestor contabilidad = new Gestor("C:\\TSU-UIA\\contabilidadUIA\\cuentasXCobrar.json");
		
		 DecoradorCobranza gestorCobranza = new DecoradorCobranza(contabilidad);
		 
		 DecoradorCompras gestorCompras = new DecoradorCompras(contabilidad);
		 
		 gestorCobranza.Print();
		 gestorCobranza.validaCobranza();
		//miGestorClientes.registraCheque("Alfonso", "Cheques", "ClienteX");
		
		
	}


}
