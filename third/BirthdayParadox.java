package third;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BirthdayParadox {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Emberek száma: ");
		int emberek = keyboard.nextInt();
		
		System.out.print("Tesztek száma: ");
		int tesztek = keyboard.nextInt();
		
		System.out.println();
		
		int[] csoport = new int[emberek];
		
		for (int i = 0; i < tesztek; i++) {
			for (int j = 0; j < emberek; j++) {
				csoport[j] = (int) ((Math.random()*364)+1);
				System.out.print(csoport[j] + ", ");
			}
		}
		

	}

}
