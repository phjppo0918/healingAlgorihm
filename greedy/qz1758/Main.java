import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_MEMBER = Integer.parseInt(br.readLine());
        int tip[] = new int [NUMBER_OF_MEMBER];
        for(int i=0;i<NUMBER_OF_MEMBER;i++) {
            tip[i] = Integer.parseInt(br.readLine());
        } 
        
        Arrays.sort(tip);
        
        long answer = 0;
        int rank = 0;
        for(int i=NUMBER_OF_MEMBER-1;i>-1;i--) {
            if(tip[i] - rank > 0) {
                answer += (tip[i] - rank);
                rank++;
            }else {
                break;
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


