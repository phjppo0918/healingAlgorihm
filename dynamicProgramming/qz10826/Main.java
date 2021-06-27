import java.util.*;
import java.io.*;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_MEMBER = Integer.parseInt(br.readLine());
        BigInteger num1 = BigInteger.ZERO;
        BigInteger num2 = BigInteger.ONE;

        if (NUMBER_OF_MEMBER == 0) {
            sb.append(0);
        } else if (NUMBER_OF_MEMBER == 1) {
            sb.append(1);
        } else {
            for (int i = 0; i < NUMBER_OF_MEMBER - 1; i++) {
                BigInteger temp = num1.add(num2);
                num1 = num2;
                num2 = temp;
            }
            sb.append(num2.toString());
        }

        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }

}


