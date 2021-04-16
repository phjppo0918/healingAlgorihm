import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        while(true) {
            st = new StringTokenizer(br.readLine());
            int k1 = Integer.parseInt(st.nextToken());
            int k2 = Integer.parseInt(st.nextToken());
            int k3 = Integer.parseInt(st.nextToken());
            int count = 0;
            if(k1+1 == k2&& k2+1 == k3) {
                sb.append(count);
                sb.append("\n");
                continue;
            }
            
            if(k2-k1 < k3-k2) {
                count = k3 - k2 - 1;
            }else {
                count = k2 - k1 - 1;
            }
             sb.append(count);
             sb.append("\n");

            if(!br.ready()) {
                break;
            }
        }
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


