import java.io.*;
import java.util.*;

public class Main {
    static Deque<Integer> deque;
    static StringBuilder sb;
    static boolean isReversed;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        deque = new LinkedList<>();
        isReversed = false;
        int T = Integer.parseInt(br.readLine()); //테스트 케이스의 수
//        String commands = "", str = "";
        String str = "";

        boolean isError = false;

        while (T-- > 0) {
            isError = false;
            isReversed = false;
            char[] commands = br.readLine().toCharArray();

            br.readLine(); // 배열 사이즈
            str = br.readLine(); // ex) [1,2,3,4]

            strToIntegerArray(str);
            isError = shellCommand(commands);

            if (!isError) {
                print();
            }
            deque.clear();
        }

        System.out.println(sb);
    }

    static void strToIntegerArray(String str) {
        if (str.equals("[]")) {
            deque.clear();
        }
        else {
            String temp = str.substring(1, str.length() - 1); // [ ] 제거
            String[] strArray = temp.split(",");
            for (String s : strArray) {
                deque.add(Integer.parseInt(s));
            }
        }
    }

    static boolean shellCommand(char[] commands) {
        for (char c : commands) {
            if (c == 'R') {
                isReversed = !isReversed;
            } else if (c == 'D') {
                if (deque.isEmpty()) {
                    sb.append("error").append("\n");
                    return true;
                }
                if (!isReversed) {
                    deque.poll();
                } else {
                    deque.pollLast();
                }
            }
        }
        return false;
    }

    static void print() {
        if (isReversed) {
            sb.append("[");
            for (int i = deque.size() - 1; i >= 0; i--) {
                sb.append(i > 0 ? deque.pollLast()+"," : deque.poll());
            }
            sb.append("]").append("\n");
        }
        else {
            String s = deque.toString().replaceAll(" ", "");
            sb.append(s).append("\n");
        }
    }
}