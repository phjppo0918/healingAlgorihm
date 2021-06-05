import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_VALUE = Integer.parseInt(st.nextToken());
        int targetValue = Integer.parseInt(st.nextToken());
        final int VALUE_GAP = Integer.parseInt(st.nextToken());
        int value[] = new int[NUMBER_OF_VALUE];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < NUMBER_OF_VALUE; i++) {
            value[i] = Integer.parseInt(st.nextToken());
        }
        int maxStack = 0;
        for (int i = 0; i < NUMBER_OF_VALUE; i++) {
            if (value[i] != targetValue) {
                continue;
            }
            maxStack++;
            targetValue += VALUE_GAP;
        }

        sb.append(maxStack);
        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}



