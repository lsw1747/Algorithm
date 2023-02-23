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
		int count = 0;
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			if(A.containsKey(Integer.parseInt(st.nextToken()))) {
				count++;
			}
		}
		
		System.out.println(N+M-(2*count));
	}
}
