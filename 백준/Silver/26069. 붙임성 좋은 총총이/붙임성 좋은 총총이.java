import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer st;

        String input1 = "", input2 = "";

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            input1 = st.nextToken();
            input2 = st.nextToken();

            if (input1.equals("ChongChong")) {
                map.put(input1, 0);
                map.put(input2, 0);
            } else if (map.containsKey(input1)) {
                map.put(input2, 0);
            }
            if (input2.equals("ChongChong")) {
                map.put(input1, 0);
                map.put(input2, 0);
            } else if (map.containsKey(input2)) {
                map.put(input1, 0);
            }
        }

        System.out.println(map.size());
    }
}
