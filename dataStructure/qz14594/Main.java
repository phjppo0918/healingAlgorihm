import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_ROOM = Integer.parseInt(br.readLine());
        final int NUMBER_OF_ACT = Integer.parseInt(br.readLine());

        boolean wallBreak[] = new boolean[NUMBER_OF_ROOM];
        for (int act = 0; act < NUMBER_OF_ACT; act++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for (int i = start - 1; i < end - 1; i++) {
                wallBreak[i] = true;
            }
        }
        int answer = 0;
        for (int i = 0; i < NUMBER_OF_ROOM; i++) {
            if (!wallBreak[i]) {
                answer++;
            }
        }
        sb.append(answer);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


