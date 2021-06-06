import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        final int NUMBER_OF_DRINK = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int drink[] = new int[NUMBER_OF_DRINK];
        for (int i = 0; i < NUMBER_OF_DRINK; i++) {
            drink[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(drink);
        double total = drink[NUMBER_OF_DRINK - 1];
        for (int i = 0; i < NUMBER_OF_DRINK - 1; i++) {
            total += drink[i] / (double) 2;
        }
        DecimalFormat df = new DecimalFormat("########.#######");

        String answer = df.format(total);

        sb.append(answer);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


