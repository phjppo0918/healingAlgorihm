//10845
import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<Integer>();
        final int NUMBER_OF_ORDER = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String order;
       
        int back = -1;
        int tempNum;
        int answer[] = new int[NUMBER_OF_ORDER];
        for(int i=0;i<NUMBER_OF_ORDER;i++) {
            order = br.readLine();
           if(order.equals("front")) {
               if(queue.peek() == null){
                   answer[i] = -1;
               }else {
                   answer[i] = queue.peek();
               }
           }else if(order.equals("size")) {
               answer[i] = queue.size();
           }else if(order.equals("empty")) {
                if(queue.peek() == null){
                   answer[i] = 1;
                }else {
                   answer[i] = 0;  
                }
           }else if(order.equals("pop")) {
                if(queue.peek() == null){
                   answer[i] = -1;
                }else {
                   answer[i] = queue.poll();
               }
           }else if(order.equals("back")){
              if(queue.peek() == null){
                 answer[i] = -1; 
              }else {
                  answer[i] = back;
              }
           }else {
               st = new StringTokenizer(order);
               st.nextToken();
               tempNum =Integer.parseInt(st.nextToken());
               queue.add(tempNum); 
               answer[i] = -2;
               
               back = tempNum;
           }
        }
       for(int i=0;i<NUMBER_OF_ORDER;i++) {
           if(answer[i]!=-2) {
               bw.write(answer[i]+"\n");
           }
       }
        
       
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}