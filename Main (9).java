// You are using Java
/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
Calculate the result according to the operation given and display it to the user.*/

import java.util.*;


public class Main{
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int choice = sc.nextInt();
       switch(choice) {
            case 1 : 
               System.out.println(a+b);
            break;
            case 2 : 
               System.out.println(a-b);
            break;
            case 3 : 
               System.out.println(a*b);
            break;
            case 4 : 
               if(b == 0) {
                    System.out.println("Invalid Division");
                } 
               else {
                    System.out.println(a/b);
                }
	          break;
            default : 
                System.out.println("Invalid Operator");
        }     
    }
}