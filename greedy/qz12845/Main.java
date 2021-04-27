import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        final int NUMBER_OF_CARD = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int topCard = 0;
        int total = 0;
        for(int i=0;i<NUMBER_OF_CARD;i++) {
            int card = Integer.parseInt(st.nextToken());
            if(topCard < card ) {
                topCard = card;
            }
            total += card;
            
        }
        total -= topCard;
        sb.append(total + topCard*(NUMBER_OF_CARD-1) );
        
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


