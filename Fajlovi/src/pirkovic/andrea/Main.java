package pirkovic.andrea; 

import java.io.File; 
public class Main { 
	public static void main(String[] args) { 
		
		File f = new File("C:\\Users\\pirko\\Desktop\\andrea.java");
		System.out.println("Fajl: " + f.getName() + (f.isFile() ? " je fajl " : " nije fajl!"));

			 System.out.println("Apsolutna putanja: " + f.getAbsolutePath()); 
			 System.out.println(f.exists() ? "Fajl postoji " : "Fajl ne postoji"); 
			 System.out.println(f.isDirectory() ? "Direktorijum" : "Fajl"); 
			 System.out.println(f.canRead() ? "Fajl moze biti procitan!" : "Fajl ne moze biti procitan!"); 
			 System.out.println(f.canWrite() ? "Omoguceno je upisavanje" : "Nije omoguceno upisivanje"); 
			 System.out.println("Velicina: " + f.length()); 
			 System.out.println("Poslednja promena fajla: " + f.lastModified()); 
			 } }