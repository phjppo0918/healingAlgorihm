import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int MAX_COLS = Integer.parseInt(st.nextToken());
        final int MAX_ROWS = Integer.parseInt(st.nextToken());
        char graph[][] = new char[MAX_COLS][MAX_ROWS];
        int ansCount = 0;
        for (int i = 0; i < MAX_COLS; i++) {
            graph[i] = br.readLine().toCharArray();
            for (int j = 0; j < MAX_ROWS; j++) {
                if (graph[i][j] == '-') {
                    ansCount++;
                    while (j < MAX_ROWS && graph[i][j] == '-') {
                        j++;
                    }
                }
            }
        }

        for (int i = 0; i < MAX_ROWS; i++) {
            for (int j = 0; j < MAX_COLS; j++) {
                if (graph[j][i] == '|') {
                    ansCount++;
                    while (j < MAX_COLS && graph[j][i] == '|') {
                        j++;
                    }
                }
            }

        }
        sb.append(ansCount);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


