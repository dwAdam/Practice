package second;

public class Task2 {

	public static void main(String[] args) {
		int[] tomb1 = {0,2,5,7,9,5,5,5,4,9,3,5,2,0};  // tomb1.length = 14
		
		for (int i = 0; i < tomb1.length/2; i++) {
			if (tomb1[i] == tomb1[tomb1.length-1-i]) {
				System.out.print(tomb1[i] + ", ");
			} else {
				System.out.print("null, ");
			}
		}
		
		System.out.println();
		System.out.println();
		
		int[] tomb2 = {2,4,7,4,2,2};  // tomb1.length = 6
		
		for (int i = 0; i < tomb2.length/2; i++) {
			if (tomb2[i] == tomb2[tomb2.length-1-i]) {
				System.out.print(tomb2[i] + ", ");
			} else {
				System.out.print("null, ");
			}
		}
		
		System.out.println();
		System.out.println();
		
		int[] tomb3 = {0,2,5,7,2,5,2};  // tomb1.length = 7
		
		for (int i = 0; i < tomb3.length/2; i++) {  // 7/2 = 3
			if (tomb3[i] == tomb3[tomb3.length-1-i]) {
				System.out.print(tomb3[i] + ", ");
			} else {
				System.out.print("null, ");
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Nem a feladat része");
		
		int[] nemFeladat_tomb = {9,5,1,97531,5,1,5,9};
		
		for (int i = 0; i < nemFeladat_tomb.length/2; i++) {
			if (nemFeladat_tomb[i] == nemFeladat_tomb[nemFeladat_tomb.length-1-i]) {
				System.out.print(nemFeladat_tomb[i] + ", ");
			} else {
				System.out.print("null, ");
			}
		}

	}

}
