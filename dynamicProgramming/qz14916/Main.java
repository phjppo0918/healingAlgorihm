import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());

        int money = Integer.parseInt(br.readLine());
        int coinCount = 0;
        while (money % 5 != 0) {
            money -= 2;
            coinCount++;

            if (money < 0) {
                coinCount = -1;
                break;
            }
        }
        if (coinCount > -1) {
            coinCount += money / 5;
        }
        sb.append(coinCount);
        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}




