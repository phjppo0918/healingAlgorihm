import java.util.*;
import java.io.*;

public class Main{

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_LAN_CABLE = Integer.parseInt(st.nextToken()); //1 <= k <=10,000
        NUMBER_OF_LAN_CABLE_REQUIRED = Integer.parseInt(st.nextToken()); //<=1,000,000
    }
}
//순환 큐 이용하면?
class Queue {
    
    private int length;
    private int requestDocument;
    private Element [] elements;
    private int elementPivot = 0;
    private int[] importanceCount = new int [9];
    
    public Queue(int length, int requestDocument) {
        this.length = length;
        this.requestDocument = requestDocument;
        element = new Element[length];   
    }
    
    public push(int element[]) {
        
        
    }
    
    public cycle
    
}
class Element {
    private int index;
    private int value;
    private Element frontIndex;
    private Elementle backIndex;
    
    public Element() {
        
    }
    public Element(int index, int value) {
        this.index = index;
        this.value = value;
    }
}