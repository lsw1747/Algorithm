import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			map.put(br.readLine(), 0);
		}

		List<String> result = new ArrayList<>();

		for (int i = 0; i < M; i++) {
			String mText = br.readLine();
			if (map.containsKey(mText)) {
				result.add(mText);
			}
		}

		Collections.sort(result);

		System.out.println(result.size());
		for (String str : result) {
			sb.append(str).append("\n");
		}
		System.out.println(sb);
	}
}
