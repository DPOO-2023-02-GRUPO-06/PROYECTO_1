package core;

public class Empresa {
	
	private Inventario inventario;
	private SRA sra;
	private HashMap<String,Sede> sedes;
	
	public void Empresa() {
		this.inventario=new Inventario();
		this.sra= new SRA();
		this.sedes=new HashMap<String,Sede>();
		
	}
}
