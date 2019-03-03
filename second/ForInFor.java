package second;

public class ForInFor {

	public static void main(String[] args) {
		int[] tomb1 = {1,2,3,4,5};
		int[] tomb2 = {6,7,8,9,10};
		
		for (int i = 0; i < tomb1.length; i++) {
			System.out.print(".....");
			for (int j = 0; j < tomb2.length; j++) {
				System.out.print("|" + tomb1[i] + " " + tomb2[j] + "|");
			}
		}
		
		System.out.println();
		System.out.println();
		
		int[] tomb3 = {1,2,3};
		int[] tomb4 = {4,5,6};
		int[] tomb5 = {7,8,9};
		
		for (int i = 0; i < tomb3.length; i++) {
			System.out.print("...");
			for (int j = 0; j < tomb4.length; j++) {
				System.out.print("---");
				for (int j2 = 0; j2 < tomb5.length; j2++) {
					System.out.print("|" + tomb3[i] + " " + tomb4[j] + " " + tomb5[j2] + "|");
				}
			}
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < tomb5.length; i++) {
			System.out.print(tomb5.length + " ");
		}
		
		System.out.println();
		System.out.println();
		
		int[] segedTomb = {1,2,3,4,5};
		int[] segedTomb2 = {6,7,8,9,10};
		
		for (int i = 0; i < segedTomb.length; i++) {
			for (int j = segedTomb2.length-1; j >= (segedTomb2.length/segedTomb2.length)-1; j--) {
				System.out.print(segedTomb2[j] + ", ");
			}
		}

	}

}
