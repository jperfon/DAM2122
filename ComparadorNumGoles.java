package Futbolistas;

import java.util.Comparator;

public class ComparadorNumGoles implements Comparator<Futbolista>{
	
	public int compare(Futbolista fut1, Futbolista fut2) {
		
		return fut1.getNumGoles()-fut2.getNumGoles();	
	}
}
