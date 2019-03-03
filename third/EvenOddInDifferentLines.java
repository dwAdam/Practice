package third;

public class EvenOddInDifferentLines {

	public static void main(String[] args) {
		
		int[] block = new int[20];  // tomb a random szamoknak
		
		int[] paros = new int[20];  // kulon tomb a paros szamoknak
		int xy = 0; 				//segedvaltozo
		
		int[] paratlan = new int[20]; //kulon tomb a paratlan szamoknak
		int x = 0; 					 // segedvaltozo
		
		for (int i = 0; i < block.length; i++) {
			block[i] = (int)(Math.random()*100);		 //random generalas
			System.out.print(block[i] + ", "); 			 // random szamok kiirasa 1 sorba
			
			if (block[i]%2 == 0) {  					// ha a random szam maradek nelkul oszthato 2vel, akkor
				paros[xy] = block[i]; 					//a paros tomb int xy = 0;-ik eleme vegye fel azt az erteket, majd
				xy++; 									// ezt a int xy = 0; erteket novelje meg egyel, int xy = 1;-re
			} else {  									// ha nem teljesul a feltetel, akkor
				paratlan[x] = block[i]; 				 // a tomb tomb int x = 0;-ik eleme vegye fel azt az erteket, majd
				x++;									 // ezt az int x = 0; erteket novelje meg egyel int x = 1;-re
			}
		} 		 // itt leptunk ki a for ciklusbol
		
		// feltoltottuk a 3 tombunket --> paros, paratlan, block --> paros, paratlan feltetelekkel, a block nevu tombot meg csak random szamokkal
		
		System.out.println();
		System.out.println();
		
		System.out.print("Paros szamok: ");
		for (int i = 0; i < paros.length; i++) { 		 //ugye mar van egy feltoltott paros nevu tombunk. Ezen vegigmegyunk az elso elemetol (AMI A NULLADIK ELEME) es
			if (paros[i] != 0) { 						 // HA ez az elem NEM EGYENLO 0-val, akkor
				System.out.print(paros[i] + ", "); 		// kiirjuk
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("Paratlan szamok: ");
		for (int i = 0; i < paratlan.length; i++) { 	 // itt ugyanaz, mint a paros resznel --> Erdemes arra figyelni, hogy igazabol itt az IF feltetelnek nincs jelentosege.. Ha gondolod talad ki, hogy miert
			if (paratlan[i] != 0) {
				System.out.print(paratlan[i] + ", ");
			}
		}

	}

}
