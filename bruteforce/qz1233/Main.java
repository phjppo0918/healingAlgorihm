import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int S1 = Integer.parseInt(st.nextToken());
        final int S2 = Integer.parseInt(st.nextToken());
        final int S3 = Integer.parseInt(st.nextToken());
        int numCount[] = new int[S1 + S2 + S3 + 1];
        for (int a = 1; a <= S1; a++) {
            for (int b = 1; b <= S2; b++) {
                for (int c = 1; c <= S3; c++) {
                    numCount[a + b + c]++;
                }
            }
        }
        int bestNum = 0;
        int bestCount = 0;
        for (int i = 1; i < numCount.length; i++) {
            if (numCount[i] > bestCount) {
                bestNum = i;
                bestCount = numCount[i];
            }
        }
        sb.append(bestNum);
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


