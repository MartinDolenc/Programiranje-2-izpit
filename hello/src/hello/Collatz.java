package hello;

public class Collatz {

	public static void main(String[] args) {
		System.out.println(dolzinaZaporedjaZanka(60));
		System.out.println(poudarjanjeZnakov("Zadnja novica"));
		razcepNaravnegaStevila(5761665);
	}
	
	public static int dolzinaZaporedjaRekurzija(int n){
		
		if (n == 1) {
			return 1;
		} else if (n%2 == 0){
			return dolzinaZaporedjaRekurzija(n/2) + 1;
		} else {
			return dolzinaZaporedjaRekurzija(n*3 + 1) + 1;
		}
		
	}
	
	public static int dolzinaZaporedjaZanka(int n){
		int a = 1;
		
		while (n != 1){
			if (n%2 == 0){
				a++;
				n = n/2;
			} else {
				a++;
				n = n*3 + 1;
			}
		}
		return a;
				
	}
	
	public static void razcepNaravnegaStevila(int n){
		char operator = '=';

		System.out.print(n);
		for (int i = 2; i*i < n; i++) {
			int stevec = 0;
			while (n%i == 0){
				stevec++;
				n = n/i;
			}
			if(stevec > 0){
				System.out.print(" " + operator + " " + i);
				if (stevec > 1){
					System.out.print("^" + stevec);
				}
			operator = '*';
			}
		}
		if(n > 1){
			System.out.print(" " + operator + n);
		}

	}
	
	public static String poudarjanjeZnakov(String str){
		String konec =  new String();
		int dolzina = str.length();
		
		for (int i = 0; i < dolzina; i++){
		    char c = str.charAt(i);
		    if(i < dolzina){
		    	konec += Character.toUpperCase(c) + " ";
		    } else {
		    	konec += Character.toUpperCase(c);
		    }
		}
		return konec;
	}
	
	public static String poudarjanje(String str){
		boolean aliPoudarja = false;
		String konec = new String();
		
		for (int i = 0; i < str.length(); i++){
		    char c = str.charAt(i);
		    if (c == '*'){
		    	aliPoudarja = !aliPoudarja;
		    }
		    if(aliPoudarja){
		    	konec += Character.toUpperCase(c);
		    } else{
		    	konec += c;
		    }
		}
		return konec;
	}
}