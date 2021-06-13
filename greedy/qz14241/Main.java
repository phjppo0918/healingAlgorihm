import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        final int NUMBER_OF_SLIME = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> slimes = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < NUMBER_OF_SLIME; i++) {
            slimes.add(Integer.parseInt(st.nextToken()));
        }
        int answer = 0;
        while (slimes.size() != 1) {
            int slime1 = slimes.poll();
            int slime2 = slimes.poll();
            answer += slime1 * slime2;
            slimes.add(slime1 + slime2);
        }

        sb.append(answer);
        sb.append("\n");


        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}

