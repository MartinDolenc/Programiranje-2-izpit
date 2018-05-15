package hello;

public class Odvod {

	public static void main(String[] args) {
		double[] polinom = {1, 0, 2, 3};
		double[] odvod_polinoma = odvod(polinom, 1);
		
		for (int i = 0; i < odvod_polinoma.length; i++){
			
			System.out.println(odvod_polinoma[i]);
		}
		
		System.out.println(odvod_polinoma);
				
		
	}
	
	public static double[] odvod(double[] p, int n) {
		int stopnja = p.length;
		double[] odvod_polinoma = new double[p.length - 1];
		
		for (int x = 0; x < n; x++){
			for (int i = 1; i < stopnja; i++){
				odvod_polinoma[i - 1] = (int) (p[i] * i);
			}
			
			
//			p.remove(0);
			
		}
		
//		for (double y : odvod_polinoma) {
//			if (y == 0) {
//				
//			}
//		}
		
		return odvod_polinoma;
		
	}
	


	public static double[] odvod(double[] p) {
		return odvod(p, 1);
	}

}
