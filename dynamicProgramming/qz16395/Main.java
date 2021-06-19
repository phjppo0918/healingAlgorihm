import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int COLS = Integer.parseInt(st.nextToken());
        final int ROWS = Integer.parseInt(st.nextToken());
        sb.append(getPascal(COLS, ROWS));
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }

    public static int getPascal(int cols, int seq) {
        if (seq == 1 || cols == seq) {
            return 1;
        }
        int addTotal = 0;

        for (int i = cols - 1; i > 0; i--) {
            addTotal += getPascal(i, seq - 1);
        }

        return addTotal;
    }

}




