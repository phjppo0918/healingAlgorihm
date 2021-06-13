import java.util.*;
import java.io.*;

import java.math.BigInteger;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int[] num;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());
        BigInteger bigNumber = BigInteger.valueOf(1);
        for (int i = N; i > N - M; i--) {
            bigNumber = bigNumber.multiply(BigInteger.valueOf(i));
        }
        for (int i = M; i > 1; i--) {
            bigNumber = bigNumber.divide(BigInteger.valueOf(i));
        }
        sb.append(bigNumber.toString());
        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }
}

