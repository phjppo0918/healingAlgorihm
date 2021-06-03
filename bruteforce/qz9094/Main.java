import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st; //= new StringTokenizer(br.readLine());
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        for (int testCase = 0; testCase < NUMBER_OF_TESTCASE; testCase++) {
            st = new StringTokenizer(br.readLine());
            int maxNum = Integer.parseInt(st.nextToken());
            int plusNum = Integer.parseInt(st.nextToken());
            int answer = 0;
            for (int a = 1; a < maxNum; a++) {
                for (int b = a + 1; b < maxNum; b++) {
                    if ((a * a + b * b + plusNum) % (a * b) == 0) {
                        answer++;
                    }
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


