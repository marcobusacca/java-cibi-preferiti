package org.lessons.java.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		String[] foodArray = {"Pizza margherita", "Bistecca alla fiorentina", "Pasta Carbonara", "Lasagne", "Arancine", "Polenta"};
		
		
		System.out.println("Lunghezza della classifica: " + foodArray.length);
		
		System.out.println("Il mio cibo TOP: " + foodArray[0]);
		
		System.out.println("Il mio cibo preferito ma non troppo: " + foodArray[foodArray.length - 1]);
	}
}
