package javalecturepractice;

import java.util.Scanner;


public class week1 {
    public void ex1(){
        // 1. Ask the user for two integers. By using separate variables print the sum, product and quotient of the numbers to the console.
        Integer a, b, c, d;
        double e;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("1st Integer? ");
        a = keyboard.nextInt();

        System.out.print("2nd Integer? ");
        b = keyboard.nextInt();

        keyboard.close();

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        c = a + b;
        d = a * b;
        e = (double)a/b;
        System.out.println("Sumna: " + c);
        System.out.println("Tulo: " + d);
        System.out.println("Osamaa: " + e);
    }

    public void ex2(){
        //2. Ask the user for name and age. Print to the console "Hey <name>! You are <age> years old" (replace with the given information).
        String userName;
        Integer userAge;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Your name? ");
        userName = keyboard.nextLine();
        System.out.print("Your age? ");
        userAge = keyboard.nextInt();
        keyboard.close();
        System.out.println("Hey " + userName + "! You are " + userAge + " years old." );
    }

    public void ex3(){
         // 3. Use the variables given by the user in task 1 directly in the println method, so that the program prints both the invoice and the result. E.g. "3 + 2 = 5"
        // System.out.println(a + "+" + b + "=" + (a+b));
        // System.out.println(a + "*" + b + "=" + (a*b));
        // System.out.println(a + "/" + b + "=" + ((double)a/b));

    }

    public void ex4(){
        //4. Write a program that asks for an amount in dollars and converts it to euros. Find the exchange rate online and define it as constant (keyword final).
        double dollars;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Amount in dollars? "); // use comma for decimal point
        dollars = keyboard.nextDouble();
        keyboard.close();
        final double exchangeRate = 0.8;
        //System.out.println("Amount in euros: " + dollars * exchangeRate);
        System.out.printf("Amount in euros: %.2f\n", dollars * exchangeRate);
    }


    public void ex5(){
        //5. Write a program that calculates a person's body mass index. Find the necessary formula online, and first, store the values ​​used in variables. Print the body mass index to the console. Use fractional number (floating point data type) variables.
        double weight, height, bmi;
        Scanner keyboard =  new Scanner(System.in);
        System.out.print("Your weight in kg? ");
        weight  = keyboard.nextDouble();
        System.out.print("Your height in meters? ");
        height  = keyboard.nextDouble();
        keyboard.close();
        bmi = weight / (height * weight);
        System.out.printf("Your BMI is: %.2f\n", bmi);

        /* double paino = 80;
        double pituus = 1.75;
        double painoindeksi = paino/(pituus*pituus);
        System.out.println(painoindeksi); */
    }
        
    public void ex6(){
        //6. Write a program that calculates and prints the area of ​​a rectangle, square and circle. Give the variables the values ​​of your choice. (Constant for Pi is defined in Math.PI)
        double rectangleArea, squareArea, circleArea;
        final double pi = Math.PI;
        double rectangleWidthe = 5;
        double rectangleHeight = 10;
        double squareSide = 5;
        double circelRadius = 5;
        rectangleArea = rectangleWidthe * rectangleHeight;
        squareArea = squareSide * squareSide;
        circleArea = pi * circelRadius * circelRadius;
        //System.out.println(rectangleArea, squareArea, circleArea); // println()报错。在 Java 中，System.out.println() 方法用于打印一个参数到控制台
        System.out.printf("Rectangle Area: %.2f, Square Area: %.2f, Circle Area: %.2f%n", rectangleArea, squareArea, circleArea);
    }


    public void ex7(){
        //7. Ask the user the number of apples. Print how many apples are left, when they are divided equally among five people (modulo operator).


    }


    


    
}
