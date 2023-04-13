import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        Queue<Document> queue = new LinkedList<>();

        boolean flag = true;

        int T = Integer.parseInt(br.readLine());
        int N = 0, M = 0;


        while (T-- > 0) {
            int index = 1;
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                queue.add(new Document(i, Integer.parseInt(st.nextToken())));
            }
            while (!queue.isEmpty()) {
                Document document = queue.poll();
                flag = true;
                Iterator<Document> it = queue.iterator();

                while (it.hasNext()) {
                    Document d = it.next();
                    if (document.getPriority() < d.getPriority()) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    queue.add(document);
                } else {
                    if (document.getDocumentNumber() == M) {
                        sb.append(index).append("\n");
                    } else {
                        index++;
                    }
                }
            }

            queue.clear();
        }
        System.out.print(sb);
    }
}

class Document {
    private int documentNumber;
    private int priority;

    public Document(int documentNumber, int priority) {
        this.documentNumber = documentNumber;
        this.priority = priority;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public int getPriority() {
        return priority;
    }
}
