import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        final int NUMBER_OF_BALLOON = Integer.parseInt(br.readLine());
        Deque <int[]> deque = new LinkedList<int[]>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=NUMBER_OF_BALLOON;i++) {
            deque.addLast( new int [] {i, Integer.parseInt(st.nextToken()) } );
                          
        }
        while(true) {
            int[] boom = deque.pollFirst();
            sb.append(boom[0]);
            sb.append(" ");
            
            if(deque.isEmpty()) {
                break;
            }
            
            if(boom[1] > 0) {
                for(int i=1;i<boom[1];i++) {
                    int[] temp = deque.pollFirst();
                    deque.addLast(temp);
                }
                
            }else {
                for(int i=0;i<boom[1] * -1;i++) {
                    int[] temp = deque.pollLast();
                    deque.addFirst(temp); 
                }
            }
        }
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


