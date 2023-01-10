package com.bootcoding.myexample;
//Print sum of elements of an array

public class SumOfArray{
public static void main (String[] args) {

	int[] num = {10, 20, 30, 40, 50, 40,110};

	int sum = 0;
	int i;
	for (i = 0; i < num.length; i++) {

		//sum = num[0]+num[1]+num[2]+num[3]+num[4]+num[5];
		sum = sum +num[i];
	}

	System.out.println(sum);

}
}
