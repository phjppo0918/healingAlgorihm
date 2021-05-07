import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
   
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        final int H_VALUE = 1;
        final int C_VALUE = 12;
        final int O_VALUE = 16;   
        final int isOpen = -1;
        int temp;
        Stack<Integer> stack = new Stack<Integer>();
        char [] input = br.readLine().toCharArray();
        for(int i=0;i<input.length;i++) {
            switch(input[i]) {
                case 'H':
                    stack.push(H_VALUE);
                    break;
                case 'C':
                    stack.push(C_VALUE);
                    break;
                case 'O':
                    stack.push(O_VALUE);
                    break;
                case '(':
                    stack.push(isOpen);
                    break;
                case ')':
                    temp = 0;
                    int popValue = stack.pop();
                    while(popValue != isOpen) {
                        temp += popValue;
                        popValue = stack.pop();
                    }
                    stack.push(temp);       
                    break;
                default :
                    temp = stack.pop();
                    temp *= (input[i]-'0');
                    stack.push(temp);
            }
        }
        
        int answer = 0;
        while(!stack.isEmpty()) {
            answer += stack.pop();
        }
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


