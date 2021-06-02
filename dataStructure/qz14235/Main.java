import java.util.*;

import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st; //= new StringTokenizer(br.readLine());
        final int NUMBER_OF_ACTIVITY = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> gift = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < NUMBER_OF_ACTIVITY; i++) {
            st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            if (temp == 0) {
                if (gift.isEmpty()) {
                    sb.append(-1);
                } else {
                    sb.append(gift.poll());
                }
                sb.append("\n");
            } else {
                //gift.add(temp);
                while (st.hasMoreTokens()) {
                    gift.add(Integer.parseInt(st.nextToken()));
                }
            }
        }


        sb.append("\n");


        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


