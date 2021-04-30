import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_MEMBER = Integer.parseInt(st.nextToken());
        final int DELETE_COUNT = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=NUMBER_OF_MEMBER;i++) {
            queue.add(i);
        }
        sb.append("<");
        int count = 0;
        while(queue.size() != 1) {
            count++;
            int num = queue.poll();
            if(count == DELETE_COUNT) {
                sb.append(num);
                sb.append(", ");
                count = 0;
            }else {
                queue.add(num);
            }
        }
        sb.append(queue.poll());
        sb.append(">\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


