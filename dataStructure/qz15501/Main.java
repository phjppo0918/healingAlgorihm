import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int before[] = new int[NUMBER_OF_TESTCASE];
        int after[] = new int[NUMBER_OF_TESTCASE];
        for (int i = 0; i < NUMBER_OF_TESTCASE; i++) {
            before[i] = Integer.parseInt(st.nextToken());
            after[i] = Integer.parseInt(st2.nextToken());
        }

        int afterPivot = 0;
        for (int i = 0; i < NUMBER_OF_TESTCASE; i++) {
            if (after[i] == before[0]) {
                afterPivot = i;
                break;
            }
        }
        boolean goRight = false;
        boolean isGoodPuzzle = true;
        if (NUMBER_OF_TESTCASE != 1) {
            int afterNextPivot = afterPivot + 1;
            if (afterNextPivot == NUMBER_OF_TESTCASE) {
                afterNextPivot = 0;
            }
            if (before[1] == after[afterNextPivot]) {
                goRight = true;
            }

            if (goRight) {
                for (int i = 0; i < NUMBER_OF_TESTCASE; i++) {
                    if (before[i] != after[afterPivot]) {
                        isGoodPuzzle = false;
                        break;
                    }
                    afterPivot++;
                    if (afterPivot == NUMBER_OF_TESTCASE) {
                        afterPivot = 0;
                    }
                }
            } else {
                for (int i = 0; i < NUMBER_OF_TESTCASE; i++) {
                    if (before[i] != after[afterPivot]) {
                        isGoodPuzzle = false;
                        break;
                    }
                    afterPivot--;
                    if (afterPivot == -1) {
                        afterPivot = NUMBER_OF_TESTCASE - 1;
                    }
                }
            }
        }


        if (isGoodPuzzle) {
            sb.append("good puzzle");
        } else {
            sb.append("bad puzzle");
        }
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}
