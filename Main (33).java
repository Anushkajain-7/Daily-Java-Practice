// You are using Java

// prime number checker 

import java.util.*;

public class Main{
    
    public static void evenOddNumber(int n){
        if(n<=0){
            System.out.print("Invalid");
        }
        else if(n%2 == 0){
            System.out.print("it's even");
            return;
        }
        System.out.print("its odd");
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        evenOddNumber(n);
    }
    
}
