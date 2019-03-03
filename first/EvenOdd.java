package first;

public class EvenOdd {

	public static void main(String[] args) {
		int[] block = new int[100];
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < block.length; i++) {
			block[i] = (int) ((Math.random()*201));
			if (block[i]%2 == 0) {
				even += block[i];
			} else {
				odd += block[i];
			}
		}
		
		System.out.println("Even value: " + even);
		System.out.println("Odd value: " + odd);
		System.out.println();
		
		if (even > odd) {
			System.out.print("The even numbers' value is bigger. The value is " + even + ".");
		} else if (even < odd) {
			System.out.print("The odd numbers' value is bigger. The value is " + odd + ".");
		} else if (even == odd) {
			System.out.print("The numbers' value is equal. The value is " + odd + ".");
		}
		
	}

}
