import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        for (int testCase = 0; testCase < NUMBER_OF_TESTCASE; testCase++) {
            st = new StringTokenizer(br.readLine());
            int nationCount = Integer.parseInt(st.nextToken());
            sb.append(nationCount - 1);
            sb.append("\n");
            int airPlaneCount = Integer.parseInt(st.nextToken());
            boolean nation[][] = new boolean[nationCount][nationCount];
            boolean visited[] = new boolean[nationCount];

            for (int i = 0; i < airPlaneCount; i++) {
                st = new StringTokenizer(br.readLine());
                int nation1 = Integer.parseInt(st.nextToken());
                int nation2 = Integer.parseInt(st.nextToken());
                nation[nation1 - 1][nation2 = 1] = true;
                nation[nation2 - 1][nation1 = 1] = true;
            }
        }

        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


