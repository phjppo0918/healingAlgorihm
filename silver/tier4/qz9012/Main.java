import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        final int N = Integer.parseInt(br.readLine());
        boolean isVPS[] = new boolean[N];
        Stack<Character> st;
        String temp = "";
        for(int i=0;i<N;i++) {
            
            st = new Stack<Character>();
            temp = br.readLine();
            
            for(int j=0;j<temp.length();j++) {
                if(temp.charAt(j)=='('){
                    st.push('(');
                }else {
                    if(st.empty()) {
                        isVPS[i] = true;
                        break;
                    }else {
                        st.pop();
                    }
                }
            }
            
            if(!st.empty()) {
                isVPS[i] = true;
            }
            
        }
        for(int i=0;i<N;i++) {
           if(isVPS[i]) {
               bw.write("NO\n");
           }else{
               bw.write("YES\n");
           }
        }
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}