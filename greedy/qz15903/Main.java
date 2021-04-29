import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int NUMBER_OF_CARD = Integer.parseInt(st.nextToken());
        int NUMBER_OF_ACTING = Integer.parseInt(st.nextToken());
        
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_CARD;i++) {
            priorityQueue.add(Long.parseLong(st.nextToken()));
        }
        
        for(int i=0;i<NUMBER_OF_ACTING;i++) {
            long card1 = priorityQueue.poll();
            long card2 = priorityQueue.poll();
            priorityQueue.add(card1 + card2);
            priorityQueue.add(card1 + card2);
        }
        long answer = 0;
        for(long i : priorityQueue) {
            answer += i;
        }
        
        sb.append(answer); 
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


