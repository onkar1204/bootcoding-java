package com.bootcoding.basic;

public class SwitchCaseExample {
    public static void main(String[] args) {
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println(" Today Is Monday ");
                break;
            case "Tuesday":
                System.out.println(" Today Is Tuesday ");
                break;
            case "Wednesday":
                System.out.println(" Today Is Wednesday ");
                break;
            case "Thursday":
                System.out.println(" Today Is Thursday");
                break;
            case "Friday":
                System.out.println(" Today Is Friday");
                break;
            case "Saturday":
                System.out.println(" Today Is Saturday");
                break;
            case "Sunday":
                System.out.println(" Today Is Sunday");
                break;
            default:
                System.out.println(" Today Is Holiday");

        }
    }
}
