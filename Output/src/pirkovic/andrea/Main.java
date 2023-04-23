package pirkovic.andrea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("ispis.txt");
	System.out.println("Sadrzaj fajla: ");
	// read() cita jedan po jedan bajt iz datoteke i
	// vraca ga kao celobrojnu vrednost
	//kada stigne do kraja metoda read() vraca -1 vrednost.
	
	int ch;
	
	while((ch= fis.read())!= -1) {
		System.out.print((char)ch);
	}
	fis.close();
	
	}

}
