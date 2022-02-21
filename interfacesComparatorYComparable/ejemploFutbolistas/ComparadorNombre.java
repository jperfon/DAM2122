package Futbolistas;

import java.util.Comparator;

	public class ComparadorNombre implements Comparator<Futbolista>{
		
		public int compare(Futbolista fut1, Futbolista fut2) {
			
		
			return fut1.getNombre().compareToIgnoreCase(fut2.getNombre());
		}			
}
