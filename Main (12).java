// You are using Java
// Print all even numbers till n.

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
