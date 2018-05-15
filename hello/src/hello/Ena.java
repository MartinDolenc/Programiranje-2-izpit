package hello;

public class Ena {

	public static void main(String[] args) {
		String[] nova_tabela = vse_se_zaène_z_ena("1", 10);
		
		System.out.println(naslednji_niz("12345"));
		
		for (int i = 0; i < nova_tabela.length; i++){
			System.out.println(nova_tabela[i]);
		}

	}
	
	public static String[] vse_se_zaène_z_ena(String niz, int n){
		String[] tabela_nizov = new String[n];
		tabela_nizov[0] = niz;
		
		for (int i = 1; i < n; i++){
			
			tabela_nizov[i] = naslednji_niz(niz);
			niz = naslednji_niz(niz);
		}
		return tabela_nizov;
		
	}
	public static String naslednji_niz(String niz){
		String nov_niz = "";
		int i = 0;
		
		while(i < niz.length()){
			int k = i;
			int stevec = 0;
			while (i<niz.length() && niz.charAt(i) == niz.charAt(k)){
				i++;
				stevec++;
			}
			nov_niz = nov_niz + stevec + niz.charAt(k);
		}
		return nov_niz;
	
	}
//	public static String naslednji_niz(String niz){
//		String nov_niz = new String();
//		char prazen = new char();
//		
//		for (int i = 0; i < niz.length(); i++){
//			int dolzina = niz.length();
//			
//			niz = niz.replaceAll(niz.substring(i, i), "");
//			int count = dolzina - niz.length();
//			
//		}
//		
//	}

}
