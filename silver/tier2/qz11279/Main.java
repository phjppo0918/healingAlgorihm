import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st;
            //= new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        final int NUMBER_OF_CASE = Integer.parseInt(br.readLine());
        int temp;
        for(int i=0;i<NUMBER_OF_CASE;i++) {
            temp = Integer.parseInt(br.readLine());
            if(temp != 0){
                pq.add(temp);
            }else {
                if(pq.isEmpty()) {
                    sb.append("0\n");
                }else {
                    sb.append(pq.poll()+"\n");
                }
            }
           
        }
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    } 
   
}
