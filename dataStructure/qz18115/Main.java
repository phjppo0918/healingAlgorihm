import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        final int NUMBER_OF_CARD = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int acti[] = new int[NUMBER_OF_CARD];
        for (int i = 0; i < NUMBER_OF_CARD; i++) {
            acti[i] = Integer.parseInt(st.nextToken());
        }
        Deque<Integer> deque = new ArrayDeque<>();
        for (int card = 1; card <= NUMBER_OF_CARD; card++) {
            switch (acti[NUMBER_OF_CARD - card]) {
                case 1:
                    deque.addFirst(card);
                    break;
                case 2:
                    int temp = deque.pollFirst();
                    deque.addFirst(card);
                    deque.addFirst(temp);
                    break;
                case 3:
                    deque.addLast(card);
                    break;
            }
        }

        while (!deque.isEmpty()) {
            sb.append(deque.pollFirst());
            sb.append(" ");
        }
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}




