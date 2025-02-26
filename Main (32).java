// You are using Java
import java.util.*;

public class Main{
    
    public static void primeNumber(int n){
        if(n<=1){
            System.out.print("Invalid");
        }
        for(int i=2; i*i <= n; i++){
            if(n%i == 0){
                System.out.print("Not a prime number");
                return;
                
            }
        }
        System.out.print("Prime number");
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        primeNumber(n);
    }
    
}
