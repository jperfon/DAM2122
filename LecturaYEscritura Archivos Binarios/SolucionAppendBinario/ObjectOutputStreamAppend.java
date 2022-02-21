package testAppendObject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/*Heredamnos de la clase ObjectOutputStream y sobreescribimos su m�todo writeStreamHeader(). 
  Creamos un constructor con un FileOutputStream como par�metro, el cual le pasamos al constructor
  de la clase padre(ObjectOutputStream) con super()*/
public class ObjectOutputStreamAppend extends ObjectOutputStream {

	public ObjectOutputStreamAppend(FileOutputStream fileOutput) throws IOException {
		super(fileOutput);
	}
	
	@Override
	protected void writeStreamHeader() throws IOException{
		
		
	}
}
