package Futbolistas;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Futbolista> {

	public int compare(Futbolista fut1, Futbolista fut2) {
		//>0 si fut1 es mayor que fut2
		//0 si son iguales
		//<0 si fut1 es menor que fut2
		
		return fut1.getEdad()-fut2.getEdad();
	}
}
