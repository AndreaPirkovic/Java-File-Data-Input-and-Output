package pirkovic.andrea;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
// Za ulazno izlazne informacije JAVA koriti tokove(Stream)
		//Strimovi obezbedjuju nacine za rad sa podacima koji se primaju ili salju.
		
		//klasa koja omogucuje da se poveze tastatura sa stream-om
		
		DataInputStream dis = new DataInputStream(System.in);
		//povezivanje fajla sa klasom FileOutputStream
		
		FileOutputStream fos = new FileOutputStream("rezultat.txt");
			System.out.println("Unesite string (unosom $ prekinite unos)");	
	
	// read() do unosa znaka $ se cita unos
			//i upisuje pomocu write()
			char ch;
			
			while((ch=(char)dis.readChar())!='$') {
				fos.write(ch);
							}
			fos.close();
			}
			
			
	
	}


