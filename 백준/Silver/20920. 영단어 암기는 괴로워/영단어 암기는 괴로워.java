import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String word = "";
        StringBuilder sb = new StringBuilder();
        List<Note> vocabularyNote = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        //단어의 개수
        int N = Integer.parseInt(st.nextToken());
        //외울 단어의 길이 기준
        int M = Integer.parseInt(st.nextToken());


        //입력 단어를 단어장에 기입 HashMap<단어(String), 빈도(Integer)>
        for (int i = 0; i < N; i++) {
            word = br.readLine();
            if (word.length() < M) continue;
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (String str : map.keySet()) {
            vocabularyNote.add(new Note(str, map.get(str)));
        }
        vocabularyNote.sort(Comparator.comparing(Note::getFrequency).thenComparing(Note::getLength).reversed().thenComparing(Note::getWord));

        for (Note n : vocabularyNote) {
            sb.append(n.getWord())
                    .append("\n");
        }
        System.out.println(sb);
    }
}

class Note {
    private String word;
    private int frequency;

    public Note() {

    }

    public Note(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    public String getWord() {
        return word;
    }

    public int getLength() {
        return word.length();
    }

    public int getFrequency() {
        return frequency;
    }
}

