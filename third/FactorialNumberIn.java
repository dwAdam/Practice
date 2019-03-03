package third;

import java.util.Scanner;

public class FactorialNumberIn {

	public static void main(String[] args) {
		
		System.out.println("Annyit sugok, hogy a 0! erteke az 1, es mivel ezt mar tudod, igy felesleges is megkerdezned ezt tolem.");
		System.out.println();
		System.out.print("Szoval, melyik pozitiv egesz szam faktorialis ertekere vagy kivancsi? --> ");
		
		Scanner keyboard = new Scanner(System.in);										 //ahogy beirtad, hogy Scanner rogton utana nyomd le ezt a billentyukombinaciot --> Ctrl+Space --> Nincs mit
		
		long bekertFaktorialis = keyboard.nextInt(); 									 // a bekertFaktorialis-nak a beirt szamot adjuk meg erteknek
		long faktorialisErtek = 1; 														 // segedvaltozo
		
		do {
			
			if (bekertFaktorialis == 0) {												 // ha a bekert szam 0, akkor a kovetkezo 2 sor feltetele fog lefutni --> 23. es 24. sor
				System.out.print("Olvass vissza, a nullat mar tudod. Tehat a szamom: ");
				bekertFaktorialis = keyboard.nextInt(); 								// bekerunk egy masik szamot neki
			} else if (bekertFaktorialis < 0) { 										// ha a bekert szam Negativ, akkor a kovektezo 2 sor fog lefutni --> 26. es 27. sor
				System.out.print("Ne negativot, hanem egy POZITIV EGESZ szamot. Tehat szamom: ");
				bekertFaktorialis = keyboard.nextInt(); 								// bekereunk egy masik szamot neki
			}
			
		} while (bekertFaktorialis <= 0);												 // amig a beirt szamunk kisebb egyenlo, mint NULLA, addig folyton ujrafut az egesz
		
		if (bekertFaktorialis > 0) {													 // ha a bekert szamunk (long bekertFaktorialis = keyboard.nextInt();) nagyobb, mint NULLA
			for(long x = 1; x <= bekertFaktorialis; x++) { 								 // akkor addig megyunk vegig x=1-tol amig nem lesz egyenlo a bekert szamunkkal az x !!
				faktorialisErtek *= x; 													 // minden ujrageneralt x-et hozzaszorzunk a mar meglevo ertekhez --> 5! = 1*2*3*4*5 = 120
			}
		}
		
		System.out.println();
		
		System.out.print(bekertFaktorialis + "! = " + faktorialisErtek);
		
		keyboard.close();																// illik lezarni a scanner osztalyunkat, hogy ne varjon a program tovabbi bekerest --> LEFUTNA NELKULE IS

	}

}
