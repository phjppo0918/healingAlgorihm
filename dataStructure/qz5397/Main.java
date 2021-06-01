import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        
        for(int testTime=0;testTime<NUMBER_OF_TESTCASE;testTime++) {
            char input[] = br.readLine().toCharArray();
            int pivot = 0;
            
            Deque<Character> dq = new ArrayDeque<>();
            dq.addFirst('!');
            for(int i=0;i<input.length;i++) {
                switch(input[i]) {
                    case '<':
                        if(dq.peekLast() != '!') {
                            char temp = dq.pollLast();
                            dq.addFirst(temp);
                        }
                        break;
                    case '>':
                        if(dq.peekFirst() != '!') {
                            char temp = dq.pollFirst();
                            dq.addLast(temp);
                        }
                        break;
                    case '-':
                        if(dq.peekLast() != '!') {
                            dq.pollLast();
                        }
                        break;
                    default :
                        dq.addLast(input[i]);
                        break;
                }
            }
            
              //커서 정렬
            while(dq.peekFirst() != '!') {
                char temp = dq.pollFirst();
                dq.addLast(temp);
            }
            dq.pollFirst();
            while(dq.size() != 0) {
                sb.append(dq.pollFirst());
            }

            sb.append("\n"); 
        }
        
      
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


