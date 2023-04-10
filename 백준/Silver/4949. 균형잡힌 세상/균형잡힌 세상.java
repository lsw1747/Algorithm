import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        char[] charInput = new char[100];
        String input = "";
        boolean isVPS = true;

        while (true) {
            isVPS = true;
            input = br.readLine();
            if (input.equals(".")) break;

            charInput = input.toCharArray();

            for (char c : charInput) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (!stack.empty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(c);
                        isVPS = false;
                        break;
                    }
                } else if (c == ']') {
                    if (!stack.empty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        stack.push(c);
                        isVPS = false;
                        break;
                    }
                }
            }
            if(stack.empty()) isVPS = true;
            else isVPS = false;
            stack.clear();
            sb.append(isVPS ? "yes" : "no").append("\n");
        }
        System.out.println(sb);
    }
}
