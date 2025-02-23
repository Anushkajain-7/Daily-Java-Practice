// You are using Java
// floyd's Triangle

import java.util.*;


class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int num = 0;
      
       for(int i=1; i<=n; i++) {
           for(int j=1; j<=i; j++) {
               if((i+j)%2==0){
                   System.out.print("1 ");
               }
               else{
                   System.out.print("0 ");
               }
           }
           
           System.out.println();
       }
   }
}
