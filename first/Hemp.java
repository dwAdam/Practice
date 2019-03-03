package first;

public class Hemp {

	public static void main(String[] args) {
		
		String kender1 = "";
		String kender2 = "";
		String kender3 = "";
		String kender4 = "";
		String kender5 = "";
		
		kor10(kender1);
		kor10(kender2);
		kor10(kender3);
		kor10(kender4);
		kor10(kender5);
		
		System.out.println("1. kender: " + kor10(kender1));
		System.out.println("2. kender: " + kor10(kender2));
		System.out.println("3. kender: " + kor10(kender3));
		System.out.println("4. kender: " + kor10(kender4));
		System.out.println("5. kender: " + kor10(kender5));
		
	}
	
	public static String kor10(String x) {
		for (int i = 0; i < 10; i++) {
			int random = (int)((Math.random()*100)+1);
			if (random<=45) {
				x += "#";
			}
			if (random>45 && random<=90) {
				x += "##";
			}
			if (random>90) {
				i = 10;
				x = "";
			}
			
		}
		
		return x;
	}

}
