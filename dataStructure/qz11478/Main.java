import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringBuilder stringBuilder;
        char input[] = br.readLine().toCharArray();
        HashSet<String> hs = new HashSet<String>();
        for (int i = 1; i <= input.length; i++) { //자리수
            for (int j = 0; j < input.length - i + 1; j++) { //시작 위치
                stringBuilder = new StringBuilder();
                for (int k = j; k < j + i; k++) {
                    stringBuilder.append(input[k]);
                }
                hs.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();

            }
        }

        // StringTokenizer st;// = new StringTokenizer(br.readLine());
        sb.append(hs.size());
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}
