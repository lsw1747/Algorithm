import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> queue = new LinkedList<>();


        int num = 0, N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    break;
                case "pop":
                    if (!queue.isEmpty()) {
                        sb.append(queue.pollFirst()).append("\n");
                    }
                    else {
                        sb.append("-1").append("\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "front":
                    sb.append(!queue.isEmpty() ? queue.getFirst() : "-1").append("\n");
                    break;
                case "back":
                    sb.append(!queue.isEmpty() ? queue.getLast() : "-1").append("\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}
