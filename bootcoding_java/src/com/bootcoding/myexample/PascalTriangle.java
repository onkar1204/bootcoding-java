package com.bootcoding.myexample;

public class PascalTriangle {
public static void main (String[] args){
	int n =5;
	int res = 0;
	int count = 1;
	for(int i=0; i<n; i++){
		for(int j=n-i; j>=1; j--) {

			System.out.print(" ");
		}
		for (int l=0; l<=i; l++){
			res = res + 1;
			if(l == 0 || l == i){
				count = 1;
			}else{
				count=count*(i-l+1)/l; // 1. Parenthesis, 2.substraction, 3. Addition, 4. Multiplication, 5.Division
			}

			System.out.print(count + " ");
		}


		System.out.println();


	}
}
}	