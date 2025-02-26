// You are using Java

// find circumference Of a Circle

import java.util.*;

public class Main{
    
    public static double circumferenceOfCircle(double n){
        return 2*Math.PI*n;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.printf("circumference Of a Circle: %.2f",circumferenceOfCircle(n));

    }
    
}
