import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //  StringTokenizer st = new StringTokenizer(br.readLine());
        final long VOLUME = Integer.parseInt(br.readLine());
        long width = 0, height = 0, length = 0;
        long minArea = Long.MAX_VALUE;
        for (long i = 1; i <= VOLUME; i++) {
            if (VOLUME % i > 0) {
                continue;
            }
            for (long j = 1; j <= VOLUME; j++) {
                if (VOLUME % (j * i) > 0) {
                    continue;
                }
                if (i * j > VOLUME) {
                    break;
                }

                long k = VOLUME / (i * j);
                if (getArea(i, j, k) < minArea) {
                    minArea = getArea(i, j, k);
                    width = k;
                    height = i;
                    length = j;

                }
            }
        }
        sb.append(width);
        sb.append(" ");
        sb.append(height);
        sb.append(" ");
        sb.append(length);

        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }

    public static long getArea(long x, long y, long z) {
        return 2 * (x * y + y * z + z * x);
    }

}



