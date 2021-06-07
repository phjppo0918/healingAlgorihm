import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        final char INPUT[] = br.readLine().toCharArray();
        Queue<Character> str = new LinkedList<>();
        char head = INPUT[0];
        str.add(head);
        for (int i = 1; i < INPUT.length; i++) {
            if (head >= INPUT[i]) {
                Queue<Character> temp = new LinkedList<>();
                head = INPUT[i];
                temp.add(head);
                for (Character c : str) {
                    temp.add(c);
                }
                str = temp;

            } else {
                str.add(INPUT[i]);
            }
        }
        for (Character c : str) {
            sb.append(c);
        }
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


