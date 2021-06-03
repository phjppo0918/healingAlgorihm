import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_MEMBER = Integer.parseInt(st.nextToken());
        final String AVOID_LABEL =st.nextToken();
        int labelNo = 0;
        int labelPatchCount = 0;
        while(labelPatchCount != NUMBER_OF_MEMBER) {
            labelNo++;
            String label = ""+labelNo;
            if(label.contains(AVOID_LABEL)) {
                continue;
            }
            labelPatchCount++;
        }
        sb.append(labelNo);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


