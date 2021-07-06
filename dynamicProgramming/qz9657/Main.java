import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st;// = new StringTokenizer(br.readLine());
        //true = 상근, false = 창영
        boolean game[] = new boolean[1001];
        game[1] = true;
        game[3] = true;
        game[4] = true;
        for(int i=5;i<1001;i++) {
            if(game[i-1] && game[i-3] && game[i-4]) {
                continue;
            }

            game[i] = true;

        }
        final int NUMBER_OF_STONE = Integer.parseInt(br.readLine());
        if(game[NUMBER_OF_STONE]) {
            sb.append("SK");
        }else {
            sb.append("CY");
        }
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


