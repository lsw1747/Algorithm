import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		HashMap<String,Integer> map = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			map.put(st.nextToken(),0);
		}
		int count = 0;
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			if(map.containsKey(st.nextToken())) {
				count++;
			}
		}
		
		out.write(N+M-(2*count) + "\n");
		
		out.close();
	}
}
