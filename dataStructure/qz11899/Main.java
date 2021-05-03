import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        char[] input = br.readLine().toCharArray();
        //Stack<Character> stack = new Stack<Character>();
        int openCount = 0;
        int answer = 0;
        for(int i=0;i<input.length;i++) {
            if(input[i] == '(') {
                openCount++;
            }else {
                if(openCount == 0) {
                    answer++;
                }else {
                    openCount--;
                } 
            }
           
        }
        sb.append(answer + openCount);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


