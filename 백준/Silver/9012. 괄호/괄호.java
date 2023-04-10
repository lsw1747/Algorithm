import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        char[] charArr = new char[50];
        boolean isVPS = false;

        int lParenthesis = 0;
        int rParenthesis = 0;
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            lParenthesis = 0;
            rParenthesis = 0;
            isVPS = true;

            input = br.readLine();
            charArr = input.toCharArray();

            for (int i = 0; i < input.length(); i++) {
                if(charArr[i] == '(') {
                    lParenthesis++;
                }
                else {
                    rParenthesis++;
                    if(lParenthesis < rParenthesis) {
                        isVPS = false;
                        break;
                    }
                }
            }
            if(lParenthesis != rParenthesis) isVPS = false;

            sb.append(isVPS? "YES": "NO").append("\n");
        }

        System.out.println(sb);
    }
}
