package Q10815;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
	//Question.10815 : 숫자 카드 [S5] : 2023-02-20
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n1 = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n1];
		for(int i=0; i<n1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int n2 = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		Arrays.sort(arr);
		
		int result = 0;
		
		for(int i=0; i<n2; i++) {
			result = Arrays.binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0 ? 1: 0;
			sb.append(result).append(" ");
		}
		
		System.out.println(sb);
	}
}


/*
 * Arrays.sort 에서 꽤 많은 시간이 소요되는 것으로 보인다.
 * Arrays 대신 HashMap을 이용해 containsKey 메소드로 조회하면 300ms 정도 단축되는 것으로 보임.
 * 
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  StringBuilder sb = new StringBuilder();
  StringTokenizer st;
  HashMap<Integer, Integer> myCards = new HashMap<>();
  
  int N =  Integer.parseInt(br.readLine());
  st = new StringTokenizer(br.readLine());
  for(int i=0; i<N; i++) {
     myCards.put(Integer.parseInt(st.nextToken()), 1);
  }
  
  int M =  Integer.parseInt(br.readLine());
  st = new StringTokenizer(br.readLine());
  int num = 0;
  for(int i=0; i<M; i++) {
     num = Integer.parseInt(st.nextToken());
     num = myCards.containsKey(num) ? 1: 0;
     sb.append(num).append(" ");
  }
      
      System.out.println(sb);
 */