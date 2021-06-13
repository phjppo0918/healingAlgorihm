import java.util.*;
import java.io.*;

import java.math.BigInteger;

public class Main {
    public static int numValue[];
    public static int numLengthDp[];
    public static boolean visited[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        final int NUMBER_OF_A = Integer.parseInt(br.readLine());
        numValue = new int[NUMBER_OF_A];
        numLengthDp = new int[NUMBER_OF_A];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < NUMBER_OF_A; i++) {
            numValue[i] = Integer.parseInt(st.nextToken());
            numLengthDp[i] = 1;
        }
        for (int i = NUMBER_OF_A - 1; i > -1; i--) {

            dynamicCount(i);

        }
        int maxLength = 0;
        for (int i : numLengthDp) {
            if (i > maxLength) {
                maxLength = i;
            }
        }
        sb.append(maxLength);
        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }

    public static int dynamicCount(int pivot) {

        if (numLengthDp[pivot] == 1) {
            for (int i = pivot - 1; i > -1; i--) {
                if (numValue[pivot] > numValue[i]) {
                    numLengthDp[pivot] = Math.max(numLengthDp[pivot], dynamicCount(i) + 1);
                }
            }
        }
        return numLengthDp[pivot];
    }
}

