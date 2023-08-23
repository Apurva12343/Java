import java.util.Scanner;

public class Questions{
    // Print Star pattern using three methods of printing: "println" "\n"
    //Using "Println"
    public static void main(String args[]) {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        //Using \n
        System.out.print("*\n**\n***\n****\n*****\n");
    }
    
}
//to calculate a*b/a-b where a=10 and b = 5 ans will be 10
class question2{
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        // it is wrong because bodmas rule is applied on java
        System.out.println(a*b/a-b);
        // right code it returns the right answer
        System.out.println((a*b)/(a-b));

    }
}
// sum of two no by taking input as a and b
class question3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}