import java.io.*;
import java.util.*;

public class Main {
    static int count;
    static Deque<Integer> deque;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        count = 0;
        sb = new StringBuilder();
        deque = new LinkedList<>();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        //큐의 크기 (0<N<=50, 단 N은 자연수)
        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            deque.add(i + 1);
        }
        //지민스가 뽑으려는 수의 개수 (M<=N, 단 M은 자연수)
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            boolean odd = N % 2 == 0 ? false : true;
            int input = Integer.parseInt(st.nextToken());
            int index = 0;
            double middleIndex = 0;
            Iterator<Integer> it = deque.iterator();

            while (it.hasNext()) {
                index++;
                if (input == it.next()) {
                    break;
                }
            }

            while (input != deque.peek()) {
                middleIndex = odd ? Math.round((double) N / 2) : N / 2;
                if (index > middleIndex) {
                    moveRight();
                } else {
                    moveLeft();
                }
            }
            deque.poll();
            N--;
        }
        System.out.println(count);
    }

    public static void moveLeft() {
        deque.addLast(deque.pollFirst());
        count++;
    }

    public static void moveRight() {
        deque.addFirst(deque.pollLast());
        count++;
    }
}