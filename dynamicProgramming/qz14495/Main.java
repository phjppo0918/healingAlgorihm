import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int MAX_NUM = 116;
        long dp[] = new long[MAX_NUM + 1];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        for(int i=4;i<=MAX_NUM;i++) {
            dp[i] = dp[i-1] + dp[i - 3];
        }
        sb.append(dp[Integer.parseInt(br.readLine())]);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


