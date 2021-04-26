import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_POINT = Integer.parseInt(st.nextToken());
        final int TAPE_LENGTH =  Integer.parseInt(st.nextToken());
        boolean spot[] = new boolean [2050];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_POINT;i++) {
            int point = Integer.parseInt(st.nextToken());
            spot[point] = true;
        }
        int answer = 0;
        for(int i=0;i<2050;i++) {
            if(spot[i]) {
                answer++;
                for(int j=i;j<i+TAPE_LENGTH;j++) {
                    spot[j] = false;
                }
            }
        }
       
        
       
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


