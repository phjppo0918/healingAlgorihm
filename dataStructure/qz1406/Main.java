import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st; // = new StringTokenizer(br.readLine());
        char [] inputTemp = br.readLine().toCharArray();
        final int NUMBER_OF_ORDER = Integer.parseInt(br.readLine());
        int cersor = 0;
        Stack <Character> left = new Stack<Character>();
        Stack <Character> right = new Stack<Character>();
        for(int i=0;i<inputTemp.length;i++) {
            left.push(inputTemp[i]);
        }
        
        
        for(int i=0;i<NUMBER_OF_ORDER;i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken().charAt(0)) {
                case 'P':
                    left.push(st.nextToken().charAt(0));
                    break;
                case 'L':
                    if(!left.isEmpty()) {
                        char temp = left.pop();
                        right.push(temp);
                    }
                    break;
                case 'D':
                     if(!right.isEmpty()) {
                        char temp = right.pop();
                        left.push(temp);
                    }
                    break;
                case 'B':
                    if(!left.isEmpty()) {
                        left.pop();  
                    }
                    break;
            }
        }
        while(!left.isEmpty()) {
            right.push(left.pop());
        }
        while(!right.isEmpty()) {
            sb.append(right.pop());
        }
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


