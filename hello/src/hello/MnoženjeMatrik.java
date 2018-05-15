package hello;

public class MnoženjeMatrik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Ne vem èe je prov
	
	public static double[][] zmnozi(double[][] a, double[][] b){
		double[][] c = new double[a.length][a[0].length];
		
		if ((a.length != b[0].length) || (a[0].length != b.length)) {
			return null;
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				c[i][j] = zmnozek(a[i], b[j]);
			}
		}
		
		return c;		
	}
	
	public static double zmnozek(double[] a, double[] b) {
		double x = 0;
		
		for (double y : a) {
			for (double z : b) {
				x += y*z;
			}
		}
		
		return x;
	}

}
