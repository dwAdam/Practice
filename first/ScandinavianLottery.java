package first;

public class ScandinavianLottery {

	public static void main(String[] args) {
		
		System.out.println("*****SKANDINAV LOTTO*****");
		System.out.println();
		
		int[] sorsolas = new int[7];
		
		int y;
		System.out.print("Elso jatek: " + "\t\t");
		for (int i = 0; i < sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*35)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(sorsolas,y));
			sorsolas[i] = y;
			
			System.out.print(sorsolas[i] + ", ");
		}
		/*
		System.out.println();
		System.out.print("Masoik jatek: " + "\t\t");
		for (int i = 0; i < sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*35)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(sorsolas,y));
			sorsolas[i] = y;
			
			System.out.print(sorsolas[i] + ", ");
		}
		
		System.out.println();
		System.out.print("Harmadik jatek: " + "\t");
		for (int i = 0; i < sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*35)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(sorsolas,y));
			sorsolas[i] = y;
			
			System.out.print(sorsolas[i] + ", ");
		}
		
		System.out.println();
		System.out.print("Negyedik jatek: " + "\t");
		for (int i = 0; i < sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*35)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(sorsolas,y));
			sorsolas[i] = y;
			
			System.out.print(sorsolas[i] + ", ");
		}
		
		System.out.println();
		System.out.print("Otodik jatek: " + "\t\t");
		for (int i = 0; i < sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*35)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(sorsolas,y));
			sorsolas[i] = y;
			
			System.out.print(sorsolas[i] + ", ");
		}
		
		System.out.println();
		System.out.print("Hatodik jatek: " + "\t\t");
		for (int i = 0; i < sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*35)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(sorsolas,y));
			sorsolas[i] = y;
			
			System.out.print(sorsolas[i] + ", ");
		}
		
		System.out.println();
		System.out.print("Hetedik jatek: " + "\t\t");
		for (int i = 0; i < sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*35)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(sorsolas,y));
			sorsolas[i] = y;
			
			System.out.print(sorsolas[i] + ", ");
		}
		
		System.out.println();
		System.out.print("Nyolcadik jatek: " + "\t");
		for (int i = 0; i < sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*35)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(sorsolas,y));
			sorsolas[i] = y;
			
			System.out.print(sorsolas[i] + ", ");
		}
		
		System.out.println();
		System.out.print("Kilecedik jatek: " + "\t");
		for (int i = 0; i < sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*35)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(sorsolas,y));
			sorsolas[i] = y;
			
			System.out.print(sorsolas[i] + ", ");
		}
		
		System.out.println();
		System.out.print("Tizedik jatek: " + "\t\t");
		for (int i = 0; i < sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*35)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(sorsolas,y));
			sorsolas[i] = y;
			
			System.out.print(sorsolas[i] + ", ");
		}
*/
	}
	
	public static boolean tombElemeVizsgalat(int[] xtomb, int x) {
		
		boolean aTombReszeMarSajnos = false;
		
		for (int i = 0; i < xtomb.length; i++) {
			if (xtomb[i] == x) {
				aTombReszeMarSajnos=true;
				break;
			}
		}
		return aTombReszeMarSajnos;
	}

}
