import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> dq = new ArrayDeque<Integer>();
        final int NUMBER_OF_MEMBER = Integer.parseInt(st.nextToken());
        final int OUT_COUNT = Integer.parseInt(st.nextToken());
        final int REVERSE_TURN = Integer.parseInt(st.nextToken());
        for(int i=1;i<=NUMBER_OF_MEMBER;i++) {
            dq.offerLast(i);
        }
        int outCount = 0;
        int reverseCount = 0;
        boolean isTurnRight = false;
        while(true) {
            outCount++;
            if(outCount==OUT_COUNT) {
                if(isTurnRight) {
                    sb.append(dq.pollLast()); 
                }else {
                    sb.append(dq.pollFirst()); 
                }
                
                sb.append("\n"); 
                outCount = 0;
                if(dq.isEmpty()) {
                    break;
                }
                
                reverseCount++;
                if(reverseCount == REVERSE_TURN) {
                    isTurnRight =  !isTurnRight;
                    reverseCount = 0;
                }
            }else {
                if(isTurnRight) {
                    int temp = dq.pollLast();
                    dq.offerFirst(temp);
                }else {
                    int temp = dq.pollFirst();
                    dq.offerLast(temp);
                }
            }
          
        }
         
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


