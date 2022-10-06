package com.bootcoding.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class ArrayListExample4 {
    public static void main(String[] args) {
        ArrayList numbers=new ArrayList();
        for (int i=1;i<=10;i++){
            numbers.add(i*10);
        }
        ArrayListExample4 e = new ArrayListExample4();
        e.reduceNumbersToZero(numbers);
    }
    public void reduceNumbersToZero(ArrayList<Integer> numbers){
        for(int i =0 ;i < numbers.size(); i++){
            int res = numberOfSteps(numbers.get(i));
            System.out.println(numbers.get(i) + " Number of steps to zero is " + res);
        }
    }
    public int numberOfSteps(int num){
        int count = 0;
        while(num != 0){
            if(num % 2 == 0){
                num = num / 2;
            }else{
                num = num - 1;
            }
            count++;
        }
        return count;
    }
}
