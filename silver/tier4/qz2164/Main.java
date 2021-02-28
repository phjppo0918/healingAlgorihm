import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> card = new LinkedList<Integer>();
        for(int i=0;i<N;i++) {
            card.add(i+1);
        }
        int temp = 0;
        while(card.size() != 1) {
            card.remove();
            temp = card.peek();
            card.remove();
            card.add(temp);
        }
        
        bw.write(card.peek()+"\n");
        

    
        
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}