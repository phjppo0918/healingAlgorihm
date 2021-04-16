import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        int btnA = 300;
        int btnB = 60;
        int btnC = 10;
        int time = Integer.parseInt(br.readLine());
        int count = 0;
        if(time%10 !=0 ) {
            sb.append(-1);
        }else {
            if(time >= 300) {
                count = time/300;
                time%=300;
            }
            sb.append(count);
            sb.append(" ");
            count = 0;
            
            if(time >= 60) {
                count = time/60;
                time %= 60;
            }
            
            sb.append(count);
            sb.append(" ");
            
            sb.append(time/10);
           
        }
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


