import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	// Question.14425: 문자열 집합 [S3] : 2023-02-20
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
//		List<String> strings = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();
		int containNumber = 0;

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
//			strings.add(br.readLine());
			map.put(br.readLine(), i);
		}
		
		for (int i = 0; i < M; i++) {
//			if(strings.contains(br.readLine())) containNumber++;
			if(map.containsKey(br.readLine())) containNumber++;
		}
		
		System.out.println(containNumber);
	}
}
