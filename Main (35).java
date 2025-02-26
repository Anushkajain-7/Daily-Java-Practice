// You are using Java

// Enter 3 numbers from the user & make a function to print their average.

// Average finder

import java.util.*;

public class Main{
    
    public static int averageOfNumber(int a, int b, int c){
        return (a+b+c)/3;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("Average: "+averageOfNumber(a,b,c));
    }
    
}
