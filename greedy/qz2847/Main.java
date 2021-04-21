import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_LEVEL = Integer.parseInt(br.readLine());
        int level[] = new int [NUMBER_OF_LEVEL];
        for(int i=0;i<NUMBER_OF_LEVEL;i++) {
            level[i] = Integer.parseInt(br.readLine());
        }
        int answer = 0;
        if(NUMBER_OF_LEVEL != 1) {
        
            for(int i = NUMBER_OF_LEVEL-1;i>0;i--) {
                if(level[i-1] >= level[i]) {
                    int temp = level[i] -1;
                    answer += (level[i-1] - temp);
                    level[i-1] = temp;
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


