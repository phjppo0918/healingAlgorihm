import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_NUMBER = Integer.parseInt(br.readLine());
        char input[] = br.readLine().toCharArray();
        int alpha[] = new int [NUMBER_OF_NUMBER];
        for(int i=0;i<NUMBER_OF_NUMBER;i++) {
            alpha[i] = Integer.parseInt(br.readLine());
        }
        Stack<Double>stack = new Stack<Double>();
        for(int i=0;i<input.length;i++) {
            if(input[i] >= 'A') {
               stack.push((double)alpha[input[i] - 'A']);
            }else {
                double num1 = stack.pop();
                double num2 = stack.pop();
                switch(input[i]) {
                    case '+':
                        stack.push(num2 + num1);
                        break;
                    case '-':
                        stack.push(num2 - num1);
                        break;
                    case '*':
                        stack.push(num2 * num1);
                        break;
                    case '/':
                        stack.push(num2 / num1);
                        break;
                }
            }
        }
        
        sb.append(String.format("%.2f",stack.pop()));   
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


