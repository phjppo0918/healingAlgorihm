import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final char MIN_NUMBER[] = st.nextToken().toCharArray();
        final char MAX_NUMBER[] = st.nextToken().toCharArray();
        int eightCount = 0;
        if (MAX_NUMBER.length == MIN_NUMBER.length) {
            for (int i = 0; i < MAX_NUMBER.length; i++) {
                if (MAX_NUMBER[i] == MIN_NUMBER[i]) {
                    if (MAX_NUMBER[i] == '8') eightCount++;
                } else {
                    break;
                }
            }
        }
        sb.append(eightCount);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


