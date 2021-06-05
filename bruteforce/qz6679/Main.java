import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //  StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 2992; i < 10000; i++) {
            if (sumDights(10, i) == sumDights(12, i) &&
                    sumDights(10, i) == sumDights(16, i)) {
                sb.append(i);
                sb.append("\n");
            }
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }

    public static int sumDights(int jinsu, int num) {

        int total = 0;
        if (num >= jinsu * jinsu * jinsu) {
            total += num / (jinsu * jinsu * jinsu);
            num %= jinsu * jinsu * jinsu;
        }
        if (num >= jinsu * jinsu) {
            total += num / (jinsu * jinsu);
            num %= jinsu * jinsu;
        }
        if (num >= jinsu) {
            total += num / (jinsu);
            num %= jinsu;
        }
        total += num;
        return total;
    }
}



