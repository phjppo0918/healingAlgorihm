import java.util.*;
import java.io.*;

import java.math.BigInteger;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        for (int testCase = 0; testCase < NUMBER_OF_TESTCASE; testCase++) {
            int numberOfMember = Integer.parseInt(br.readLine());
            int member[][] = new int[numberOfMember][2];
            for (int i = 0; i < numberOfMember; i++) {
                st = new StringTokenizer(br.readLine());
                member[i][0] = Integer.parseInt(st.nextToken());
                member[i][1] = Integer.parseInt(st.nextToken());
            }

            int bestScore1 = member[0][0], bestScore2 = member[0][1];
            int answer = numberOfMember;
            fo
        }


        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}

