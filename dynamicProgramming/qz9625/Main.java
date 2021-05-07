import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_PUSH = Integer.parseInt(br.readLine());
        int aCount = 1;
        int bCount = 0;
        for(int i=0;i<NUMBER_OF_PUSH;i++) {
            int temp = aCount;
            aCount = bCount;
            bCount += temp;

        }
        sb.append(aCount);
        sb.append(" ");
        sb.append(bCount);
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


