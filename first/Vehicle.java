package first;

import java.util.*;
import java.util.Scanner;

public class Vehicle {

	public static void main(String[] args) {
		Scanner markaIn = new Scanner(System.in);
		
		List<String> markakList = new ArrayList<>();
		
		String nul = null;
		
		System.out.println("Auto markak:");
		
		do {
			String marka = markaIn.nextLine();
			if(!marka.equals("")) {
				markakList.add(marka);
			}
			nul = marka;
		} while(!nul.equals(""));
		
		//System.out.println(markakList);
		
		//******************************************************************
		
		Scanner tipusokIn = new Scanner(System.in);
		List<String> tipusokList = new ArrayList<>();
		
		for (int i = 0; i < markakList.size(); i++) {
			System.out.println("A(z) " + markakList.get(i) + " markahoz kerem adjon meg 2 tipust.");
			
			System.out.print("1. ");
			String elsoTipus = tipusokIn.nextLine();
			tipusokList.add(elsoTipus);
			System.out.print("2. ");
			String masodikTipus = tipusokIn.nextLine();
			tipusokList.add(masodikTipus);
			System.out.println();
			
		}
		
		for (int i = 0, j = 0; i < markakList.size(); i++) {
			System.out.print("Marka: " + markakList.get(i) + " ***** " + "Tipusok: " + tipusokList.get(j) + ", ");
			j++;
			System.out.println(tipusokList.get(j));
			j++;
			
		}
		
		tipusokIn.close();
		markaIn.close();
		
	}

}
