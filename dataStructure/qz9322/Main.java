import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());

        for (int testCase = 0; testCase < NUMBER_OF_TESTCASE; testCase++) {
            int numberOfWord = Integer.parseInt(br.readLine());
            String oneKey[] = br.readLine().split(" ");
            String keySeqTemp[] = br.readLine().split(" ");
            String secWord[] = br.readLine().split(" ");
            String answer[] = new String[numberOfWord];

            for (int i = 0; i < numberOfWord; i++) {
                for (int j = 0; j < numberOfWord; j++) {
                    if (keySeqTemp[i].equals(oneKey[j])) {
                        answer[j] = secWord[i];
                        break;
                    }
                }
            }
            for (String k : answer) {
                sb.append(k);
                sb.append(" ");
            }
            sb.append("\n");


        }

        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}




