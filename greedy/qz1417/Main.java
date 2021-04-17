import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_CANDI = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
        int other[] = new int [NUMBER_OF_CANDI-1];
        for(int i=0;i<NUMBER_OF_CANDI-1;i++) {
            other[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(other);
        int answer = 0;
        for(int i=NUMBER_OF_CANDI-2; i>-1;i--) {
            if(dasom <= other[i]) {

                int gap = other[i] - dasom; 
                dasom += (gap/2 + 1);
                other[i] -= (gap/2 +1);
                answer += (gap/2 + 1);             
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


