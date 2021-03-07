import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static int dynamitCase[] = new int[10];
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        //= new StringTokenizer(br.readLine());
        
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        int answer[] = new int [NUMBER_OF_TESTCASE];
        
        dynamitCase[0] = 1;
        dynamitCase[1] = 2;
        dynamitCase[2] = 4;
        for(int i=3;i<10;i++) {
            dynamitCase[i] = dynamitCase[i-1] + dynamitCase[i-2] + dynamitCase[i-3];
        }
        
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            int num = Integer.parseInt(br.readLine());
            answer[i] = dynamitCase[num-1];
        }
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            bw.write(answer[i]+"\n");
        }


        bw.flush();
        br.close();
        bw.close();


    }
   
    

}