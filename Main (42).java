// You are using Java

/* Two numbers are entered by the user, x and n. 
Write a function to find the value of one number raised to the power of another i.e. x^n.*/


import java.util.*;

public class Main{
    
    public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;  
        b = a % b;  
        a = temp;
    }
    return a;
}
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));

    }
    
}
