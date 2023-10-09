package basicJava8Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findMissingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of list: ");
		int size = sc.nextInt();
		List<Integer> l = new ArrayList<>();
		System.out.println("enter elements: ");
		for (int i = 0; i < size; i++) {
			l.add(sc.nextInt());
		}

		System.out.print("given list is: " + l);
		System.out.println();

		try {
		for (int i = 0; i <= l.size(); i++) {
			if (l.get((i+1)) != (l.get(i) + 1)) {
				System.out.println((l.get(i) + 1) + " is missing");
			}
		}
		}catch (Exception e) {
			System.out.println("error");
		}
		

	}

}
