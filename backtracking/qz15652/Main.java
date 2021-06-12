import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= N; i++) {
            peek(i, N, M, new ArrayList<>());
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }

    public static void peek(int start, int end, int count, ArrayList<Integer> arr) {
        arr.add(start);
        count--;
        if (count == 0) {
            for (Integer i : arr) {
                sb.append(i);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = start; i <= end; i++) {
            peek(i, end, count, new ArrayList<>(arr));
        }


    }

}

