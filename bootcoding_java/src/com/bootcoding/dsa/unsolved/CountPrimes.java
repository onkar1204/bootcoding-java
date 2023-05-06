package com.bootcoding.dsa.unsolved;
//204. Count Primes
public class CountPrimes {
    public static void main(String[] args) {
        int n = 10;
//        Output: 4
        System.out.println(countPrimes(n));
    }
    public static int countPrimes(int n) {
        int count =0;

            boolean isPrime = true;
                while (n >= 2){
                for (int i = 1; i<n; i++) {
                    if (n % i == 0) {

                        isPrime = false;
                        break;
                    }
                    if (isPrime) {
                        count++;
                    }

                }
                    n=n-1;
            }



        return count;
    }
}
