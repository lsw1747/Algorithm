import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		int x1, y1, x2, y2, n, cx, cy, r, count;

		for (int i = 0; i < T; i++) {
			count = 0;
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());

			n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				cx = Integer.parseInt(st.nextToken());
				cy = Integer.parseInt(st.nextToken());
				r = Integer.parseInt(st.nextToken());
				count += isInCircleArea(cx, cy, r, x1, y1);
				count += isInCircleArea(cx, cy, r, x2, y2);
				
				//출발점과 도착점 모두 한 원 안에 있을 때
				if(isInCircleArea(cx, cy, r, x1, y1) + isInCircleArea(cx, cy, r, x2, y2) > 1) {
					count -= 2;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}

	public static int isInCircleArea(int x, int y, int r, int cx, int cy) {
		return (Math.pow(x - cx, 2) + Math.pow(y - cy, 2)) < Math.pow(r, 2) ? 1 : 0;
	}
}
