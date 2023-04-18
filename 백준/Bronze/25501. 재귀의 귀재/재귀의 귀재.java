import java.io.*;

public class Main {
    static int recursionCount;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        char[] input;
        while (T-- > 0) {
            recursionCount = 0;
            input = br.readLine().toCharArray();

            sb.append(isPalindrome(input)).append(" ").append(recursionCount).append("\n");
        }
        System.out.print(sb);
    }
    static int isPalindrome(char[] chars) {
        return recursion(chars,0,chars.length-1);
    }

    static int recursion(char[] chars, int l, int r) {
        recursionCount++;
        if(l>=r) return 1;
        else if(chars[l] != chars[r]) return 0;
        else return recursion(chars, l + 1, r - 1);
    }
}
