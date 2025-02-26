// You are using Java

// print all odd numbers 1 to n

import java.util.*;

public class Main{
    
    public static void oddNumbers(int n){
        for(int i = 1; i<=n; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        oddNumbers(n);
    }
    
}
