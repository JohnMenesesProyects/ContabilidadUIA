package uia.com.presentacion;

public class CuentasJSP {
	private int id;
	private String name;
	private String fecha;
	

	public CuentasJSP()
	{}
	
	public CuentasJSP(String name2, int id2, String estado2) {
		this.id= id2;
		this.name =name2;
		this.fecha = estado2;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



}
