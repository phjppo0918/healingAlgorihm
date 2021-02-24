//직사각형에서 탈출
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        final int NUMBER_OF_INPUT =  Integer.parseInt(br.readLine());
        int requestNumber [] = new int[NUMBER_OF_INPUT];
        for(int i=0;i<NUMBER_OF_INPUT;i++){
            requestNumber[i] = Integer.parseInt(br.readLine());
        }
		br.close();
        
       
        int answerPivot = -1;
        Stack stack = new Stack(NUMBER_OF_INPUT);
        
        //처음 시작
        stack.push(requestNumber[0]);
        stack.pop();
      
        answerPivot += requestNumber[0];
        
        for(int i=1;i<NUMBER_OF_INPUT-1;i++) {
            if(requestNumber[i]==stack.nextPop()) {
                stack.pop();
            }else{
                stack.push(requestNumber[i]);
            }
        }
        if(stack.getPushPivot()==-1) {
            bw.write("NO\n");
        }else{
            for(int i=0;i<NUMBER_OF_INPUT-1;i++){
                bw.write(stack.answer[i]+"\n");
            }
            bw.write("-\n");
        }
        
       
        bw.flush();
		bw.close(); 
    }
    
}
class Stack {
    private int ascend[];
    private int push[];
    public char answer[]; //아...캡슐화 위반....애바
    private int ascendPivot;
    private int pushPivot = -1;
    private int answerPivot = -1;
    
    public Stack(int stackLength) {        
        ascend = new int [stackLength];
        push = new int [stackLength];
        answer = new char[stackLength*2];
        
        for(int i=stackLength;i>0;i--) {
            this.ascend[i-1] = stackLength;
        }
        
        this.ascendPivot = stackLength;
    }
    
    public int push(){
        push[++pushPivot] = ascend[--ascendPivot];
        answer[++answerPivot] = '+';
        return pushPivot;
    }
    
    public int push(int reqNum) {
        do{
            push();
            answer[++answerPivot] = '+';
        }while(push[pushPivot]!=reqNum|| pushPivot== -1);
        
        return pushPivot;
    }
    
    public int getPushPivot() {
        return pushPivot;
    }
    
    public int nextPop() {
        return push[pushPivot];
    }
    
    public int pop(){
        answer[++answerPivot] = '-';
        return push[pushPivot--];
    }
    
    
    
}