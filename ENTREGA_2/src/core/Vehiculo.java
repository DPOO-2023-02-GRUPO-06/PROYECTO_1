package core;

public class Vehiculo {
	
	private Categoria categoria;
	private String placa;
	private String marca;
	private String modelo;
	private String color;
	private String transmision;
	private Alquiler alquiler;
	private Sede sede;
	
	public void Vehiculo (String placa,String marca,String modelo,String color, String transmicion) {
		
		this.placa= placa;
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
		this.transmision=transmision;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria=categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria=categoria;
	}
	
	public void setAlquiler(Alquiler alquiler) {
		this.alquiler=alquiler;
	}
	
	public Alquiler getAlquiler() {
		return this.alquiler;
	}
	
	public Categoria getCategoria(){
		return this.categoria;
	}	
	
	public Sede getSede() {
		return this.sede;
	}
	
	public String getDescripción() {
		
		String descripcion= new String();
		descripcion=this.marca;
		descripcion+="\n";
		descripcion+=this.color;
		descripcion+="\n";
		descripcion+=this.modelo;
		descripcion+="\n";
		descripcion+=this.transmision;
		
		
		return descripcion;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	

}
