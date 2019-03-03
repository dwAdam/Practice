package third;

public class FormatString {

	public static void main(String[] args) {
		
		double x = 5.6;
		double y = 9015.265;
		double z = y/x;
		
		System.out.printf("%2.7f\n",z);
		System.out.printf("%2.2f\n",(y/x));
		
		System.out.println();
		
		double a = 555.0;
		double b = 222.2;
		double c = b/a;
		
		System.out.printf("%2.4f\n",c);
		System.out.printf("%2.5f\n",(b/a));
		
		System.out.println();
		
		System.out.printf("%.1f  -  %.5f\n", c, z);
		System.out.printf("%.2f  *  %.10f\n", z, c);
		
	}

}