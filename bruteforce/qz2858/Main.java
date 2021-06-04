import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int NUMBER_OF_OUT_TILE = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_IN_TILE = Integer.parseInt(st.nextToken());
        int outTileDelEdge = NUMBER_OF_OUT_TILE - 4;
        int outTileDelEdgeHalf = (NUMBER_OF_OUT_TILE - 4) / 2;
        int length = 0, width = 0;
        for (int i = 1; i < outTileDelEdgeHalf; i++) {
            int outWidth = i;
            int outLength = outTileDelEdgeHalf - i;
            if (outWidth * outLength == NUMBER_OF_IN_TILE) {
                length = outLength;
                width = outWidth;
                break;
            }
        }
        if (width > length) {
            int temp = width;
            width = length;
            length = temp;
        }
        sb.append(length + 2);
        sb.append(" ");
        sb.append(width + 2);
        sb.append("\n");


        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


