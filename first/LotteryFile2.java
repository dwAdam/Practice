package first;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class LotteryFile2 {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("lotto2018");
			
			for (int i = 0; i < 52; i++) {
				String line = "";
				int[] numbers = new int[5];
				int randomNum;
				//****************
			    for (int j = 0; j < 5; j++) {
			        randomNum = (int)(Math.random()*89+1);
			        for (int x = 0; x < j; x++) {
			            if (numbers[x] == randomNum) {
			                randomNum = (int)(Math.random()*89+1);
			                x = -1;
			            }
			        }
			        numbers[j] = randomNum;
			        
			    }
				//****************
			    Arrays.sort(numbers);
				fw.write(line + "\n");
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
