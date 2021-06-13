import java.util.*;
import java.io.*;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());

        for (int testCase = 0; testCase < NUMBER_OF_TESTCASE; testCase++) {
            int stickerLength = Integer.parseInt(br.readLine()) + 1;
            int[][] sticker = new int[2][stickerLength];
            StringTokenizer stTop = new StringTokenizer(br.readLine());
            StringTokenizer stBottom = new StringTokenizer(br.readLine());
            for (int i = 1; i < stickerLength; i++) {
                sticker[0][i] = Integer.parseInt(stTop.nextToken());
                sticker[1][i] = Integer.parseInt(stBottom.nextToken());
            }
            int stickerDp[][] = new int[2][stickerLength];
            stickerDp[0][1] = sticker[0][1];
            stickerDp[1][1] = sticker[1][1];
            for (int i = 2; i < stickerLength; i++) {
                stickerDp[0][i] = Math.max(stickerDp[1][i - 1], stickerDp[1][i - 2]) + sticker[0][i];
                stickerDp[1][i] = Math.max(stickerDp[0][i - 1], stickerDp[0][i - 2]) + sticker[1][i];
            }
            sb.append(Math.max(stickerDp[0][stickerLength - 1], stickerDp[1][stickerLength - 1]));
            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }
}

