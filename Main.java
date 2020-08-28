package com.company;
import java.util.Scanner;

public class Main {
    public void cars(int s, int r){
        int g = s + r;
        System.out.println("You are welcome to " + g);
    }
    public void result(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- School Result System ---");
        System.out.println("Enter student Name");
        String y = sc.nextLine();
        System.out.println("Enter student class");
        int v = sc.nextInt();
        System.out.println("Enter student class work 10");
        int a = sc.nextInt();
        System.out.println("Enter student Assignment 10");
        int b = sc.nextInt();
        System.out.println("Enter student class test 20");
        int c = sc.nextInt();
        System.out.println("Enter student exam score");
        int d = sc.nextInt();
        System.out.println("Name: " + y);
        System.out.println("Class: " + v);
        int total= a+b+c+d;
        System.out.println("Student total result: " + total);

        if (total >= 80) {
            System.out.println("You got A+");
        } else if (total >=75 && total < 80) {
            System.out.println("You got A");
        } else if (total >= 70 && total < 75) {
            System.out.println("You got B+");
        } else if (total >= 65 && total < 70) {
            System.out.println("You got B");
        } else if (total >= 60 && total < 65) {
            System.out.println("You got C+");
        }else if (total >= 55 && total<60){
            System.out.println("You got C");
        }else if (total>= 50 && total<55){
            System.out.println("You got D+");
        }else if (total>= 45 && total<50){
            System.out.println("You got D");
        }else {
            System.out.println("You have fail");
        }
    }
    public static void main(String[] args) {
	// write your code here

        Main him = new Main();
        him.cars(5, 9);
        him.result();

        JusticeMain myObj = new JusticeMain();
        JusticeMain myObj2 = new JusticeMain();
        myObj.x =55;
        myObj2.name = "Justice";
        System.out.println(myObj.x);
        System.out.println(myObj2.name);

    }
}
