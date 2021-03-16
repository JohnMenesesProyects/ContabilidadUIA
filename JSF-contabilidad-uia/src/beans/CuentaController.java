package beans;


import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;

import model.ClienteJSF;
import uia.com.contabilidad.ContabilidadUIA;

@ManagedBean(name = "clienteController")
@SessionScoped
public class CuentaController {
	
	private ContabilidadUIA dao = new ContabilidadUIA();

	public ClienteJSF cliente = null;
	public ArrayList<String> cuentasNames = null; /* FUNCIONALIDAD PARA AGREGAR CUENTAS*/

	public ArrayList<ClienteJSF> cuentas = null; /* FUNCIONALIDAD PARA AGREGAR CUENTAS*/
	public ArrayList<ClienteJSF> clientes = null; /* FUNCIONALIDAD PARA AGREGAR CUENTAS*/

	
	
	public ArrayList<ClienteJSF> getCuentas() {
		return cuentas;
	}
	public void setCuentas(ArrayList<ClienteJSF> cuentas) {
		this.cuentas = cuentas;
	}
	public ArrayList<ClienteJSF> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<ClienteJSF> clientes) {
		this.clientes = clientes;
		
	}
	
	public ArrayList<String> getClientesNames() {
		if(this.cliente == null)
		{
			this.clientes = this.dao.getListaProveedores();
			cliente = this.clientes.get(0);			
		}
		cuentasNames=this.dao.getClientesNames(this.cliente.getName());
		return cuentasNames;
	}
	
	
	public ArrayList<String> getCuentasNames() {
		if(this.cliente == null)
		{
			this.clientes = this.dao.getListaProveedores();
			cliente = this.clientes.get(0);			
		}
		cuentasNames=this.dao.getCuentasNames(this.cliente.getName());
		return cuentasNames;
	}
	
	/* NEW*/
	
	/* NEW*/
	
	

}
