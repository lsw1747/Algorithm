import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0, input = 0, index = -1;

        int K = Integer.parseInt(br.readLine());
        int[] stack = new int[K];

        while (K-- > 0) {
            input = Integer.parseInt(br.readLine());
            if(input > 0) {
                stack[++index] = input;
                sum += stack[index];
            }
            else {
                sum -= stack[index--];
            }
        }

        System.out.println(sum);
    }
}
