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
        int lengthGop[] = new int[NUMBER_OF_SENSOR - 1];
        for (int i = 0; i < NUMBER_OF_SENSOR - 1; i++) {
            lengthGop[i] = sensor[i + 1] - sensor[i];
        }
        Arrays.sort(lengthGop);
        int centralCount = 0;
        int answer = 0;
        int lengthPivot = 0;
        if (NUMBER_OF_SENSOR > NUMBER_OF_CENTRAL) {
            while (true) {
                for (int i = 0; i < NUMBER_OF_SENSOR; i++) {

                }
            }

        } else {
        }
        sb.append(answer);

        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}



