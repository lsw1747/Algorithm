import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        char[] chars = String.valueOf(factorial(N)).toCharArray();
        for (int i = chars.length-1; i > 0; i--) {
            if(chars[i] == '0') count++;
            else break;
        }
        System.out.println(count);
    }

    public static BigInteger factorial(int n){
        if(n > 0) {
            return BigInteger.valueOf(n).multiply(factorial(n-1));
        }
        else return BigInteger.valueOf(1);
    }
}