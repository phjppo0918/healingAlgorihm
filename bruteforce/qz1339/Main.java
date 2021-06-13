import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st; //= new StringTokenizer(br.readLine());

        final int NUMBER_OF_VOCA = Integer.parseInt(br.readLine());
        int alphabet[] = new int[26];
        for (int i = 0; i < NUMBER_OF_VOCA; i++) {
            char alphabetTemp[] = br.readLine().toCharArray();
            int digit = 1;
            for (int j = alphabetTemp.length - 1; j > -1; j--) {
                alphabet[alphabetTemp[j] - 'A'] += digit;
                digit *= 10;
            }
        }
        Arrays.sort(alphabet);
        int pivot = 25;
        int total = 0;
        for (int i = 9; i > -1; i--) {
            total += (alphabet[pivot] * i);
            pivot--;
        }

        sb.append(total);
        sb.append("\n");


        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}

