// You are using Java

// print all odd numbers 1 to n

import java.util.*;

public class Main{
    
    public static void greaterNumber(int a, int b){
        System.out.println(Math.max(a,b));
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaterNumber(a,b);
    }
    
}
