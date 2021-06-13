import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int[] num;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; //= new StringTokenizer(br.readLine());
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        for (int testCase = 0; testCase < NUMBER_OF_TESTCASE; testCase++) {
            int numberOfStock = Integer.parseInt(br.readLine());
            int stock[] = new int[numberOfStock];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < numberOfStock; i++) {
                stock[i] = Integer.parseInt(st.nextToken());
            }
            int high = stock[numberOfStock - 1];
            long answer = 0;
            for (int i = numberOfStock - 2; i > -1; i--) {
                if (stock[i] < high) {
                    answer += (high - stock[i]);
                } else {
                    high = stock[i];
                }
            }
            sb.append(answer);
            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}

