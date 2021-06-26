import java.util.*;
import java.io.*;

//import java.math.BigInteger;
class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        final int NUMBER_OF_BRIDGE = Integer.parseInt(br.readLine());
        int bridgeValue[] = new int[NUMBER_OF_BRIDGE];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < NUMBER_OF_BRIDGE; i++) {
            bridgeValue[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        final int START = Integer.parseInt(st.nextToken()) - 1;
        final int END = Integer.parseInt(st.nextToken()) - 1;
        Queue<Integer> bridgeQueue = new LinkedList<>();
        bridgeQueue.add(START);
        int visitedStamp[] = new int[NUMBER_OF_BRIDGE];
        visitedStamp[START] = 1;
        int answerMin = Integer.MAX_VALUE;
        while (!bridgeQueue.isEmpty()) {
            int locationTemp = bridgeQueue.poll();
            if (locationTemp == END) {
                if (visitedStamp[END] < answerMin) {
                    answerMin = visitedStamp[END];
                    continue;
                }
            }
            //좌측
            int multiCount = 1;
            int pivot = locationTemp - bridgeValue[locationTemp];
            while (pivot >= 0) {
                if (visitedStamp[pivot] == 0) {
                    visitedStamp[pivot] = visitedStamp[locationTemp] + 1;
                    bridgeQueue.add(pivot);
                } else {
                    if (visitedStamp[pivot] > visitedStamp[locationTemp] + 1) {
                        visitedStamp[pivot] = visitedStamp[locationTemp] + 1;
                        bridgeQueue.add(pivot);
                    }
                }
                multiCount++;
                pivot = locationTemp - bridgeValue[locationTemp] * multiCount;
            }

            //우측
            multiCount = 1;
            pivot = locationTemp + bridgeValue[locationTemp];
            while (pivot < NUMBER_OF_BRIDGE) {
                if (visitedStamp[pivot] == 0) {
                    visitedStamp[pivot] = visitedStamp[locationTemp] + 1;
                    bridgeQueue.add(pivot);
                } else {
                    if (visitedStamp[pivot] > visitedStamp[locationTemp] + 1) {
                        visitedStamp[pivot] = visitedStamp[locationTemp] + 1;
                        bridgeQueue.add(pivot);
                    }
                }
                multiCount++;
                pivot = locationTemp + bridgeValue[locationTemp] * multiCount;
            }

        }
        if (answerMin == Integer.MAX_VALUE) {
            answerMin = 0;
        }
        sb.append(answerMin - 1);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


