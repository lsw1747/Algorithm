import java.io.*;

public class Main {
    static char[] c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int num = 0;

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            num = (int) Math.pow(3, Integer.parseInt(input));
            c = new char[num];
            for (int i = 0; i < num; i++) {
                c[i] = '-';
            }
            if (num > 1) cantorSet(0, num - 1);
            System.out.println(new String(c));
        }
    }

    static void cantorSet(int sIdx, int eIdx) {
        //구간 3등분
        int N = eIdx - sIdx + 1;
        N /= 3;
        //  0~N (N-1 길이의 범위, 단 N-1은 3의 제곱수)
        //  (0,n-1), (n,2n-1), (2n,3n-1)
        //  3등분 해 각 나눈 구간의 길이가 1보다 클 때까지

        if (N > 1) {
            clearCantorSet(sIdx + N, sIdx + (2 * N) - 1);          // 2구간은 비운다
            cantorSet(sIdx, sIdx + N - 1);                              // 1구간에 대해 cantorSet 실행
            cantorSet(sIdx + (2 * N), sIdx + (3 * N) - 1);          // 3구간에 대해 cantorSet 실행
        } else {
            int mIdx = (eIdx + sIdx) / 2;
            c[mIdx] = ' ';
        }
    }

    static void clearCantorSet(int sIdx, int eIdx) {
        for (int i = sIdx; i <= eIdx; i++) {
            c[i] = ' ';
        }
    }
}
