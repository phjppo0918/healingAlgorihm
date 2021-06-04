import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //  StringTokenizer st = new StringTokenizer(br.readLine());
        int member[] = new int[9];
        int total = 0;
        for (int i = 0; i < 9; i++) {
            member[i] = Integer.parseInt(br.readLine());
            total += member[i];
        }
        boolean isAnswer = false;
        int skip1 = -1, skip2 = -1;
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (total - member[i] - member[j] == 100) {
                    skip1 = i;
                    skip2 = j;
                    isAnswer = true;
                    break;
                }
            }
            if (isAnswer) {
                break;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i == skip1 || i == skip2) {
                continue;
            }
            sb.append(member[i]);
            sb.append("\n");
        }

        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


