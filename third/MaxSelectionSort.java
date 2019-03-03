package third;

import java.util.Arrays;

public class MaxSelectionSort {

	public static void main(String[] args) {
		
		int[] block = new int[5];
		
		System.out.print("Rendezetlen tomb: ");
		
		for (int i = 0; i < block.length; i++) {
			block[i] = (int)(Math.random()*1000);
			System.out.print(block[i] + ", " + "\t"); // Escape-szekvencia --> Nezd meg a csatolt txt fajlomat
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("Rendezett tomb: ");
		
		Arrays.sort(block); 								// Ha lesz idod nezz utana ennek a metodusnak, elhiheted tetszeni fog. --> elso tipp: google --> ,,arrays webotlet java"
		System.out.print(Arrays.toString(block)); 			// Vegyed eszre, hogy importaltunk ehhez, fent a 3.sorban ! --> Katt az Arrays-ra es Ctrl+Space
		
		//BUBOREK RENDEZES
		/*boolean rendezett = false;
		while (!rendezett){
		    rendezett = true;
		    for (int j=1; j<block.length; j++){
		        if (block[j-1]>block[j]){
		            int v = block[j-1];
		            block[j-1] = block[j];
		            block[j] = v;
		            rendezett = false;
		        }
		    }
		}*/

	}

}
