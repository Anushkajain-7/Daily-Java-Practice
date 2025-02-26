// You are using Java

/*Write a function that takes in age as input and returns if that person is eligible to vote or not. 
A person of age > 18 is eligible to vote.*/

// Checking eligiblity to cast vote


import java.util.*;

public class Main{
    
    public static void elligibleToVote(int n){
        if(n<18){
            System.out.println("Not eligible to vote.");
        }
        else{
            System.out.println("Is eligible to vote.");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        elligibleToVote(n);

    }
    
}
