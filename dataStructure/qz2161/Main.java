import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_CARD = Integer.parseInt(br.readLine());
        Queue <Integer>card = new LinkedList<>();
        for(int i=1;i<=NUMBER_OF_CARD;i++) {
            card.add(i);
        }
        while(!card.isEmpty()) {
            sb.append(card.poll() );
            if(card.isEmpty()) {
                sb.append("\n");  
                break;
            }else {
                 sb.append(" ");  
                int c = card.poll();
                card.add(c);
            }

        }
        
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


