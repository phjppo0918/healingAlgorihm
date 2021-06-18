import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_CARD = Integer.parseInt(br.readLine());
        BigInteger[] bigIntegers = new BigInteger[NUMBER_OF_CARD];
        for (int i = 0; i < NUMBER_OF_CARD; i++) {
            bigIntegers[i] = new BigInteger(br.readLine());
        }
        Arrays.sort(bigIntegers);
        int count = 1;
        BigInteger card = bigIntegers[0];
        int bestCount = 0;
        for (int i = 1; i < NUMBER_OF_CARD; i++) {
            if (bigIntegers[i].compareTo(bigIntegers[i-1]) == 0) {
                count++;
            } else {
                if (bestCount < count) {
                    card = bigIntegers[i-1];
                    bestCount = count;
                }
                count = 1;
            }
        }
        if (bestCount < count) {
            card = bigIntegers[NUMBER_OF_CARD-1];
        }
        sb.append(card);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}




