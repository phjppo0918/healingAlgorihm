import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        final int GAP = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int b = 1; b < 501; b++) {
            for (int a = b; a < 501; a++) {
                if (b * b == a * a - GAP) {
                    answer++;
                    break;
                } else if (b * b < a * a - GAP) {
                    break;
                }
            }
        }
        sb.append(answer);
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


