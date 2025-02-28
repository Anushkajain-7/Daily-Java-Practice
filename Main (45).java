// You are using Java

// Take an array of names as input from the user and print them on the screen.



import java.util.*;


public class Main {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0; i<n; i++) {
          a[i] = sc.nextInt();
      }
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
     
       for(int i=0; i<n; i++) {
           if(a[i] < min) {
               min = a[i];
           }
           if(a[i] > max) {
               max = a[i];
           }
       }
       System.out.println("Largest number is : " + max);
       System.out.println("Smallest number is : " + min);
      
   }
}
