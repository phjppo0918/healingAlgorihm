import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_CANDI = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_GENRE = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_MAIN_STAGE_MEMBER = Integer.parseInt(st.nextToken());
        double candi[] = new double [NUMBER_OF_CANDI];
        for(int i=0; i<NUMBER_OF_GENRE;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<NUMBER_OF_CANDI; j++) {
                int candi_member = Integer.parseInt(st.nextToken());
                double score = Double.parseDouble(st.nextToken());
                if(score > candi[candi_member-1]) {
                    candi[candi_member-1] = score;
                }
            }
        }
        
        Arrays.sort(candi);
        double answer = 0;
        for(int i=1;i<=NUMBER_OF_MAIN_STAGE_MEMBER;i++) {
            answer += candi[NUMBER_OF_CANDI-i];
        }
        answer *= 10;
        answer = Math.round(answer);
        answer /= 10.0;
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


