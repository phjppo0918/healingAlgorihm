import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_CASE = Integer.parseInt(br.readLine());
        int plate[] = new int [50001];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_CASE;i++) {
            plate[Integer.parseInt(st.nextToken())]++;
        }
        int answer = 1;
        for(int i=1;i<50001;i++) {
            if(plate[i] > answer) {
                answer += plate[i] -answer;
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


