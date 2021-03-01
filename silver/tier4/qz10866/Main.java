//10845
import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<Integer>();
        final int NUMBER_OF_ORDER = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String order;
        int tempNum;
        int answer[] = new int[NUMBER_OF_ORDER];
        
        for(int i=0;i<NUMBER_OF_ORDER;i++) {
            order = br.readLine();
           if(order.equals("pop_front")) {
              if(deque.peekFirst() == null){
                   answer[i] = -1;
                }else {
                   answer[i] = deque.pollFirst();
               }
           }else if(order.equals("pop_back")) {
              if(deque.peekLast() == null){
                   answer[i] = -1;
                }else {
                   answer[i] = deque.pollLast();
               }
           }else if(order.equals("size")) {
               answer[i] = deque.size();
           }else if(order.equals("empty")) {
                if(deque.peek() == null){
                   answer[i] = 1;
                }else {
                   answer[i] = 0;  
                }
           }else if(order.equals("front")) {
                if(deque.peek() == null){
                   answer[i] = -1;
                }else {
                  answer[i] =deque.peekFirst();
               }
           }else if(order.equals("back")){
              if(deque.peek() == null){
                 answer[i] = -1; 
              }else {
                  answer[i] =deque.peekLast();
              }
           }else {
               st = new StringTokenizer(order);
               if( st.nextToken().equals("push_front")) {
                  tempNum =Integer.parseInt(st.nextToken());
                  deque.addFirst(tempNum);  
               }else{
                  tempNum =Integer.parseInt(st.nextToken());
                  deque.addLast(tempNum);  
               }
  
               answer[i] = -2;
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