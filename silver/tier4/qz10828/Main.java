//10816
import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<Integer>();
        final int NUMBER_OF_ORDER = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String order;
        int tempNum;
        int answer[] = new int[NUMBER_OF_ORDER];
        for(int i=0;i<NUMBER_OF_ORDER;i++) {
            order = br.readLine();
           if(order.equals("top")) {
               if(stack.empty()){
                   answer[i] = -1;
               }else {
                   answer[i] = stack.peek();
               }
           }else if(order.equals("size")) {
               answer[i] = stack.size();
           }else if(order.equals("empty")) {
                if(stack.empty()){
                   answer[i] = 1;
                }else {
                   answer[i] = 0;  
                }
           }else if(order.equals("pop")) {
                if(stack.empty()){
                   answer[i] = -1;
                }else {
                   answer[i] = stack.pop();
               }
           }else {
               st = new StringTokenizer(order);
               st.nextToken();
               tempNum =Integer.parseInt(st.nextToken());
               stack.push(tempNum); 
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