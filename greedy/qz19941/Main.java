import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int LINE_LENGTH = Integer.parseInt(st.nextToken());
        final int CATCH_LENGTH = Integer.parseInt(st.nextToken());
        char line[] = br.readLine().toCharArray();
        int answer = 0;
        for (int i = 0; i < LINE_LENGTH; i++) {
            if (line[i] == 'P') {
                for (int j = i - CATCH_LENGTH; j <= i + CATCH_LENGTH; j++) {
                    try {
                        if (line[j] == 'H') {
                            line[j] = 0;
                            answer++;
                            break;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        continue;
                    }
                }
            }
        }
        sb.append(answer);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


