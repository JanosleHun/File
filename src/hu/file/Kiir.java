package hu.file;

import java.io.*;
import java.util.*;

public class Kiir {
	static Scanner scan = new Scanner(System.in);
	static String bevitt = null;
	
	public static void bevitel() {	
		System.out.println("Kérem adja meg a szöveget:");
		bevitt = scan.next();
		scan.close();
		System.out.println("A bevitt szöveg:");
		System.out.println(getBevitt());
	}
	
	public static String getBevitt() {
		return bevitt;
	}
	
	public void setBevitt(String bevitt) {
		Kiir.bevitt=scan.next();
	}
		
	
	public static void proc() throws IOException {
		bevitel();
		FileWriter kiirat= new FileWriter("src/szoveg.txt");
		PrintWriter printWriter = new PrintWriter(kiirat);
		printWriter.print(getBevitt());
		printWriter.close();
	}
			
}
