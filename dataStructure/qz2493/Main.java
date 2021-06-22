import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        final int NUMBER_OF_TOP = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb.append("0 ");
        Stack<Top> stack = new Stack<>();
        stack.add(new Top(1, Integer.parseInt(st.nextToken())));
        for(int i=1;i<NUMBER_OF_TOP;i++) {
            int sizeTemp = Integer.parseInt(st.nextToken());
            
            while(!stack.isEmpty() && stack.peek().size < sizeTemp) {
                stack.pop();
            }
            
            if(!stack.isEmpty()) {
                sb.append(stack.peek().no);
            }else {
                sb.append(0);
            }
            sb.append(" ");
            
            stack.add(new Top(i+1, sizeTemp));
        }
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}

class Top {
    int no;
    int size;
    public Top(){}
    public Top(int no, int size){
        this.no = no;
        this.size = size;
    }
}


