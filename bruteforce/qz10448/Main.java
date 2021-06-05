import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //  StringTokenizer st = new StringTokenizer(br.readLine());
        boolean num[] = new boolean[1001];
        int triNum[] = new int[44];
        triNum[0] = 1;
        for (int i = 1; i < 44; i++) {
            triNum[i] = triNum[i - 1] + i + 1;
        }
        for (int i = 0; i < 44; i++) {
            for (int j = 0; j < 44; j++) {
                for (int k = 0; k < 44; k++) {
                    int sum = triNum[i] + triNum[j] + triNum[k];
                    if (sum <= 1000) {
                        num[sum] = true;
                    }
                }
            }
        }
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        for (int i = 0; i < NUMBER_OF_TESTCASE; i++) {
            int testCaseNum = Integer.parseInt(br.readLine());
            if (num[testCaseNum]) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}



