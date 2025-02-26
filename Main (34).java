// You are using Java

// table of a number

import java.util.*;

public class Main{
    
    public static void tableOfNumber(int n){
        if(n<=0){
            System.out.print("Invalid");
        }
        for(int i = 1; i<=10; i++){
            int num;
            num = n*i;
            System.out.println(n+" x "+i+" = "+num);
        }
        return;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        tableOfNumber(n);
    }
    
}
