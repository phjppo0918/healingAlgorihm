import java.util.*;
import java.io.*;

public class Main{

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        final int NUMBER_OF_TEST_CASE = Integer.parseInt(br.readLine());
        Queue testCase[] = new Queue[NUMBER_OF_TEST_CASE];
        Element element;
        int temp[];
        StringTokenizer st;//st.nextToken()
        for(int i=0;i<NUMBER_OF_TEST_CASE;i++) {
            st = new StringTokenizer(br.readLine());
            int length = Integer.parseInt(st.nextToken());
            int requestDocument = Integer.parseInt(st.nextToken());
            
            testCase[i] = new Queue(length, requestDocument);
            
            temp = new int [length];
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<length;j++) {
                temp[j] = Integer.parseInt(st.nextToken());
            }
            
            testCase[i].push(temp);
        }
        for(int i=0;i<NUMBER_OF_TEST_CASE;i++) {
            bw.write(testCase[i].getAnswer()+"\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
        
    }
}
//순환 큐 이용하면?
class Queue {
    
    private int length;
    private int requestDocument;
    private Element [] elements;
    private Element elementPivot;
    private int[] importanceCount = new int [9];
    private int answer = 0;
    public Queue(int length, int requestDocument) {
        this.length = length;
        this.requestDocument = requestDocument;
        elements = new Element[length];   
    }
    
    public void push(int elementNumber[]) {
        //처음 입력값
        elements[0] = new Element(0,elementNumber[0]);
        importanceCount[elementNumber[0]-1]++;
        
        for(int i=1; i<length ;i++) {
            elements[i] = new Element(i,elementNumber[i]);
            elements[i].setFrontIndex(elements[i-1]);
            
            elements[i-1].setBackIndex(elements[i]);
            
            importanceCount[elementNumber[i]-1]++;
        }
        
        //마지막 입력값
       
        elements[length-1].setBackIndex(elements[0]);
        elements[0].setFrontIndex(elements[length-1]);
        
        elementPivot = elements[0];
    }
    public int getAnswer() {
        for(int i=9; i>0; i--) {
            
            while(importanceCount[i-1]!=0) {
                if(elementPivot.getValue() != i) {
                    elementPivot = elementPivot.getBackIndex();
                }
                answer++;
                if(elementPivot.getIndex() == requestDocument) {
                    return answer;
                }
                
                elementPivot.getFrontIndex().setBackIndex(elementPivot.getBackIndex());
                elementPivot.getBackIndex().setFrontIndex(elementPivot.getFrontIndex());
                elementPivot = elementPivot.getBackIndex();
                importanceCount[i-1]--;
            }
            
        }
        
        return 0;
    }
   
}
class Element {
    private int index;
    private int value;
    private Element frontIndex;
    private Element backIndex;    
    public Element() {
        
    }
    public Element(int index, int value) {
        this.index = index;
        this.value = value;
    }
    
    public void setFrontIndex(Element element) {
        this.frontIndex = element;
    }
    
    public void setBackIndex(Element element) {
        this.backIndex = element;
    }
    
    public Element getFrontIndex() {
        return frontIndex;
    }
    
    public Element getBackIndex() {
        return backIndex;
    }
    
    public int getIndex() {
        return index;
    }
    public int getValue() {
        return value;
    }
}