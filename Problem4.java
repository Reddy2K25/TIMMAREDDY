import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int[] numbers = {1,2,8,9,12,46,76,82,15,20,30};
        Map<Integer, Integer> result = new LinkedHashMap<>();
        
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }
        
        for (int num : numbers) {
            for (int divisor = 1; divisor <= 9; divisor++) {
                if (num % divisor == 0) {
                    result.put(divisor, result.get(divisor) + 1);
                }
            }
        }
        
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");
        }
        if (sb.length() > 1) sb.setLength(sb.length() - 2); 
        sb.append("}");
        
        System.out.println(sb.toString());
    }
}
