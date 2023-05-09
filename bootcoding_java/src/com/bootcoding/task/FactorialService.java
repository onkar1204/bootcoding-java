package com.bootcoding.task;

public class FactorialService {
    public static void main(String[] args) {
        int[] nums = {5,3,2,7,8,9};
        /*long[] res = findFactorial(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }*/
        FactorialService fs = new FactorialService();
        long[] res = fs.findFactorial(nums);

        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]);
        }

    }
    public long[] findFactorial(int[] nums){
        long[] factorial = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            long fact = 1;
            for (int j = 1; j <= nums[i]; j++) {
                fact *= j;
            }
            factorial[i] = fact;

        }

        return factorial;
    }
    /*public  long[] findFactorial(int[] nums){
        long[] factorial = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            factorial[i] = getFactorial(nums[i]);
        }
        return factorial;
    }
    private long getFactorial(int num) {
        long sum = 1;
        for(int j = 1; j<= num; j++) {
            sum = sum * j;
        }
        return sum;
    }*/
}
