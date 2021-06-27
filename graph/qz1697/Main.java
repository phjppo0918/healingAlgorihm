import java.util.*;
import java.io.*;

//import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int SB_LOCATION = Integer.parseInt(st.nextToken());
        final int SISTER_LOCATION = Integer.parseInt(st.nextToken());
        if (SB_LOCATION >= SISTER_LOCATION) {
            sb.append(SB_LOCATION - SISTER_LOCATION);
        } else {
            Queue<Integer> queue = new LinkedList<>();
            int locationSecond[] = new int[100001];
            locationSecond[SB_LOCATION] = 1;
            boolean isAnswer = false;
            queue.add(SB_LOCATION);
            while (!queue.isEmpty()) {
                int temp = queue.poll();
                int tempArr[] = new int[]{temp - 1, temp + 1, temp * 2};

                for (int k : tempArr) {
                    if (k == SISTER_LOCATION) {
                        sb.append(locationSecond[temp]);
                        isAnswer = true;
                        break;
                    }

                    if (0 <= k && k < 100001 && locationSecond[k] == 0) {
                        queue.add(k);
                        locationSecond[k] = locationSecond[temp] + 1;
                    }
                }

                if (isAnswer) {
                    break;
                }
            }
        }

        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }

}


