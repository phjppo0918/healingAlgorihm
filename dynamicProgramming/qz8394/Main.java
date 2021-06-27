import java.util.*;
import java.io.*;

//import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_MEMBER = Integer.parseInt(br.readLine());
        int num1 = 2;
        int num2 = 3;

        if(NUMBER_OF_MEMBER ==1) {
            sb.append(0);
        }else if(NUMBER_OF_MEMBER == 2) {
            sb.append(2);
        }else if(NUMBER_OF_MEMBER == 3) {
            sb.append(3);
        }else {
            for(int i=0;i<NUMBER_OF_MEMBER-3;i++) {
                int temp = (num1 + num2)%10;
                num1 = num2;
                num2 = temp;
            }
            sb.append(num2);
        }

        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }

}


