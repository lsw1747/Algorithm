import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String user = "";
        int num = 0;
        HashMap<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        br.readLine(); //ENTER

        for (int i = 0; i < N - 1; i++) {
            user = br.readLine();
            if(!user.equals("ENTER")) {
                map.put(user, i);
            }
            else {
                num += map.size();
                map.clear();
            }
        }
        num += map.size();

        System.out.println(num);
    }
}