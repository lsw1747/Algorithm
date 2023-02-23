import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Iterator<Map.Entry<Integer, Integer>> it;
		HashMap<Integer,Integer> A = new HashMap<>();
		HashMap<Integer,Integer> B = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			A.put(Integer.parseInt(st.nextToken()),0);
		}

		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			B.put(Integer.parseInt(st.nextToken()),0);
		}
		
		it = B.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, Integer> entry = it.next();
			if(A.containsKey(entry.getKey())) {
				N--;
			}
		}
		it = A.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, Integer> entry = it.next();
			if(B.containsKey(entry.getKey())) {
				M--;
			}
		}
		System.out.println(N+M);
		
	}
}
