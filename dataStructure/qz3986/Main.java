import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_CASE = Integer.parseInt(br.readLine());
        Stack<Character> stack;
        int answer = 0;
        for(int i=0;i<NUMBER_OF_CASE;i++) {
            stack = new Stack<Character>();
            char input[] = br.readLine().toCharArray();
            for(int j=0;j<input.length;j++) {
                if(stack.isEmpty()) {
                    stack.push(input[j]);
                    continue;
                }
                if(input[j] == stack.peek()) {
                    
                    stack.pop();
                }else {
                    stack.push(input[j]);
                }
            }
            
            if(stack.isEmpty()) {
                answer++;
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


