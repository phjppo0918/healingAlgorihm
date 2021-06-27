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
            int fileCount = Integer.parseInt(br.readLine());
            PriorityQueue<Long> files = new PriorityQueue<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < fileCount; i++) {
                files.add(Long.parseLong(st.nextToken()));
            }
            long cost = 0l;
            while (files.size() != 1) {
                long file1 = files.poll();
                long file2 = files.poll();
                cost += (file1 + file2);
                files.add(file1 + file2);
            }
            sb.append(cost);
            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


