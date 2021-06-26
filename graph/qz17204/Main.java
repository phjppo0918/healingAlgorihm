import java.util.*;
import java.io.*;

//import java.math.BigInteger;
class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_MEMBER = Integer.parseInt(st.nextToken());
        final int BS_NUMBER = Integer.parseInt(st.nextToken());
        int memberSelect[] = new int[NUMBER_OF_MEMBER];
        for (int i = 0; i < NUMBER_OF_MEMBER; i++) {
            memberSelect[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        int select = 0;
        while (true) {
            count++;
            select = memberSelect[select];

            if (select == BS_NUMBER) {
                sb.append(count);
                break;
            }

            if (count > NUMBER_OF_MEMBER) {
                sb.append(-1);
                break;
            }
        }


        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


