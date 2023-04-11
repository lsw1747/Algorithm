import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

//        List<Integer> queue = new ArrayList<>();
        LinkedList<Integer> queue = new LinkedList<>();

        int num = 0, N = Integer.parseInt(br.readLine()), value = 0;

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    value = num;
                    break;
                case "pop":
                    if (!queue.isEmpty()) {
                        sb.append(queue.get(0)).append("\n");
                        queue.remove(0);
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
                    sb.append(!queue.isEmpty() ? queue.get(0) : "-1").append("\n");
                    break;
                case "back":
                    sb.append(!queue.isEmpty() ? value : "-1").append("\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}
