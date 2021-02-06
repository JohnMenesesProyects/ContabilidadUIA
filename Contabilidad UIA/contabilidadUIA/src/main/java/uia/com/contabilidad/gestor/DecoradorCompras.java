package uia.com.contabilidad.gestor;

public class DecoradorCompras extends Decorador {
	
	public DecoradorCompras(IGestor gestor)
	{
		super(gestor);
	}
	
	public DecoradorCompras () {
		
	}
	
	/*Funcionalidad a�adida en el decorador compras*/
	public void RegistroCheque()
	{
		super.Print();
	}

}
