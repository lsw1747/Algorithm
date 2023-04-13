import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();

        String command = "";
        int X = 0;
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());

            command = st.nextToken();

            switch (command) {
                case "push_front":
                    X = Integer.parseInt(st.nextToken());
                    list.addFirst(X);
                    break;
                case "push_back":
                    X = Integer.parseInt(st.nextToken());
                    list.addLast(X);
                    break;
                case "pop_front":
                    sb.append(list.isEmpty() ? "-1" : list.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    sb.append(list.isEmpty() ? "-1" : list.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(list.size()).append("\n");
                    break;
                case "empty":
                    sb.append(list.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "front":
                    sb.append(list.isEmpty() ? "-1" : list.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append(list.isEmpty() ? "-1" : list.peekLast()).append("\n");
                    break;
                default:
                    break;
            }
        }

        System.out.println(sb);
    }
}