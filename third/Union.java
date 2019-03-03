package third;

//import java.util.ArrayList;
//import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Union {

	public static void main(String[] args) {
		
		int[] block1 = new int[20];
		
		System.out.print("ELSO TOMB: ");
													//Egy 20 elemu (0-tol 19-ig) tombot feltoltunk random szamokkal
		for (int i = 0; i < block1.length; i++) {
			block1[i] = (int)(Math.random()*100);
			System.out.print(block1[i] + ", ");
		}
		
		System.out.println();
		
		int[] block2 = new int[20];
		
		System.out.print("MASODIK TOMB: ");
													//Egy 20 elemu (0-tol 19-ig) tombot feltoltunk random szamokkal
		for (int i = 0; i < block2.length; i++) {
			block2[i] = (int)(Math.random()*100);
			System.out.print(block2[i] + ", ");
		}
		
		System.out.println();
		System.out.println();

		System.out.print("UNIO: ");
		
		Set<Integer> unio = new HashSet<Integer>();  // szinten egy uj kollekcioosztaly! Ez a HashSet egy olyan kollekcio, melyben nincsenek ismetlodo ertekek.

		for (int i = 0; i < block1.length; i++) {
		unio.add(block1[i]);
		}
													// vegigmegyunk a 2 tombon es belepakolgatjuk az unio-ba
		for (int i = 0; i < block2.length; i++) {
		unio.add(block2[i]);
		}
		
		System.out.print(unio);
													// egyszeru kiiratas --> a tombjelet es a ", "-t magatol csinalja az ertekek kozott
		System.out.println();
		System.out.println();
		
		/*
		System.out.print("Sorbarendezett UNIO: ");
		
		ArrayList<Integer> sorbarendezettUnio = new ArrayList<Integer>(unio);
		Collections.sort(sorbarendezettUnio);
		System.out.print(sorbarendezettUnio);
		*/
		
	}

}
