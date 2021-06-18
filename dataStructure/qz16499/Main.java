import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_WORD = Integer.parseInt(br.readLine());
        String words[] = new String[NUMBER_OF_WORD];
        int pivot = 0;
        for (int testCase = 0; testCase < NUMBER_OF_WORD; testCase++) {
            char wordTemp[] = br.readLine().toCharArray();
            Arrays.sort(wordTemp);
            String word = new String(wordTemp);
            words[pivot++] = word;
        }
        Arrays.sort(words);
        int groupCount = 1;

        for (int i = 1; i < NUMBER_OF_WORD; i++) {
            if (!words[i].equals(words[i - 1])) {
                groupCount++;
            }
        }

        sb.append(groupCount);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}




