// You are using Java
// Table in java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int b = n * i;
            System.out.println(n + " x " + i + " = " + b);
        }
    }
}