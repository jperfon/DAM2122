package testAppendObject;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class testAppend {
	
	static String  ruta="C:\\Users\\jperf\\Desktop\\numeros.dat";
	public static void main(String[] args) {
		writeObjects();
		readObjects();
	}
	
	/*Este método escribe un array de 10 enteros en un fichero. Si el fichero está vacio utiliza
	el  objeto ObjectOutputStream de Java. Si el fichero ya contiene datos utilizamos el que hemos creado nosotros.*/
	private static void writeObjects() {
		
		/*Como se ve, utilizamos el mismo tipo de variable para referirnos a un objeto de clase ObjectOutputStream
		y a un objeto de clase ObjectOutputStreamAppend. Esto puede hacerse debido a que una hereda de la otra y, en el fondo, 
		un ObjectOutputStreamAppend también es un ObjectOutputStream. Esta propiedad de los lenguajes orientados a objetos 
		se llama Polimorfismo. */
		ObjectOutputStream salida=null;
		File archivo=new File(ruta);
		int[] numeros=new int[10];
		for(int i=0;i<10;i++) {
			numeros[i]=(int)(Math.random()*50);
		}
		
		try {
			
			//verifico si el archivo ya contiene información.
			if(archivo.exists()&&archivo.length()>0) {
				
				System.out.println("Archivo con datos previos. Añádimos al final");
				salida=new ObjectOutputStreamAppend(new FileOutputStream(ruta,true));
				
			}else {
				System.out.println("Archivo vacio. Lo creamos");
				salida=new ObjectOutputStream(new FileOutputStream(ruta));
			}	
			
			salida.writeObject(numeros);
				
		}catch(EOFException ex) {}
		catch(IOException ex) {}
		finally {
			if(salida!=null) {
				try {
					salida.close();
				}catch(Exception ex) {}
			}
		}
	}
	private static void readObjects() {
		try(ObjectInputStream entrada=new ObjectInputStream(new FileInputStream(ruta))) {
			int[] numerosLeidos;
			while(true) {
				numerosLeidos=(int[])entrada.readObject();
				System.out.println(Arrays.toString(numerosLeidos));
			}
			
		}catch(EOFException ex) {
			
		}catch(Exception ex) {}
	}

}
