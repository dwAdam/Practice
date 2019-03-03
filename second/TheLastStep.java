package second;

import java.util.Scanner;

public class TheLastStep {

	public static void main(String[] args) {
		
		System.out.println("********** THE LAST STEP **********");
		System.out.println();
		System.out.println("THE FIRST STEP  (Please, give TWO different numbers between 1 and 5)");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("1: ");
		int firstStep1;
		firstStep1 = keyboard.nextInt();
		if (firstStep1>5 || firstStep1<1) {
			do {
				System.out.println("Two different numbers between 1 and 5");
				System.out.print("1: ");
				firstStep1 = keyboard.nextInt();
			} while (firstStep1>5 || firstStep1<1);	
		}
		System.out.print("2: ");
		int firstStep2;
		firstStep2 = keyboard.nextInt();
		if (firstStep2>5 || firstStep2<1 || firstStep2==firstStep1) {
			do {
				System.out.println("Two different numbers between 1 and 5");
				System.out.print("2: ");
				firstStep2 = keyboard.nextInt();
			} while (firstStep2>5 || firstStep2<1 || firstStep2==firstStep1);	
		}
		//----------------------------------------------------------
		System.out.println();
		System.out.println("THE SECOND STEP  (Please, give TWO different numbers between 1 and 10)");
		System.out.print("1: ");
		int secondStep1;
		secondStep1 = keyboard.nextInt();
		if (secondStep1>10 || secondStep1<1) {
			do {
				System.out.println("Two different numbers between 1 and 10");
				System.out.print("1: ");
				secondStep1 = keyboard.nextInt();
			} while (secondStep1>10 || secondStep1<1);	
		}
		System.out.print("2: ");
		int secondStep2;
		secondStep2 = keyboard.nextInt();
		if (secondStep2>10 || secondStep2<1 || secondStep2==secondStep1) {
			do {
				System.out.println("Two different numbers between 1 and 10");
				System.out.print("2: ");
				secondStep2 = keyboard.nextInt();
			} while (secondStep2>10 || secondStep2<1 || secondStep2==secondStep1);	
		}
		//--------------------------------------------------------------
		System.out.println();
		System.out.println("THE THIRD STEP  (Please, give TWO different numbers between 1 and 15)");
		System.out.print("1: ");
		int thirdStep1;
		thirdStep1 = keyboard.nextInt();
		if (thirdStep1>15 || thirdStep1<1) {
			do {
				System.out.println("Two different numbers between 1 and 15");
				System.out.print("1: ");
				thirdStep1 = keyboard.nextInt();
			} while (thirdStep1>15 || thirdStep1<1);	
		}
		System.out.print("2: ");
		int thirdStep2;
		thirdStep2 = keyboard.nextInt();
		if (thirdStep2>15 || thirdStep2<1 || thirdStep2==thirdStep1) {
			do {
				System.out.println("Two different numbers between 1 and 15");
				System.out.print("2: ");
				thirdStep2 = keyboard.nextInt();
			} while (thirdStep2>15 || thirdStep2<1 || thirdStep2==thirdStep1);	
		}
		//----------------------------------------------------------------
		System.out.println();
		System.out.println("THE FOURTH STEP  (Please, give TWO different numbers between 1 and 10)");
		System.out.print("1: ");
		int fourthStep1;
		fourthStep1 = keyboard.nextInt();
		if (fourthStep1>10 || fourthStep1<1) {
			do {
				System.out.println("Two different numbers between 1 and 10");
				System.out.print("1: ");
				fourthStep1 = keyboard.nextInt();
			} while (fourthStep1>10 || fourthStep1<1);	
		}
		System.out.print("2: ");
		int fourthStep2;
		fourthStep2 = keyboard.nextInt();
		if (fourthStep2>10 || fourthStep2<1  || fourthStep2==fourthStep1) {
			do {
				System.out.println("Two different numbers between 1 and 10");
				System.out.print("2: ");
				fourthStep2 = keyboard.nextInt();
			} while (fourthStep2>10 || fourthStep2<1  || fourthStep2==fourthStep1);	
		}
		//-----------------------------------------------------------------
		System.out.println();
		System.out.println("AND THE LAST STEP  (Please, give TWO different numbers between 1 and 5)");
		System.out.print("1: ");
		int lastStep1;
		lastStep1 = keyboard.nextInt();
		if (lastStep1>5 || lastStep1<1) {
			do {
				System.out.println("Two different numbers between 1 and 5");
				System.out.print("1: ");
				lastStep1 = keyboard.nextInt();
			} while (lastStep1>5 || lastStep1<1);	
		}
		System.out.print("2: ");
		int lastStep2;
		lastStep2 = keyboard.nextInt();
		if (lastStep2>5 || lastStep2<1 || lastStep2==lastStep1) {
			do {
				System.out.println("Two different numbers between 1 and 5");
				System.out.print("2: ");
				lastStep2 = keyboard.nextInt();
			} while (lastStep2>5 || lastStep2<1 || lastStep2==lastStep1);	
		}
		
		System.out.println();
		System.out.println("YOUR NUMBERS**");
		System.out.println();
		System.out.println("FIRST STEP: " + firstStep1 + ", " + firstStep2);
		System.out.println("SECOND STEP: " + secondStep1 + ", " + secondStep2);
		System.out.println("THIRD STEP: " + thirdStep1 + ", " + thirdStep2);
		System.out.println("FOURTH STEP: " + fourthStep1 + ", " + fourthStep2);
		System.out.println("LAST STEP: " + lastStep1 + ", " + lastStep2);
		
		System.out.println();
		System.out.println("*****THE WINNING NUMBERS*****");
		System.out.println();
		
		System.out.print("FIRST STEP: ");
		int randomFirstStep1 = (int)((Math.random()*5)+1);
		int randomFirstStep2 = (int)((Math.random()*5)+1);
		if (randomFirstStep1 == randomFirstStep2) {
			do {
				randomFirstStep1 = (int)((Math.random()*5)+1);
				randomFirstStep2 = (int)((Math.random()*5)+1);
			} while (randomFirstStep1 == randomFirstStep2);
		}
		System.out.println(randomFirstStep1 + ", " + randomFirstStep2);
		
		System.out.print("SECOND STEP: ");
		int randomSecondStep1 = (int)((Math.random()*10)+1);
		int randomSecondStep2 = (int)((Math.random()*10)+1);
		if (randomSecondStep1 == randomSecondStep2) {
			do {
				randomSecondStep1 = (int)((Math.random()*10)+1);
				randomSecondStep2 = (int)((Math.random()*10)+1);
			} while (randomSecondStep1 == randomSecondStep2);
		}
		System.out.println(randomSecondStep1 + ", " + randomSecondStep2);
		
		System.out.print("THIRD STEP: ");
		int randomThirdStep1 = (int)((Math.random()*15)+1);
		int randomThirdStep2 = (int)((Math.random()*15)+1);
		if (randomThirdStep1 == randomThirdStep2) {
			do {
				randomThirdStep1 = (int)((Math.random()*15)+1);
				randomThirdStep2 = (int)((Math.random()*15)+1);
			} while (randomThirdStep1 == randomThirdStep2);
		}
		System.out.println(randomThirdStep1 + ", " + randomThirdStep2);
		
		System.out.print("FOURTH STEP: ");
		int randomFourthStep1 = (int)((Math.random()*10)+1);
		int randomFourthStep2 = (int)((Math.random()*10)+1);
		if (randomFourthStep1 == randomFourthStep2) {
			do {
				randomFourthStep1 = (int)((Math.random()*10)+1);
				randomFourthStep2 = (int)((Math.random()*10)+1);
			} while (randomFourthStep1 == randomFourthStep2);
		}
		System.out.println(randomFourthStep1 + ", " + randomFourthStep2);
		
		System.out.print("AND THE LAST STEP: ");
		int randomLastStep1 = (int)((Math.random()*5)+1);
		int randomLastStep2 = (int)((Math.random()*5)+1);
		if (randomLastStep1 == randomLastStep2) {
			do {
				randomLastStep1 = (int)((Math.random()*5)+1);
				randomLastStep2 = (int)((Math.random()*5)+1);
			} while (randomLastStep1 == randomLastStep2);
		}
		
		System.out.println(randomLastStep1 + ", " + randomLastStep2);

	}

}
