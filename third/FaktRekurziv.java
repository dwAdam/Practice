package Fakt;

public class FaktRekurziv {

	static long fakt(int n) {
		
		if (n==0) return 1;
		else return(fakt(n-1)*n);
	
	}
	
	public static void main(String[] args) {
		System.out.println("Eredméyny: "+fakt(6));
		
	}
}
