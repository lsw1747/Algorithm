import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int s = Integer.parseInt(st.nextToken());
			map.put(s, map.getOrDefault(s, 0) + 1);
		}

		br.readLine();
		st = new StringTokenizer(br.readLine());

		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if(map.containsKey(num)) {
				sb.append(map.get(num)).append(" ");
			}
			else sb.append("0").append(" ");

		}

		System.out.println(sb);

	}
}
