import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_HOUSE = Integer.parseInt(br.readLine());
        int house[] = new int[NUMBER_OF_HOUSE];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < NUMBER_OF_HOUSE; i++) {
            house[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(house);
        int middle = (NUMBER_OF_HOUSE - 1) / 2;

        sb.append(house[middle]);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


