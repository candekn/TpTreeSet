package ar.edu.unlam.pb2;

public class Cancion implements Comparable<Cancion>{
	//Atributos
		private String nombre;
		private String autor;
		private Double duracion;
		//Metodos
		public Cancion(String nombre, String autor, Double duracion){
			this.nombre=nombre;
			this.autor=autor;
			this.duracion=duracion;
		}
		public String Mostrarlista(){
			return this.nombre+ "(" + this.autor + ")" ;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor= autor;
		}
		public Double getDuracion() {
			return duracion;
		}
		public void setDuracion(Double duracion) {
			this.duracion = duracion;
		}
		@Override
		public int compareTo(Cancion o) { 
			if(this.nombre.equals(o.nombre)){
				if(this.autor.equals(o.autor)){
					return this.nombre.compareTo(o.nombre);
				}
				else{
					return this.autor.compareTo(o.autor);
				}
			}
			else{
				return this.nombre.compareTo(o.nombre);
			}
		}


}
