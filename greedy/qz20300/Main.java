import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        final int NUMBER_OF_FITNESS = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long fitness[] = new long[NUMBER_OF_FITNESS];
        for (int i = 0; i < NUMBER_OF_FITNESS; i++) {
            fitness[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(fitness);
        long lossMax = Long.MIN_VALUE;
        if (NUMBER_OF_FITNESS % 2 == 1) {
            lossMax = fitness[NUMBER_OF_FITNESS - 1];
            for (int i = 0; i < (NUMBER_OF_FITNESS - 1) / 2; i++) {
                long loss = fitness[i] + fitness[NUMBER_OF_FITNESS - 2 - i];
                if (loss > lossMax) {
                    lossMax = loss;
                }
            }
        } else {
            for (int i = 0; i < NUMBER_OF_FITNESS / 2; i++) {
                long loss = fitness[i] + fitness[NUMBER_OF_FITNESS - 1 - i];
                if (loss > lossMax) {
                    lossMax = loss;
                }
            }
        }
        sb.append(lossMax);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


