import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        char[] sentence = br.readLine().toCharArray();

        while (sentence[0] != '#') {
            int count = 0;
            char alpha = sentence[0];
            if (sentence[0] >= 'a') {
                sentence[0] -= 32;
            }
            for (int i = 2; i < sentence.length; i++) {

                if (sentence[i] >= 'a') {
                    sentence[i] -= 32;
                }

                if (sentence[i] == sentence[0]) {
                    count++;
                }
            }
            sb.append(alpha);
            sb.append(" ");
            sb.append(count);
            sb.append("\n");

            sentence = br.readLine().toCharArray();
        }

        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


