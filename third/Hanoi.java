package Hanoi;

public class hanoi {
	
	public static void hanoi(int db, String mirol, String mire, String seged) {
		if (db==1) {
			System.out.println(mirol + " --> " + db + " --> " + mire);
		} else {
			hanoi(db-1,mirol,seged,mire);
			System.out.println(mirol + " --> " + db + " --> " + mire);
			hanoi(db-1,seged,mire,mirol);
		}
	}

	public static void main(String[] args) {
		
		hanoi(3,"a","b","c");
		//rekurziv fv. hivas
	}

}
