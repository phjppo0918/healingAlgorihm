import java.util.*;
import java.io.*;

//import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_OPER = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int oper = 0; oper < NUMBER_OF_OPER; oper++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if (priorityQueue.isEmpty()) {
                    sb.append(0);
                } else {
                    sb.append(priorityQueue.poll());
                }
                sb.append("\n");
            } else {
                priorityQueue.add(input);
            }
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }

}


