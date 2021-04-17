import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_OCTO = Integer.parseInt(br.readLine());
        
        
        for(int i=1;i<=NUMBER_OF_OCTO-1;i++) {
            if(i%2==1) {
                sb.append("1 ");
            }else {
                 sb.append("2 ");
            }
        }
        
        if(NUMBER_OF_OCTO%2==0) {
            sb.append(2);
        }else {
            sb.append(3);
        }
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


