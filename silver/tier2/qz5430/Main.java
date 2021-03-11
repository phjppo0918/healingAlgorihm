import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st;
            //= new StringTokenizer(br.readLine());
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        String answer[] = new String [NUMBER_OF_TESTCASE];
        
        String order;
        int numberOfElement = 0;
        String elementTemp;
        String elementTempArray[];
        ACArray aca;
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            aca = new ACArray();
            order = br.readLine();
            numberOfElement = Integer.parseInt(br.readLine());
            elementTemp = br.readLine();
            elementTemp = elementTemp.substring(1,elementTemp.length()-1);
            elementTempArray = elementTemp.split(",");
            for(int j=0;j<numberOfElement;j++) {
                aca.input( Integer.parseInt( elementTempArray[j] ) );
            }
            for(int j=0;j<order.length();j++) {
                if(order.charAt(j)=='R') {
                    aca.reverse();
                }else {
                    aca.delete();
                }
            }

           bw.write(aca.print() + "\n");         
        }
        
        bw.flush();
        br.close();
        bw.close();
    } 
   
    
}
class ACArray {
    Deque<Integer> dq = new ArrayDeque<Integer>();
    boolean isFIFO = true;
    boolean isError = false;
    
    public void input(int num) {
        dq.addLast(num);
    }
    
    public void reverse() {
        isFIFO = !isFIFO;
    }
    
    public void delete() {
        if(dq.isEmpty()) {
            isError = true;
            return;
        }
        
        if(isFIFO) {
            dq.removeFirst();
        }else {
            dq.removeLast();
        }    
    }
    
    public String print() {
        String message = new String();
        if(isError) {
            message = "error";
        }else {
            message = "[";
            if(isFIFO) {
                while(!dq.isEmpty()) {
                    message = message + dq.pollFirst() +",";
                }
            }else {
                 while(!dq.isEmpty()) {
                    message = message + dq.pollLast() +",";
                }
            }
            message = message.substring(0,message.length()-1);
            message = message + "]";
        }
        
        return message;
    }
    
}
