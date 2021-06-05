import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //  StringTokenizer st = new StringTokenizer(br.readLine());

        while (true) {
            long n = Long.parseLong(br.readLine());
            boolean numArr[] = new boolean[10];
            boolean isFin = true;
            int grade = 1;
            long gradeNum = n;
            while (true) {
                char temp[] = String.valueOf(gradeNum).toCharArray();
                for (int i = 0; i < temp.length; i++) {
                    if (!numArr[temp[i] - '0']) {
                        numArr[temp[i] - '0'] = true;
                    }
                }

                for (int i = 0; i < 10; i++) {
                    if (!numArr[i]) {
                        isFin = false;
                        break;
                    }
                    isFin = true;
                }

                if (isFin) {
                    sb.append(grade);
                    sb.append("\n");
                    break;
                }
                grade++;
                gradeNum = n * grade;
            }

            if (!br.ready()) {
                break;
            }
        }


        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }

}



