//10773

import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        final int N = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<Integer>();
        int temp = 0;
        for(int i=0;i<N;i++) {
            temp = Integer.parseInt(br.readLine());
            if(temp==0) {
                st.pop();
            }else {
                st.push(temp);
            }
        }
        int answer = 0;
        for(int i : st) {
            answer += i;
        }
        bw.write(answer+"\n");
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}