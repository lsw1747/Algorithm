import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Iterator<Integer> it;
		Set<Integer> A = new HashSet<Integer>();
		Set<Integer> B = new HashSet<Integer>();
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			A.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			B.add(Integer.parseInt(st.nextToken()));
		}

		// A-B
		it = B.iterator();
		while (it.hasNext()) {
			int elB = it.next();
			if (A.contains(elB)) {
				N--;
			}
		}

		// B-A
		it = A.iterator();
		while (it.hasNext()) {
			int elA = it.next();
			if (B.contains(elA)) {
				M--;
			}
		}

		System.out.println(N+M);
	}
}
