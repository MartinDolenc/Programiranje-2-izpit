package hello;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SestejBesede {

	// Vržeš txt file v hello folder (project folder)
	
	public static void main(String[] args) throws IOException {
		System.out.println(PrestejBesede("podatki.txt","izhod.txt"));

	}
	
	public static int PrestejBesede(String imeVhod, String imeIzhod) throws IOException{
		BufferedReader vhod = new BufferedReader(new FileReader(imeVhod));
		PrintWriter izhod = new PrintWriter(new FileWriter(imeIzhod));
		int stevilo_besed = 0;
		
		while(vhod.ready()){
			String vrstica = vhod.readLine().trim();
			if(vrstica.equals(""))continue;
			String[] besede = vrstica.split(" +");
			
			stevilo_besed += besede.length;
			
			for(String s : besede){
				izhod.println(s);
			}
			
		}
		
		vhod.close();
		izhod.close();
		
		return stevilo_besed;
	}

}
