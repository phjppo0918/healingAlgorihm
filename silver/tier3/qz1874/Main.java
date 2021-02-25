//직사각형에서 탈출
import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        final int NUMBER_OF_INPUT =  Integer.parseInt(br.readLine());
        int requestNumber [] = new int[NUMBER_OF_INPUT];
        char answer [] = new char[NUMBER_OF_INPUT*2];
        int answerPivot = -1;
        Stack outputAscending = new Stack(NUMBER_OF_INPUT);
        
        for(int i=0;i<NUMBER_OF_INPUT;i++){
            requestNumber[i] = Integer.parseInt(br.readLine());
            outputAscending.push(NUMBER_OF_INPUT-i);
        }
		br.close();
        
        Stack buffer = new Stack(NUMBER_OF_INPUT);
        
        //시작값 설정;
        int temp = outputAscending.pop();
        buffer.push(temp);
        //System.out.println("push:"+temp);
        answer[++answerPivot] = '+';
        
        for(int i=0;i<NUMBER_OF_INPUT;i++) {
            
            if(buffer.getPivot()==-1) {
                temp = outputAscending.pop();
                if(temp==-2) {
                    break;
                }
                buffer.push(temp);
               // System.out.println("push:"+temp);
                answer[++answerPivot] = '+';
            }
            
            if(requestNumber[i] == buffer.nextPop()) {
                buffer.pop();
               // System.out.println("pop");
                answer[++answerPivot] = '-';
            }else {
                while(requestNumber[i] != buffer.nextPop()) {
                   
                    temp = outputAscending.pop();
                    if(temp==-2) {
                        break;
                    }
                    buffer.push(temp);
                   // System.out.println("push:"+temp);
                    answer[++answerPivot] = '+';
                }
                buffer.pop();
               // System.out.println("pop");
                answer[++answerPivot] = '-';
                
                if(temp==-2) {
                   break;
                } 
            }
     
        }
        
        if(answer[NUMBER_OF_INPUT*2-1]!='-') {
            bw.write("NO\n");
        }else{
            for(int i=0;i<NUMBER_OF_INPUT*2;i++) {
                bw.write(answer[i]+"\n");
            } 
        }
        
        bw.flush();
        bw.close();
    }   
    
}

class Stack {
    private int element[];
    private int pivot = -1;
    public Stack(int stackLength) {
        element = new int [stackLength];
    }
    
    public void push(int input) {
        pivot++;
        element[pivot] = input;
    }
    
    public int nextPop() {
        if(pivot==-1||pivot==element.length){
           
            return -2;
        }
        int output = element[pivot];
        return output;
    }
    
    public int pop() {
        if(pivot==-1||pivot==element.length){
            
            return -2;
        }
        int output = element[pivot];
        pivot--;
        return output;
    }
    
    public int getPivot() {
        return pivot;
    }
    
}
