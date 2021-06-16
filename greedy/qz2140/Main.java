import java.util.*;
import java.io.*;

import java.math.BigInteger;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st;
        final int FIELD_LENGTH = Integer.parseInt(br.readLine());
        char field[][] = new char[FIELD_LENGTH][];
        for (int i = 0; i < FIELD_LENGTH; i++) {
            field[i] = br.readLine().toCharArray();
        }
        int mineCount = 0;
        for (int i = 1; i < FIELD_LENGTH - 1; i++) {
            for (int j = 1; j < FIELD_LENGTH - 1; j++) {

                boolean notFind = false;
                for (int ii = i - 1; ii < i + 2; ii++) {
                    for (int jj = j - 1; jj < j + 2; jj++) {
                        if (field[ii][jj] == '0') {
                            notFind = true;
                            break;
                        }
                    }
                }
                if (notFind) {
                    continue;
                }

                mineCount++;

                for (int ii = i - 1; ii < i + 2; ii++) {
                    for (int jj = j - 1; jj < j + 2; jj++) {
                        if (field[ii][jj] > '0') {
                            field[ii][jj]--;
                        }
                    }
                }


            }
        }
        sb.append(mineCount);
        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}
