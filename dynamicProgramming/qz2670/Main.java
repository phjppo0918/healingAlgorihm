import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_CASE = Integer.parseInt(st.nextToken());
        double number[] = new double[NUMBER_OF_CASE];
        number[0] = Double.parseDouble(br.readLine());
        double maxNum = 0;
        for (int i = 1; i < NUMBER_OF_CASE; i++) {
            double temp = Double.parseDouble(br.readLine());
            if (temp > temp * number[i - 1]) {
                number[i] = temp;
            } else {
                number[i] = temp * number[i - 1];
            }
            if (number[i] > maxNum) {
                maxNum = number[i];
            }
        }
        sb.append(String.format("%.3f", maxNum));
        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}




