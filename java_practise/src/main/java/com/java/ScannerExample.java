package com.java;

import java.util.*;
import java.lang.*;

public class ScannerExample {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String nameString;
		int a;
		System.out.println("What is your name?");
		nameString = scanner.nextLine();

		System.out.println("What is your age?");
		a = scanner.nextInt();
		System.out.println(a);

	}

}
