import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int K = Integer.parseInt(br.readLine());
		int[] arr = new int[6];

		int maxWidth = 0;
		int maxHeight = 0;
		int maxWidthIndex = 0;
		int maxHeightIndex = 0;
		int width = 0;
		int height = 0;

		for (int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			int vector = Integer.parseInt(st.nextToken());
			int len = Integer.parseInt(st.nextToken());

			arr[i] = len;

			// 가로
			if (vector < 3 && maxWidth < len) {
				maxWidth = len;
				maxWidthIndex = i;

			}
			// 세로
			if (vector >= 3 && maxHeight < len) { 
				maxHeight = len;
				maxHeightIndex = i;
			}
		}
		int idx1 = maxWidthIndex - 1;
		int idx2 = maxWidthIndex + 1;
		
		height = Math.abs(arr[idx1 < 0 ? idx1 += 6 : idx1] - arr[idx2 > 5 ? idx2 -= 6 : idx2]);
		
		idx1 = maxHeightIndex - 1;
		idx2 = maxHeightIndex + 1;
		
		width = Math.abs(arr[idx1 < 0 ? idx1 += 6 : idx1] - arr[idx2 > 5 ? idx2 -= 6 : idx2]);
		
		System.out.println((getArea(maxWidth, maxHeight) - getArea(width, height)) * K);
			
	}

	private static int getArea(int x, int y) {
		return x * y;
	}

}