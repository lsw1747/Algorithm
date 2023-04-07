import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int middleValue = list.size() / 2;
        Collections.sort(list);

        System.out.println(getAvg(list)); //평균값 출력
        System.out.println(list.get(middleValue)); //중간값 출력
        System.out.println(getMode(list)); //최빈값 출력
        System.out.println(list.get(list.size() - 1) - list.get(0)); //최댓값 - 최솟값 출력
    }

    private static int getAvg(List<Integer> list) {
        double num = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            num += list.get(i);
        }
        num = num / size;
        return (int) Math.round((num / 10) * 10);
    }

    private static int getMode(List<Integer> list) {
        //Map에 넣은 뒤, containsKey 해서 있을 시 ++한 값 입력
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1, maxNum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                map.put(list.get(i), ++count);
            } else {
                count = 1;
                map.put(list.get(i), count);
            }
        }
        List<Integer> dupList = new ArrayList<>();

        for (int i : map.keySet()) {
            if (map.get(i) > maxNum) {
                dupList.clear();
                maxNum = map.get(i);
                dupList.add(i);
            } else if (map.get(i) == maxNum) {
                dupList.add(i);
            }
        }
        Collections.sort(dupList);

        if (dupList.size() == 1) {
            return dupList.get(0);
        } else {
            return dupList.get(1);
        }

    }
}