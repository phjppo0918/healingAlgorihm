import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfNumber = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_POP = Integer.parseInt(st.nextToken());
        
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=1;i<=numberOfNumber;i++) {
            queue.add(i);
        }
        int answer = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_POP;i++) {
            int moving = 0;
            int want = Integer.parseInt(st.nextToken());
            while(queue.peek() != want) {
                int temp = queue.poll();
                queue.add(temp);
                moving++;
            }
            if(moving > numberOfNumber/2) {
                moving = numberOfNumber - moving;
            }
            answer += moving;
            numberOfNumber--;
            queue.poll();
        }
        
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


