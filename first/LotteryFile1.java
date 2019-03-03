package first;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class LotteryFile1 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("lottto2018");
			
			for (int i = 0; i < 52; i++) {
				String line = "";
				int[] numbers = weekNumbers();
				Arrays.sort(numbers);
				
				for (int j = 0; j < numbers.length; j++) {
					if (j == 4) {
						line += numbers[j];
					} else {
						line += numbers[j] + ",";
					}
				}
				
				fw.write(line + "\n");
			}
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}
	
	public static int[] weekNumbers() {
		int[] numbers = new int[5];
		
		for (int i = 0; i < numbers.length; i++) {
			int plusVariable;
			do {
				plusVariable = (int)(Math.random()*89+1);
			} while(partOfTheArray(plusVariable,numbers));
			numbers[i] = plusVariable;
		}
		
		return numbers;
	}
	
	public static boolean partOfTheArray(int number, int[] array) {
		boolean partArray = false;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				partArray = true;
				break;
			}
		}
		
		return partArray;
	}

}
