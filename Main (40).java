// You are using Java

/*Write a program to enter the numbers till the user wants 
And at the end it should display the count of positive, negative and zeros entered.*/


import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int p = 0;
        int n = 0;
        int z = 0;
        
        while(a==1){
            int b = sc.nextInt();
            if(b>0){
                p++;
            }
            else if(b==0){
                z++;
            }
            else if(b<0){
                n++;
            }
            
            a = sc.nextInt();
        }
        
        System.out.println(p);
        System.out.println(n);
        System.out.println(z);
        

    }
    
}
