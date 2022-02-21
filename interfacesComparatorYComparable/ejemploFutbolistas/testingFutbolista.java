package Futbolistas;

import java.util.Arrays;
import java.util.Collections;

public class testingFutbolista {

	public static void main(String[] args) {
		Futbolista[] jugadores=new Futbolista[8];
		
		jugadores[0]=new Futbolista("71160090K",34,"Messi",5);
		jugadores[1]=new Futbolista("81160090K",32,"Cristiano",7);
		jugadores[2]=new Futbolista("45660090K",21,"Mbappe",15);
		jugadores[3]=new Futbolista("20000900K",18,"Pedri",12);
		jugadores[4]=new Futbolista("460600900K",32,"Aubameyang",3);
		jugadores[5]=new Futbolista("121600900K",32,"Benzema",17);
		jugadores[6]=new Futbolista("950600900K",19,"Ansu Fati",5);
		jugadores[7]=new Futbolista("325435354Z",20,"Haaland",30);
		
		ComparadorEdad comparadorEdad=new ComparadorEdad();
		ComparadorNumGoles comparadorGoles=new ComparadorNumGoles();
		ComparadorNombre comparaNombres=new ComparadorNombre();
		
		//Ordena los jugadores por DNI creciente, tal y como está establecido en el compareTo() de la interfaz Comparable
		Arrays.sort(jugadores);
		
		//Ordena los jugadores por DNI de manera decreciente
		Arrays.sort(jugadores,Collections.reverseOrder());
		
		//ordena los jugadores de manera  en función de su edad creciente usando un objeto de tipo Comparator
		Arrays.sort(jugadores, comparadorEdad);
		
		//ordena los jugadores de manera decreciente en función de su edad usando un objeto de tipo Comparator
		Arrays.sort(jugadores, comparadorEdad.reversed());
				

		//ordena los jugadores de manera creciente en función de su número de goles usando un objeto de tipo Comparator
		Arrays.sort(jugadores, comparadorGoles);
		
		//ordena los jugadores de manera decreciente en función de su número de goles usando un objeto de tipo Comparator
		Arrays.sort(jugadores, comparadorGoles.reversed());
		
		
		//Ordena los jugadores de manera creciente en función de su nombre, de forma alfabética
		Arrays.sort(jugadores,comparaNombres);
		//ordena los jugadores de manera decreciente en función de su nombre, de forma alfabética
		
		Arrays.sort(jugadores,comparaNombres.reversed());
		
		//Ordenación según múltiples parámetros. Primero ordena por edad, si son iguales ordena por número de goles
		//y si también son iguales, por nomcbre.
		Arrays.sort(jugadores, comparadorEdad.thenComparing(comparadorGoles).thenComparing(comparaNombres));
		
		
		//Búsqueda de un objeto que coincida en DNI con 45660090K. El array debe estar previamente ordenado de forma creciente.
		Arrays.sort(jugadores);
		int posicion=Arrays.binarySearch(jugadores,new Futbolista("45660090K",32,"pepito",20));
		
		for(Futbolista jugador:jugadores) {
			System.out.println(jugador.toString());
		}
		
		System.out.println("Enconrado en "+posicion);
		
	}

}
