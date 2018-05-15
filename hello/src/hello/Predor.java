package hello;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Predor {

	public static void main(String[] args) throws IOException {
		System.out.println(PredorHitrosti("podatki.txt", "izhodPredor.txt"));

	}
	
	public static int PredorHitrosti(String imeVhod, String imeIzhod) throws IOException{
		BufferedReader vhod = new BufferedReader(new FileReader(imeVhod));
		PrintWriter izhod = new PrintWriter(new FileWriter(imeIzhod));
		double povprecna_hitrost = 22.22;
		int stevilo_krsiteljev = 0;
		
		DecimalFormatSymbols symbol = new DecimalFormatSymbols();
		symbol.setDecimalSeparator('.');
		
		DecimalFormat df = new DecimalFormat("0.00", symbol);
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		
		while(vhod.ready()){
			String vrstica = vhod.readLine().trim();
			if(vrstica.equals(""))continue;
			String[] besede = vrstica.split(" +");
			
			int cas = Integer.parseInt(besede[1]) - Integer.parseInt(besede[0]);
			double hitrost = 622.00/(double)cas;
			
			if(hitrost > povprecna_hitrost){
				stevilo_krsiteljev ++;
				izhod.println(besede[2] + " " + df.format(hitrost));
			}
			
			
		}
		
		vhod.close();
		izhod.close();
		
		return stevilo_krsiteljev;
	}

}
