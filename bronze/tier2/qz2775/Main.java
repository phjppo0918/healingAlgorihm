import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        int answer[] = new int [NUMBER_OF_TESTCASE];
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            answer[i] = getCount(k,n);
        }
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            bw.write(answer[i]+ "\n");
        }
       
        
        br.close();
        bw.flush();
        bw.close();
        
    }
    public static int getCount(int stair, int ho) {
        if(stair==0) {
            return ho;
        }
        int temp = 0;
        for(int i=1;i<ho+1;i++) {
            temp += getCount(stair-1,i); 
        }
        return temp;       
    }
}