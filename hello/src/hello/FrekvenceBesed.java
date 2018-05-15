package hello;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class FrekvenceBesed {

	public static void main(String[] args) throws IOException {
		ArrayList<String[]> izjemne_besede = new ArrayList<String[]>();
//		izjemne_besede.add("enkratnemu");
		System.out.println(PrestejBesede("SloStopWords.txt"));
//		Map<String, Integer> data = PrestejBesede("SloStopWords.txt");
//		int dolzina = data.size();
		
//		for(int i = 0; i < dolzina; i++){
//			System.out.println();
//		}

	}
	
	public static Map<String, Integer> PrestejBesede(String imeVhod) throws IOException{
		BufferedReader vhod = new BufferedReader(new FileReader(imeVhod));
		Map<String, Integer> slovar = new HashMap<String, Integer>();
		
		while(vhod.ready()){
			String vrstica = vhod.readLine().trim();
			if(vrstica.equals(""))continue;
			StringTokenizer st = new StringTokenizer(vrstica, " .,()!?:;");
			
			while(st.hasMoreTokens()){
				String beseda = st.nextToken();
				if (slovar.containsKey(beseda)){
					
					slovar.put(beseda, slovar.get(beseda) + 1);
					
				} else{
					slovar.put(beseda, 1);
				}
			}
			
			
			}
		vhod.close();
		
		return slovar;
	}
	
	public static Map<String, Integer> PrestejBesedeIzjeme(String imeVhod, ArrayList<String[]> izjeme) throws IOException{
		BufferedReader vhod = new BufferedReader(new FileReader(imeVhod));
		Map<String, Integer> slovar = new HashMap<String, Integer>();
		
		while(vhod.ready()){
			String vrstica = vhod.readLine().trim();
			if(vrstica.equals(""))continue;
			StringTokenizer st = new StringTokenizer(vrstica, " .,()!?:;");
			
			while(st.hasMoreTokens()){
				String beseda = st.nextToken();
				
				if (!izjeme.contains(beseda)){
				
					if (slovar.containsKey(beseda)){
						
						slovar.put(beseda, slovar.get(beseda) + 1);
						
					} else{
						slovar.put(beseda, 1);
					}
				}
			}
			
			
			}
		vhod.close();
		
		return slovar;
	
	}
}
