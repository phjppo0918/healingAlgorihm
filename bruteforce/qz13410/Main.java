import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER = Integer.parseInt(st.nextToken());
        final int TERM = Integer.parseInt(st.nextToken());
        int numTerm[] = new int[TERM];
        for (int i = 1; i <= TERM; i++) {
            char tempArr[] = String.valueOf(NUMBER * i).toCharArray();
            int temp = 0;
            int digit = 1;
            for (int j = 0; j < tempArr.length; j++) {
                temp += (tempArr[j] - '0') * digit;
                digit *= 10;
            }
            numTerm[i - 1] = temp;
        }
        Arrays.sort(numTerm);
        sb.append(numTerm[TERM - 1]);

        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}



