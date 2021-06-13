import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        final int NUMBER_OF_DICE = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int dice[] = new int[6];
        for (int i = 0; i < 6; i++) {
            dice[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(dice);
        long answer = 0;
        //꼭지점 3면째
        answer += dice[2] * 4;
        //모서리
        answer += dice[1] * (NUMBER_OF_DICE * 2 + NUMBER_OF_DICE - 2) * 2;
        //나머지 1면
        answer += dice[0] *
                (NUMBER_OF_DICE * NUMBER_OF_DICE
                        + (NUMBER_OF_DICE * NUMBER_OF_DICE - 2) * 2
                        + (NUMBER_OF_DICE - 2) * (NUMBER_OF_DICE - 1) * 2);

        sb.append(answer);
        sb.append("\n");


        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}

