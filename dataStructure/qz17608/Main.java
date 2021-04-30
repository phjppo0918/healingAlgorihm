import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        final int NUMBER_OF_STICK = Integer.parseInt(br.readLine());
        Stack <Integer> stack = new Stack<Integer>();
        
        
        for(int i=0;i<NUMBER_OF_STICK;i++) {
            int stick = Integer.parseInt(br.readLine());
            
            while(!stack.empty()) {
                if(stack.peek() <= stick ) {
                    stack.pop();
                }else {
                    break;
                }
            }
            
            stack.push(stick);
        }
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        sb.append(stack.size());
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


