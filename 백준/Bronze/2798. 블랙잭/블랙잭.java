import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visit;
    static int[] card;
    static int N, M, sum, result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sum = 0;

        visit = new boolean[N];
        card = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N && st.hasMoreTokens(); i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        pickCard();
        System.out.println(result);
    }

    static void pickCard() {
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = card[i] + card[j] + card[k];
//                    System.out.println(sum+" = " + card[i] + " + " + card[j] + " + " + card[k]);
                    if (M == sum) {
                        result = sum;
                        break;
                    }
                    if (result < sum && sum < M) {
                        result = sum;
                    }
                }
            }
        }
    }
}
