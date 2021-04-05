import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        int input = Integer.parseInt(br.readLine());
        int i=2;
        if(input!=1) {
            
            while(input!=1) {
                while(i<input) {
                    
                    if(input%i==0) {
                        sb.append(i);
                        sb.append("\n");
                        input /= i;
                        i = 2;
                        continue;
                    }
                    
                    i++;
                }
                if(i==input) {
                    sb.append(i);
                    break;
                }
            }
        }
        sb.append("\n");
        
  
        //sb.append(answer);  
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


