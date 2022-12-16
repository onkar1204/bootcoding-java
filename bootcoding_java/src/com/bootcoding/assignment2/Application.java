package com.bootcoding.assignment2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Application {

            public static void main (String[] args) {


                List<User> list= new LinkedList<>();

                list.add(new User("Pankaj"  ,15,858598));
                list.add(new User("Rajesh"  ,25,458798));
                list.add(new User("Karan"   ,29,147896));
                list.add(new User("Mahesh"  ,32,258963));
                list.add(new User("Niranjan",21,548963));
                list.add(new User("Saurabh" ,23,988963));
                list.add(new User("kartik"  ,31,878963));

                Collections.sort(list);

                for (User user:list){
                    System.out.println(user);

                }
    }


}
