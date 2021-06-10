import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_SENSOR = Integer.parseInt(br.readLine());
        final int NUMBER_OF_CENTRAL = Integer.parseInt(br.readLine());
        int sensor[] = new int[NUMBER_OF_SENSOR];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < NUMBER_OF_SENSOR; i++) {
            sensor[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sensor);
        if (NUMBER_OF_SENSOR > NUMBER_OF_CENTRAL) {
            int lengthGop[] = new int[NUMBER_OF_SENSOR - 1];
            int totalGap = 0;
            for (int i = 0; i < NUMBER_OF_SENSOR - 1; i++) {
                lengthGop[i] = sensor[i + 1] - sensor[i];
                totalGap += lengthGop[i];
            }
            Arrays.sort(lengthGop);
            int centralCount = NUMBER_OF_CENTRAL;
            int gapArrPivot = NUMBER_OF_SENSOR - 2;
            while (centralCount != 1) {
                centralCount--;
                totalGap -= lengthGop[gapArrPivot];
                gapArrPivot--;
            }
            sb.append(totalGap);
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