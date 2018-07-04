package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class TesteoTreeSet {

	@Test
	public void test1() {
		Cancion song1 = new Cancion("Thunderstruck", "AC/DC", 4.52);
		Cancion song2 = new Cancion("Crazy", "Aerosmith", 3.21);
		Cancion song3 = new Cancion("Love Song", "AC/DC", 3.04);
		Cancion song4 = new Cancion("Hells Bells", "AC/DC", 5.13);
		Cancion song5 = new Cancion("Crapsody In Blue", "AC/DC", 4.43);
		Cancion song6 = new Cancion("Anything Goes", "AC/DC", 3.21); //Este objeto es igual que
		Cancion song7 = new Cancion("House Of Gold", "Twenty One Pilots", 3.24);
		Cancion song8 = new Cancion("Anything Goes", "AC/DC", 3.21); //este
		//TreeSet
		TreeSet<Cancion> lista1 = new TreeSet<Cancion>();
		lista1.add(song2);
		lista1.add(song8);
		lista1.add(song5);
		lista1.add(song3);
		lista1.add(song6);
		lista1.add(song4);
		lista1.add(song7);
		lista1.add(song1);
		System.out.println("Primer Ejemplo: \n");
		//Creamos la lista
		Iterator<Cancion> iterador=lista1.iterator();
		while(iterador.hasNext()){
			System.out.println(iterador.next().Mostrarlista());
		}
		System.out.println("\nBorramos las canciones de AC/DC: \n");
		//Removemos las canciones usando el método RemoveIf
		
				lista1.removeIf(s->s.getAutor().equals("AC/DC"));	
	
		
		assertEquals(2,lista1.size()); //acá, con un assert verificamos que solo hayan quedado las dos canciones
										//que no son de AC/DC
		//Imprimimos la nueva lista usando un foreach
		for(Cancion var: lista1){
			System.out.println(var.Mostrarlista());
		}
		System.out.println(" ");
	}
	
	@Test
	public void test2(){
		Cancion song1 = new Cancion("Demons", "Imagine Dragons", 2.55);
		Cancion song2 = new Cancion("Apologize", "One Republic", 3.28);
		Cancion song3 = new Cancion("Creep", "Radiohead", 3.55);
		Cancion song4 = new Cancion("Snuff", "Slipknot", 4.36);
		Cancion song5 = new Cancion("Apologize", "Silverstein", 5.55);
		TreeSet<Cancion> lista2 = new TreeSet<Cancion>();
		lista2.add(song1);
		lista2.add(song2);
		lista2.add(song3);
		lista2.add(song4);
		lista2.add(song5);
		System.out.println("Segundo Ejemplo: \n");
		for(Cancion var: lista2){
			System.out.println(var.Mostrarlista()); //Aunque dos canciones tienen el mismo nombre,
													//Se agregan igual porque el autor es distinto
		}
		System.out.println("  ");
		//Removemos un objeto en específico
		lista2.remove(song4);
		for(Cancion var: lista2){
			System.out.println(var.Mostrarlista());
		}
		//removemos todo
		lista2.clear();
		//verificamos con un assert si la lista está vacía
		assertTrue(lista2.isEmpty());
	}
	


}
