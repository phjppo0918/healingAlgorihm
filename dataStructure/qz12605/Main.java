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
        for(int i=0;i<NUMBER_OF_CASE;i++) {
            Stack<String> stack = new Stack<String>();
            st = new StringTokenizer(br.readLine());
            while(st.countTokens() != 0) {
                stack.push(st.nextToken());
            }
            sb.append("Case #");
            sb.append(i+1);
            sb.append(": ");
            while(!stack.empty()) {
                sb.append(stack.pop());
                sb.append(" ");
            }
            sb.append("\n"); 
        }
       
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


