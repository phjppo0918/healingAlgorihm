import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int JUNPYO_FAV_NUM = Integer.parseInt(st.nextToken());
        final int SEED = Integer.parseInt(st.nextToken());
        final int SAMPLE1 = Integer.parseInt(st.nextToken());
        final int SAMPLE2 = Integer.parseInt(st.nextToken());
        boolean isAnswer = false;
        for (int a = 0; a < JUNPYO_FAV_NUM; a++) {
            for (int b = 0; b < JUNPYO_FAV_NUM; b++) {
                if (((a * SEED + b) % JUNPYO_FAV_NUM == SAMPLE1) &&
                        (((a * SAMPLE1 + b) % JUNPYO_FAV_NUM) == SAMPLE2)) {
                    isAnswer = true;
                    sb.append(a);
                    sb.append(" ");
                    sb.append(b);
                    sb.append("\n");
                    break;
                }
            }
            if (isAnswer) {
                break;
            }
        }


        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


