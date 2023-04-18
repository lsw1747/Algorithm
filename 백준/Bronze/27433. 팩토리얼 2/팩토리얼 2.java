import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        BigInteger bi = new BigInteger(N);
        System.out.print(Integer.parseInt(N) > 0 ? getFac(bi) : "1");
    }

    static BigInteger getFac(BigInteger num) {
        return num.compareTo(BigInteger.valueOf(1)) == 1 ? num.multiply(getFac(num.subtract(BigInteger.valueOf(1)))) : num;
    }
}