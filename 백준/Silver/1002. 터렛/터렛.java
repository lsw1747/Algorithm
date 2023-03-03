import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		// 연립2차방정식의 해의 개수를 구하라.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int x1, y1, r1, x2, y2, r2;
		double d; // 두 원 사이의 거리
		

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			r1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());
			
			d = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));
			
			
			//Case 1 : 두 원이 만나지 않음
			if(r1 + r2 < d || Math.abs(r1-r2) > d || (d==0 && r1 != r2)) {
				sb.append("0").append("\n");
			}
			//Case 2 : 두 원이 하나의 점에서 만남
			else if ((r1 + r2 == d || Math.abs(r1 - r2) == d) && d > 0) {
				sb.append("1").append("\n");
			}
			//Case 3 : 두 원이 두개의 점에서 만남
			else if (Math.abs(r1 - r2) < d && r1+r2 > d) {
				sb.append("2").append("\n");
			}
			//Case 4 : 두 원이 일치함
			else if (d == 0) {
				sb.append("-1").append("\n");
			}
			
		}

		System.out.print(sb);

	}
}
