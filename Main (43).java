// You are using Java

/*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.*/

// Fibonacci series 


import java.util.*;

public class Main{
    
    public static void FibonacciSeries(int n) {
    int a = 0;
    int b = 1;
    for(int i = 2; i<=n; i++){
        System.out.print(a+" ");
        
        int temp = b;
        b = a+b;
        a = temp;
    }
    System.out.println();
}
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        FibonacciSeries(n);

    }
    
}
