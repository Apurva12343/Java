//Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.

import java.util.Scanner;

class Homework1{
    public static void main(String args[]) {
        int age  = 22;
        String Name = ("Apurva Aryan");
        char a = 'G';
        byte b = 4;
        short c = 56;
        double d = 9.52652652;
        float e = 4.78965825f;
        long f = 121211;
        System.out.println("INT:" + age);
        System.out.println("String:" + Name);
        System.out.println("CHAR:" + a);
        System.out.println("byte:" + b);
        System.out.println("short:" + c);
        System.out.println("Double:" + d);
        System.out.println("Float:" + e);
        System.out.println("long:" + f);

    }
}

// Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
class Homework2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter radious of Circle");
        double radius = sc.nextDouble();
        // calculation of radious and area
        double radius_of_circle = 2 * Math.PI * radius;
        double area_of_circle = Math.PI * radius * radius;
        System.out.println("Radius of circle :" + radius_of_circle);
        System.out.println("Area of Circle :" + area_of_circle);
        
    }
}

// Make a program that prints the table of a number that is input by the user.
//(HINT - You will have to write 10 lines for this but as we proceed in the course you will be studying about ‘LOOPS’ that will simplify your work A LOT!)
class Homework3{
    public static void main(String args[]) {
        System.out.println(2 * 1);
        System.out.println(2 * 2);
        System.out.println(2 * 3);
        System.out.println(2 * 4);
        System.out.println(2 * 5);
        System.out.println(2 * 6);
        System.out.println(2 * 7);
        System.out.println(2 * 8);
        System.out.println(2 * 9);
        System.out.println(2 * 10);
    }
}