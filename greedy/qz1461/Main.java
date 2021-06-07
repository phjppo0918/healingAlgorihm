import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_BOOK = Integer.parseInt(st.nextToken());
        final int MAXIMUM_BRING_BOOK = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> plusQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusQ = new PriorityQueue<>(Collections.reverseOrder());
        int bestLength = 0;
        for (int i = 0; i < NUMBER_OF_BOOK; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp > 0) {
                plusQ.add(temp);
            } else {
                temp *= -1;
                minusQ.add(temp);
            }
            if (temp > bestLength) {
                bestLength = temp;
            }
        }
        int walkCount = bestLength;
        walkCount *= -1;
        int bringBook = MAXIMUM_BRING_BOOK;
        int SJLocation = 0;
        if (!plusQ.isEmpty()) {
            while (true) {
                int book = plusQ.poll();
                int walkTemp = SJLocation - book;
                if (walkTemp < 0) {
                    walkTemp *= -1;
                }
                walkCount += walkTemp;
                SJLocation = book;
                bringBook--;

                if (plusQ.isEmpty()) {
                    break;
                }

                if (bringBook == 0) {
                    walkCount += SJLocation;
                    SJLocation = 0;
                    bringBook = MAXIMUM_BRING_BOOK;
                }

            }
            walkCount += SJLocation;
            SJLocation = 0;
            bringBook = MAXIMUM_BRING_BOOK;
        }
        if (!minusQ.isEmpty()) {
            while (true) {
                int book = minusQ.poll();
                int walkTemp = SJLocation - book;
                if (walkTemp < 0) {
                    walkTemp *= -1;
                }
                walkCount += walkTemp;
                SJLocation = book;
                bringBook--;

                if (minusQ.isEmpty()) {
                    break;
                }

                if (bringBook == 0) {
                    walkCount += SJLocation;
                    SJLocation = 0;
                    bringBook = MAXIMUM_BRING_BOOK;
                }

            }
            walkCount += SJLocation;
        }


        sb.append(walkCount);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


