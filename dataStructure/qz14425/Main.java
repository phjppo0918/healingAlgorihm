import java.util.*;

import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int NUMBER_OF_WORD = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_CHECK = Integer.parseInt(st.nextToken());
        HashSet<String> hashSet = new HashSet<String>();
        for (int i = 0; i < NUMBER_OF_WORD; i++) {
            hashSet.add(br.readLine());
        }
        int answer = 0;
        for (int i = 0; i < NUMBER_OF_CHECK; i++) {
            if (hashSet.contains(br.readLine())) {
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


