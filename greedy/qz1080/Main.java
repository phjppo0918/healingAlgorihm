import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int ROWS = Integer.parseInt(st.nextToken());
        final int COLS = Integer.parseInt(st.nextToken());
        boolean before[][] = new boolean[ROWS][COLS];
        boolean after[][] = new boolean[ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            char temp[] = br.readLine().toCharArray();
            for (int j = 0; j < COLS; j++) {
                if (temp[j] == '1') {
                    before[i][j] = true;
                }
            }
        }

        for (int i = 0; i < ROWS; i++) {
            char temp[] = br.readLine().toCharArray();
            for (int j = 0; j < COLS; j++) {
                if (temp[j] == '1') {
                    after[i][j] = true;
                }
            }
        }
        int changeCount = 0;
        for (int i = 0; i < ROWS - 2; i++) {
            for (int j = 0; j < COLS - 2; j++) {
                if (before[i][j] != after[i][j]) {
                    changeCount++;
                    for (int ii = i; ii < i + 3; ii++) {
                        for (int jj = j; jj < j + 3; jj++) {
                            before[ii][jj] = !before[ii][jj];
                        }
                    }
                }
            }
        }
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (before[i][j] != after[i][j]) {
                    changeCount = -1;
                    break;
                }
            }
            if (changeCount == -1) {
                break;
            }
        }

        sb.append(changeCount);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


