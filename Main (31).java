// You are using Java

// Factorial of a number

import java.util.*;

class Main {
    
    public static void factorialValue(int n){
        int factorial = 1;
        if(n<=0){
            System.out.print("invalid number");
        }
        for(int i = n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.print(factorial);
        return;
    }
        
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       factorialValue(n);
   }   
}
