import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_FAN = Integer.parseInt(br.readLine());
        
        int timeLine[] = new int[100001];
        for(int i=0;i<NUMBER_OF_FAN;i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
                finish = Integer.parseInt(st.nextToken());
            for(int k=start;k<=finish;k++) {
                timeLine[k]++;
            }
        }
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


