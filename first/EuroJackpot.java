package first;

public class EuroJackpot {
	
	public static void main(String[] args) {
		System.out.println("*****EUROJACKPOT*****");
		System.out.println();
		
		int[] elsomezo_sorsolas = new int[5];
		int[] masodikmezo_sorsolas = new int[2];		
		
		int y;
		System.out.print("A mezo: " + "\t\t");
		for (int i = 0; i < elsomezo_sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*50)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(elsomezo_sorsolas,y));
			elsomezo_sorsolas[i] = y;
			
			System.out.print(elsomezo_sorsolas[i] + ", ");
		}
		System.out.println();
		System.out.print("B mezo: " + "\t\t");
		for (int i = 0; i < masodikmezo_sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*10)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(masodikmezo_sorsolas,y));
			masodikmezo_sorsolas[i] = y;
			
			System.out.print(masodikmezo_sorsolas[i] + ", ");
		}
		
		System.out.println();
		System.out.println();
		System.out.print("A mezo: " + "\t\t");
		for (int i = 0; i < elsomezo_sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*50)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(elsomezo_sorsolas,y));
			elsomezo_sorsolas[i] = y;
			
			System.out.print(elsomezo_sorsolas[i] + ", ");
		}
		System.out.println();
		System.out.print("B mezo: " + "\t\t");
		for (int i = 0; i < masodikmezo_sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*10)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(masodikmezo_sorsolas,y));
			masodikmezo_sorsolas[i] = y;
			
			System.out.print(masodikmezo_sorsolas[i] + ", ");
		}
		
		System.out.println();
		System.out.println();
		System.out.print("A mezo: " + "\t\t");
		for (int i = 0; i < elsomezo_sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*50)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(elsomezo_sorsolas,y));
			elsomezo_sorsolas[i] = y;
			
			System.out.print(elsomezo_sorsolas[i] + ", ");
		}
		System.out.println();
		System.out.print("B mezo: " + "\t\t");
		for (int i = 0; i < masodikmezo_sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*10)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(masodikmezo_sorsolas,y));
			masodikmezo_sorsolas[i] = y;
			
			System.out.print(masodikmezo_sorsolas[i] + ", ");
		}
		
		System.out.println();
		System.out.println();
		System.out.print("A mezo: " + "\t\t");
		for (int i = 0; i < elsomezo_sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*50)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(elsomezo_sorsolas,y));
			elsomezo_sorsolas[i] = y;
			
			System.out.print(elsomezo_sorsolas[i] + ", ");
		}
		System.out.println();
		System.out.print("B mezo: " + "\t\t");
		for (int i = 0; i < masodikmezo_sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*10)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(masodikmezo_sorsolas,y));
			masodikmezo_sorsolas[i] = y;
			
			System.out.print(masodikmezo_sorsolas[i] + ", ");
		}
		
		System.out.println();
		System.out.println();
		System.out.print("A mezo: " + "\t\t");
		for (int i = 0; i < elsomezo_sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*50)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(elsomezo_sorsolas,y));
			elsomezo_sorsolas[i] = y;
			
			System.out.print(elsomezo_sorsolas[i] + ", ");
		}
		System.out.println();
		System.out.print("B mezo: " + "\t\t");
		for (int i = 0; i < masodikmezo_sorsolas.length; i++) {
			do {
				do {
					y = (int)((Math.random()*10)+1);
				} while (y == 0);
			} while (tombElemeVizsgalat(masodikmezo_sorsolas,y));
			masodikmezo_sorsolas[i] = y;
			
			System.out.print(masodikmezo_sorsolas[i] + ", ");
		}
		
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