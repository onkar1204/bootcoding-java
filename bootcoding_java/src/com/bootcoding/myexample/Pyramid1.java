package com.bootcoding.myexample;

//WAP to make such a pattern like a pyramid with numbers increased by
//		   1
//		  2 3
//		 4 5 6
//		7 8 9 10

public class Pyramid1{
public static void main (String[] args){
	int n =5;
	int res = 0;

	for(int i=1; i<n; i++){
		for(int j=n-i; j>1; j--) {
			System.out.print(" ");
		}
		for (int l=1; l<=i; l++){
			res = res + 1;
			System.out.print(res + " ");
			//System.out.print("* ");
		}


		System.out.println();


	}
}
}	