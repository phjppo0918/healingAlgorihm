import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        char input[] = br.readLine().toCharArray();

        int answer = 0;
        int settingPipeNum = 0;
        char lastInput = '(';
        for(int i=0;i<input.length;i++) {
            if(input[i] == '(') {
                lastInput = '(';
                settingPipeNum++;
            }else {
                settingPipeNum--;
                if(lastInput == '(') {
                    answer += settingPipeNum;
                }else {
                    answer++;
                }
                lastInput = ')';

            }
        }

        // StringTokenizer st;// = new StringTokenizer(br.readLine());
        sb.append(answer);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}
