package third;

public class SecondLargestNegativeNumber {

	public static void main(String[] args) {
		
		int[] randomBlock = new int[10];
		
		int legnagyobbPozitiv = -100;
		int legnagyobbNegativ = -100;
		int masodikLegnagyobbNegativ = -100;
		int masodikLegnagyobbPozitiv = -100;
		
		for (int i = 0; i < randomBlock.length; i++) {
			randomBlock[i] = (int)(Math.random()*200-100);
			System.out.print(randomBlock[i] + ", ");
							// Legnagyobb negativ, masodik legnagyobb negativ
			if (randomBlock[i] < 0 && randomBlock[i] > legnagyobbNegativ) {					 //Ha a random generalt elemunk kisebb mint 0 es nagyobb, mint a legnagyobb negativ szamunk
				masodikLegnagyobbNegativ = legnagyobbNegativ; 								 // akkor a masodik legnagyobb negativ felveszi a legnagyobb negativ erteket
				legnagyobbNegativ = randomBlock[i];  										// majd a legnagyobb negativ felveszi ezt a random generalt elemet
			} else if (randomBlock[i] > masodikLegnagyobbNegativ && randomBlock[i] < 0) {	 // kivetel, HA a random elemunk nagyobb, mint a masodik legnagyobb es kisebb, mint 0
				masodikLegnagyobbNegativ = randomBlock[i];									 // akkor a masodik legnagyobb negativ felveszi ezt a random generalt elemet
			}
							// Legnagyobb pozitiv, masodik legnagyobb pozitiv
			if (randomBlock[i] > 0 && randomBlock[i] >legnagyobbPozitiv) {
				masodikLegnagyobbPozitiv = legnagyobbPozitiv;
				legnagyobbPozitiv = randomBlock[i];
			} else if (randomBlock[i] > 0 && randomBlock[i] < legnagyobbPozitiv) {
				masodikLegnagyobbPozitiv = randomBlock[i];
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Masodik legnagyobb negativ szamunk: " + masodikLegnagyobbNegativ);
		
		System.out.println();
		
		System.out.println("Masodik legnagyobb pozitiv szamunk: " + masodikLegnagyobbPozitiv);
		
		System.out.println();
		
		System.out.println("Legnagyobb negativ: " + legnagyobbNegativ);
		System.out.println("Legnagyobb pozitiv: " + legnagyobbPozitiv);
		
	}

}
