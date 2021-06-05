import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num[] = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 1;
        while (true) {
            int ansCount = 0;
            for (int i = 0; i < 5; i++) {
                if (answer % num[i] == 0) {
                    ansCount++;
                }
            }
            if (ansCount >= 3) {
                break;
            }
            answer++;
        }
        sb.append(answer);

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}



