import java.util.*;
class FirstClass{
    public static void main(String args[]) {
        //Output print function
        System.out.print("Hello jee");
        System.out.print("Hello jee");
        // we can add "\n" to start new line
        System.out.print("Hello Apurva\n");
        System.out.print("Hello Apurva\n kaise ho\n");
        // "println" this function is used to print every code from new line
        System.out.println("Kaise ho Apurva");
        System.out.println("Sab badhiya h nn?");

    }
}
// Variables in java

class Variables{
    public static void main(String args[]) {
        // Variables
        String name = "Apurva Aryan";
        int age = 22;
        int a = 55;
        int b = 89;
        System.out.println(name);
        System.out.println(age);
        System.out.println(a+b);
    }
}
// DataTypes In Java
// INT data types
class data_types{
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int sum = (a+b);
        System.out.println(sum);
        int diff = (b-a);
        System.out.println(diff);
        int mul = (a*b);
        System.out.println(mul);
    }
}
//Input 
// for taking input you have to import java.util.*
//nextBoolean() Used for reading Boolean value                    
//nextByte() Used for reading Byte value
//extDouble() Used for reading Double value
//nextFloat() Used for reading Float value
//nextInt() Used for reading Int value
//nextLine() Used for reading Line value
//nextLong() Used for reading Long value
//nextShort() Used for reading Short value
class input{
    public static void main(String args[]) {
        //input
        Scanner sc  = new Scanner(System.in);
        // sc.next() will return only one word
        String name = sc.next();
        System.out.println(name);
        // sc.nextline() will return whole sentance
        String full_name = sc.nextLine();
        System.out.println(full_name);

    }
}
