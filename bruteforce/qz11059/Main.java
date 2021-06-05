import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        final char input[] = br.readLine().toCharArray();
        int length = input.length;
        if (length % 2 == 1) {
            length--;
        }
        boolean isAnswer = false;
        while (!isAnswer) {
            for (int i = 0; i < input.length - length + 1; i++) {
                int leftTotal = 0;
                for (int j = i; j < i + length / 2; j++) {
                    leftTotal += input[j];
                }
                int rightTotal = 0;
                for (int j = i + length / 2; j < i + length; j++) {
                    rightTotal += input[j];
                }
                if (leftTotal == rightTotal) {

                    sb.append(length);
                    isAnswer = true;
                    break;
                }
            }
            length -= 2;
        }


        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}



