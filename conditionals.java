import java.util.*;
public class conditionals {
    
    public static void main(String[] args) 
    {
        Scanner scn= new Scanner(System.in);
        int button = scn.nextInt();

        // if(button ==1){
        //     System.out.println("hello");
        // } else if( button == 2){
        //     System.out.println("namste");

        // }
        //else if (button ==3){
        //     System.out.println("bonjour");
        // } else {
        //     System.out.println("INVALID");
        // }
        switch (button) {
            case 1: System.out.println("helo");
                break;
        case 2: System.out.println("namste");
        break;
        case 3: System.out.println("bonjour");
        break;
            default: System.out.println("invalid");
                break;
        }
    
        scn.close();
    }
    
    }
    

/*package com.company;
import java.util.Scanner;

public class cwh_18_elseif {
    public static void main(String[] args) {
        String var = "Saurabh";  or    char var='shubham'


        switch (var) {
            case "Shubham" -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");


        /*
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }
        if(age>2){
            System.out.println("You are not a baby!");
        }
        */

    

 