import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());

        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            
            st = new StringTokenizer(br.readLine());
            long startPoint = Long.parseLong(st.nextToken());
            long endPoint = Long.parseLong(st.nextToken());

            long range = endPoint - startPoint;
            sb.append(getCount(range));
            sb.append("\n");     
            
        }
        
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }
    public static int getCount(long range){
        int count = 1;
        
        if(range==1) {
            return count;
        }
        
        long pivot = 1;
        boolean isSpeedTwin = true;
        long speed = 1;
        while(pivot<range) {
            pivot+=speed;
            
            if(isSpeedTwin) {
                speed++;
            }
            count++;
            isSpeedTwin = !isSpeedTwin;
        }
   
        return count;
    }
    
}





