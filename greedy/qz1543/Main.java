import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int[] num;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        char sentence[] = br.readLine().toCharArray();
        char voca[] = br.readLine().toCharArray();

        boolean isHave;
        int haveCount = 0;
        for (int i = 0; i < sentence.length - voca.length + 1; i++) {
            isHave = true;
            for (int j = 0; j < voca.length; j++) {
                if (sentence[i + j] != voca[j]) {
                    isHave = false;
                    break;
                }
            }
            if (isHave) {
                haveCount++;
                i += (voca.length - 1);
            }
        }

        sb.append(haveCount);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}

