import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        
        int terms = (a % 2 == 0) ? a - 1 : a;
        if (terms <= 0) return;

        StringBuilder sb = new StringBuilder();
        for (int k = 1; k <= terms; k++) {
            int odd = 2 * k - 1; 
            if (k > 1) sb.append(", ");
            sb.append(odd);
        }
        System.out.println(sb.toString());
    }
}

