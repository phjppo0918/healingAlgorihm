import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            
            int testCase = Integer.parseInt(br.readLine());
            int count = 0;
            if(testCase == 1) {
                sb.append("1\n");
                continue;
            }
            
            while(testCase != 1) {
                int k; 
                for(k=9;k>1;k--) {
                    if(testCase%k == 0) {
                        count++;
                        testCase/=k;
                        break;
                    }
                }
                
                if(k==1) {
                    count = -1;
                    break;
                }
            }
            
            sb.append(count);
            sb.append("\n");
            
            
        }
       
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


