import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_TROP = Integer.parseInt(br.readLine());
        int trop[] = new int[NUMBER_OF_TROP];
        for (int i = 0; i < NUMBER_OF_TROP; i++) {
            trop[i] = Integer.parseInt(br.readLine());
        }
        int left = 0;
        int right = 0;
        int best = 0;
        for (int i = 0; i < NUMBER_OF_TROP; i++) {
            if (trop[i] > best) {
                left++;
                best = trop[i];
            }
        }
        best = 0;
        for (int i = NUMBER_OF_TROP - 1; i > -1; i--) {
            if (trop[i] > best) {
                right++;
                best = trop[i];
            }
        }
        sb.append(left);
        sb.append("\n");
        sb.append(right);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


