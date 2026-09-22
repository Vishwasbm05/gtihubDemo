package xyz;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);

		int index = 0;
		int choice = 1;

		while (choice == 1) {
			System.out.println("Enter the array elements");
			arr[index] = sc.nextInt();
			index++;

			System.out.println("do you want to continue to add");
			System.out.println("1. yes \n 2.no");
			choice = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
