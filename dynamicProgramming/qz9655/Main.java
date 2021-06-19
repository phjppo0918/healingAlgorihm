import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_STONE = Integer.parseInt(br.readLine());
        if (NUMBER_OF_STONE % 2 == 0) {
            sb.append("CY");
        } else {
            sb.append("SK");
        }
        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}




