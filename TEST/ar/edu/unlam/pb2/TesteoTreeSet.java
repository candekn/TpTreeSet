package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.util.*; //java.util.TreeSet

import org.junit.Test;

public class TesteoTreeSet {

	@Test
	public void testRecorrerTreeSetConIterator() {
		Cancion song1 = new Cancion("Thunderstruck", "AC/DC", 4.52);
		Cancion song2 = new Cancion("Anything Goes", "AC/DC", 3.21);
		Cancion song3 = new Cancion("Love Song", "AC/DC", 5.16);
		Cancion song4 = new Cancion("Hells Bells", "AC/DC", 5.13);
		Cancion song5 = new Cancion("Crapsody In Blue", "AC/DC", 4.43);
		Cancion song6 = new Cancion("Anything Goes", "AC/DC", 3.21);
		Cancion song7 = new Cancion("Black Ice", "AC/DC", 3.24);
		//TreeSet
		TreeSet<Cancion> lista1 = new TreeSet<Cancion>();
		lista1.add(song1);
		lista1.add(song2);
		lista1.add(song3);
		lista1.add(song4);
		lista1.add(song5);
		lista1.add(song6);
		lista1.add(song7);
		//Reproducir con Iterator
		Iterator<Cancion> iterador=lista1.iterator();
		while(iterador.hasNext()){
			System.out.println(iterador.next().Reproducir());
		}
		System.out.println("  ");
	}
	
	@Test
	public void testRecorrerConForEach(){
		Cancion song1 = new Cancion("Demons", "Imagine Dragons", 2.55);
		Cancion song2 = new Cancion("Finisterra", "Mago De Oz", 15.16);
		Cancion song3 = new Cancion("Creep", "Radiohead", 3.55);
		Cancion song4 = new Cancion("Snuff", "Slipknot", 4.36);
		Cancion song5 = new Cancion("Patience", "Guns and Roses", 5.55);
		TreeSet<Cancion> lista2 = new TreeSet<Cancion>();
		lista2.add(song5);
		lista2.add(song3);
		lista2.add(song1);
		lista2.add(song4);
		lista2.add(song2);
		for(Cancion var: lista2){
			System.out.println(var.Reproducir());
		}
		System.out.println("  ");
		lista2.remove(song4);
		for(Cancion var: lista2){
			System.out.println(var.Reproducir());
		}
	}

}
