// if else 

import java.util.Scanner;
// Taking input from user and validating that user is adult or not
class conditions1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();
        if (Age > 18){
            System.out.println("Adult");
        } else{
            System.out.println("Not Adult");
        }
    }
}

//Taking input from user and checking the given no is odd or even
class conditions2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter thr number to check wheather it is even or odd");
        int Input_Number = sc.nextInt();
        if (Input_Number % 2 == 0){
            System.out.println(Input_Number + " is even Number");
        } else System.out.println(Input_Number + " Is odd Number");
    }
    }

// taking two inputs from user and checking no is equal greater or lesser
class conditions3{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter First Number");
            int First_number = sc.nextInt();
            System.out.println("Please enter second Number");
            int Second_Number = sc.nextInt();
            if (First_number == Second_Number) {
                System.out.println("First no and second No is equal");
            } else if (First_number > Second_Number) {
                System.out.println(First_number + " is greater than " + Second_Number);
            } else if (First_number < Second_Number) {
                System.out.println(First_number + " is lesser than " + Second_Number);
            }
    }
} 
//