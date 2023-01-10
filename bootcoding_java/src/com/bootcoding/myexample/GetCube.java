package com.bootcoding.myexample;
import java.util.Scanner;

public class GetCube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter A Number.. ");
		int num = sc.nextInt();

//	String num1 = args[0];
//	int num = Integer.parseInt(num1);

		int i = 0;
		int res = 0;
		for (i=1; i <= num; i++) {

				 res = i * i * i;

			System.out.println(" NUMBER IS : " + i + " AND CUBE OF THE " + i + " IS " + res);
		}



	}
}
//WAP in C to display the cube of the number upto given an integer.
//Test Data :
//Input number of terms : 5
//Expected Output :
//Number is : 1 and cube of the 1 is :1
//Number is : 2 and cube of the 2 is :8
//Number is : 3 and cube of the 3 is :27
//Number is : 4 and cube of the 4 is :64
//Number is : 5 and cube of the 5 is :125