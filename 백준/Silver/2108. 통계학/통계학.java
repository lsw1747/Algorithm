import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] counter = new int[8001];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int num = 0;
        int maxFrequent = 0;
        int modeNum = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> dupList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(br.readLine());
            list.add(num);
            counter[num + 4000]++;
            if (max < num) max = num;
            if (min > num) min = num;
            sum += num;
        }
        Collections.sort(list);

        for (int i = 0; i < N; i++) {
            if (maxFrequent == counter[list.get(i) + 4000]) {
                //중복리스트에 추가
                if (!dupList.contains(list.get(i))) {
                    dupList.add(list.get(i));
                }
            } else if (maxFrequent < counter[list.get(i) + 4000]) {
                maxFrequent = counter[list.get(i) + 4000];
                //리스트 초기화 후 리스트에 새로 추가
                dupList.clear();
                dupList.add(list.get(i));
            }
        }

        modeNum = (dupList.size() > 1) ? dupList.get(1) : dupList.get(0);

        sb.append(Math.round(sum / (double) N))
                .append("\n")
                .append(list.get(N / 2))
                .append("\n")
                .append(modeNum)
                .append("\n")
                .append(max - min);

        System.out.println(sb);

    }
}
