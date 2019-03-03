package first;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import java.util.Scanner;
import java.util.Set;
import java.util.Collections;

public class NameRequest {

	public static void main(String[] args) {
		Scanner nameIn = new Scanner(System.in);
		
		List<String> nameList = new ArrayList<>();
		
		String nul = null;
		
		System.out.println("Names:");
		
		do {
			String name = nameIn.nextLine();
			if (!name.equals("Számol")) {
				nameList.add(name);
			}
			nul = name;
		} while(!nul.equals("Számol"));
		
		System.out.println();
		System.out.println(nameList);
		
		Set<String> pieces = new HashSet<String>(nameList);
		
		System.out.println();
		
		for(String s: pieces){
			System.out.println(s + " - " + Collections.frequency(nameList,s));
		}
		
		nameIn.close();

	}

}
