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
        String commands = "", str = "";
        boolean isError = false;

        while (T-- > 0) {
            isError = false;
            isReversed = false;
            commands = br.readLine();

            br.readLine(); // 배열 사이즈
            str = br.readLine(); // ex) [1,2,3,4]

            if (!str.equals("[]")) { // 비어있는 배열 입력시에도 D 명령만 없으면 에러를 출력할 필요 없음.
                strToIntegerArray(str);
                isError = shellCommand(commands);
            } else {
                if (commands.contains("D")) {
                    isError = true;
                    sb.append("error").append("\n");
                }
            }

            if (!isError) {
                print();
            }
            deque.clear();
        }


        System.out.println(sb);
    }

    static void strToIntegerArray(String str) {
        String temp = str.substring(1, str.length() - 1); // [ ] 제거
        String[] strArray = temp.split(",");
        for (String s : strArray) {
            deque.add(Integer.parseInt(s));
        }
    }

    static boolean shellCommand(String commands) {
        //RR => 명령 제거
        commands = commands.replaceAll("RR", "");

        char[] command = commands.toCharArray();

        for (char c : command) {
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
                if (i > 0) {
                    sb.append(deque.pollLast()+",");
                }
                else {
                    sb.append(deque.pollLast());
                }
            }
            sb.append("]").append("\n");
        }
        else {
            String s = deque.toString().replaceAll(" ", "");
            sb.append(s).append("\n");
        }
    }
}
