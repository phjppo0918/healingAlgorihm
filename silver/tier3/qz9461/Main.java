import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
 
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //StringTokenizer st;
        //= new StringTokenizer(br.readLine());

        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        
        long wave[] = new long[100];
        wave[0] = 1l;
        wave[1] = 1l;
        wave[2] = 1l;
        wave[3] = 2l;
        wave[4] = 2l;
        wave[5] = 3l;
        wave[6] = 4l;
        for(int i=7;i<100;i++) {
            wave[i] = wave[i-1] +wave[i-5];
        }
        
        long answer[] = new long[NUMBER_OF_TESTCASE];
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            int input = Integer.parseInt(br.readLine());
            answer[i] = wave[input-1];
        }
        
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            bw.write(answer[i]+"\n");
        }
        
        
        
        bw.flush();
        br.close();
        bw.close();


    }
   
}
