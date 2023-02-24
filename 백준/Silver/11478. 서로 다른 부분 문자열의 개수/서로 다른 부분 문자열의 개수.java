import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		int count = 0;
		for (int i = 1; i <= input.length(); i++) {
			count += substr(input, i);
		}
		System.out.println(count);
	}

	private static int substr(String s, int n) {
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = n; i <= s.length(); i++) {
			map.put(s.substring(i - n, i), 0);
		}
		return map.size();
	}
}
