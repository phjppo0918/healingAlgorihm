import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_SEAT_IN_A_ROOM = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_SEAT_IN_B_ROOM = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_SEAT_IN_C_ROOM = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_STUDENT = Integer.parseInt(st.nextToken());

        final int MAX_A_ROOM = NUMBER_OF_STUDENT / NUMBER_OF_SEAT_IN_A_ROOM;
        final int MAX_B_ROOM = NUMBER_OF_STUDENT / NUMBER_OF_SEAT_IN_B_ROOM;
        final int MAX_C_ROOM = NUMBER_OF_STUDENT / NUMBER_OF_SEAT_IN_C_ROOM;

        boolean isAnswer = false;
        for (int c = MAX_C_ROOM; c > -1; c--) {
            int cSeat = c * NUMBER_OF_SEAT_IN_C_ROOM;
            for (int b = MAX_B_ROOM; b > -1; b--) {
                int bSeat = b * NUMBER_OF_SEAT_IN_B_ROOM;
                if (cSeat + bSeat > NUMBER_OF_STUDENT) {
                    continue;
                }
                for (int a = MAX_A_ROOM; a > -1; a--) {
                    int aSeat = a * NUMBER_OF_SEAT_IN_A_ROOM;
                    if (cSeat + bSeat + aSeat > NUMBER_OF_STUDENT) {
                        continue;
                    } else if (cSeat + bSeat + aSeat == NUMBER_OF_STUDENT) {
                        isAnswer = true;
                        break;
                    } else {
                        break;
                    }
                }
                if (isAnswer) {
                    break;
                }
            }
            if (isAnswer) {
                break;
            }
        }

        if (isAnswer) {
            sb.append(1);
        } else {
            sb.append(0);
        }

        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}



