import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		HashMap<Integer, String> map1 = new HashMap<>();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		for (int i = 1; i < N+1; i++) {
			String t = br.readLine();
			map.put(t, i);
			map1.put(i, t);
		}
		
		for (int i = 0; i < M; i++) {
			String input = br.readLine();
			if (isInteger(input)) {
				sb.append(map1.get(Integer.parseInt(input)));
			} else {
				sb.append(map.get(input));
			}
			if(i < M-1) sb.append("\n");
		}
		
		System.out.println(sb);
	}

	private static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}
}