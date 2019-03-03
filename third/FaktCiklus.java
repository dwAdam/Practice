package Fakt;

public class FaktCiklus {

	static long fakt(int n) {
		long f=1;
		for (int i = 1; i <= n; i++) {
			f*=i;
		}
		return f; 
	}
	
	public static void main(String[] args) {
		System.out.println("Eredméyny: "+fakt(6));
		
	}

}
