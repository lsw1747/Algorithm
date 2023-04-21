import java.io.*;

public class Main {
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        sb.append((int) (Math.pow(2, N)-1)).append("\n");

        hanoi(N,1,2,3);

        System.out.print(sb);
    }

    static void hanoi(int N, int p1, int p2, int p3) {
        if (N == 1) {
            sb.append(p1).append(" ").append(p3).append("\n");
            return;
        }

        hanoi(N - 1, p1, p3, p2);
        sb.append(p1).append(" ").append(p3).append("\n");
        hanoi(N - 1, p2, p1, p3);
    }
}
