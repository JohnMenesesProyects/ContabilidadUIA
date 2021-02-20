package uia.com.contabilidad.cuentas;

import uia.com.contabilidad.cheques.Cheque;
import uia.com.contabilidad.cheques.GestorCheques;
import uia.com.contabilidad.clientes.Cliente;

public class GestorPagos {
	
	private GestorCheques miGestorCheques = new GestorCheques();
	private Cuenta miCCheques;
	private Cliente miCliente;
	
	
	
public void registraCuentasXpagar(Cliente cliente, String nomCuentaCheques,
			
			String nomCheque, String concepto) {

		this.miCliente = cliente;
		if (this.miGestorCheques != null && miCliente != null) {
			for (int i = 0; i < this.miCliente.getItems().size(); i++) {
				miCCheques = (Cuenta) this.miCliente.getItems().get(i);
				if (miCCheques.getName().contains(nomCuentaCheques.toString()))
					break;
			}

			if (miCCheques != null)
				miGestorCheques.registraChequeConcepto(miCCheques, nomCuentaCheques, nomCheque,concepto);
			else
				System.out.println("Error: cuenta por pagar no encontrada");
		}
		
	}

public void confirmacionPago(Cliente cliente, String nomCuentaCheques,
		
		String nomCheque, String concepto) {

	this.miCliente = cliente;
	if (this.miGestorCheques != null && miCliente != null) {
		for (int i = 0; i < this.miCliente.getItems().size(); i++) {
			miCCheques = (Cuenta) this.miCliente.getItems().get(i);
			if (miCCheques.getName().contains(nomCuentaCheques.toString()))
				break;
		}

		if (miCCheques != null)
			miGestorCheques.registraChequeConcepto(miCCheques, nomCuentaCheques, nomCheque,concepto);
		else
			System.out.println("Error: cuenta por pagar no encontrada");
	}
	
}


public void realizaPagoC(Cliente cliente, String nomCuentaCheques,
		
		String nomCheque) {

	this.miCliente = cliente;
	if (this.miGestorCheques != null && miCliente != null) {
		for (int i = 0; i < this.miCliente.getItems().size(); i++) {
			miCCheques = (Cuenta) this.miCliente.getItems().get(i);
			if (miCCheques.getName().contains(nomCuentaCheques.toString()))
				break;
		}

		
	}
	
}


}
