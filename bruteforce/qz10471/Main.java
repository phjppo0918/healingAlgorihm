import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int ROOM_LENGTH = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_PARTITION = Integer.parseInt(st.nextToken());
        int partition[] = new int[NUMBER_OF_PARTITION + 2];
        partition[0] = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= NUMBER_OF_PARTITION; i++) {
            partition[i] = Integer.parseInt(st.nextToken());
        }
        partition[NUMBER_OF_PARTITION + 1] = ROOM_LENGTH;
        boolean lengthArr[] = new boolean[ROOM_LENGTH + 1];
        for (int i = 0; i < NUMBER_OF_PARTITION + 1; i++) {
            for (int j = i + 1; j < NUMBER_OF_PARTITION + 2; j++) {
                lengthArr[partition[j] - partition[i]] = true;
            }
        }
        for (int i = 0; i < ROOM_LENGTH + 1; i++) {
            if (lengthArr[i]) {
                sb.append(i);
                sb.append(" ");
            }
        }
        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}



