package hu.file;

import java.io.*;
import java.util.*;

public class Beolvas {
	
	
	 private static BufferedReader br;
	 private static char[] tomb;
	 private static int tombhossz;
	 
	 public static void beolvas() throws IOException {
		 try {
			br = new BufferedReader(new FileReader("src/szoveg.txt"));
		 tombhossz = 0;
		 int s = br.read();
		 while (s != -1) {
			 tombhossz++;
			 s = br.read();
		 }
		 br.close();
		 tomb=new char[tombhossz];
		 br = new BufferedReader(new FileReader("src/szoveg.txt"));
		 for (int i = 0; i < tombhossz; i++) {
			 tomb[i] = (char) br.read();
		 }
		 br.close();
	 } catch (IOException e) {
         e.printStackTrace();}
	 }
			
	 public static BufferedReader getBr() {
	        return br;
	    }

	    public void setBr(BufferedReader br) {
	        this.br = br;
	    }

	    public static char[] getTomb() {
	        return tomb;
	    }

	    public void setTomb(char[] tomb) {
	        this.tomb = tomb;
	    }

	    public static int getTombHossz() {
	        return tombhossz;
	    }

	    public void setTombHossz(int meret) {
	        this.tombhossz = tombhossz;
	    }
	
	
	public static void proc() throws IOException {
		beolvas();
		System.out.println("Ez a filebol olvasott:");
		System.out.println(getTomb());		
	}
	
}
