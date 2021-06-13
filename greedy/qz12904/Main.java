import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int[] num;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; //= new StringTokenizer(br.readLine());

        final char START[] = br.readLine().toCharArray();
        final char TARGET_TEMP[] = br.readLine().toCharArray();
        Deque<Character> target = new ArrayDeque<>();
        for (char c : TARGET_TEMP) {
            target.addLast(c);
        }
        boolean isLast = true;
        while (START.length != target.size()) {
            if (isLast) {
                if (target.peekLast() == 'A') {
                    target.pollLast();
                } else {
                    target.pollLast();
                    isLast = false;
                }
            } else {
                if (target.peekFirst() == 'A') {
                    target.pollFirst();
                } else {
                    target.pollFirst();
                    isLast = true;
                }
            }
        }
        boolean isCan = true;
        if (isLast) {
            for (int i = 0; i < START.length; i++) {
                if (START[i] != target.pollFirst()) {
                    isCan = false;
                    break;
                }
            }

        } else {
            for (int i = 0; i < START.length; i++) {
                if (START[i] != target.pollLast()) {
                    isCan = false;
                    break;
                }
            }
        }
        if (isCan) {
            sb.append(1);
        } else {
            sb.append(0);
        }
        sb.append("\n");


        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}

