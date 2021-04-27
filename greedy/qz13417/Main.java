import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            Deque<Character> cardDeque = new ArrayDeque<Character>();
            int numberOfCard = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            Character front = st.nextToken().charAt(0);
            cardDeque.add(front);
            //Character back = front; 
            for(int j=1;j<numberOfCard;j++) {
                Character card = st.nextToken().charAt(0);
                if(card <= front) {
                    front = card;
                    cardDeque.addFirst(card);
                }else {
                    cardDeque.addLast(card);
                }
            }
            
            for(int j=0;j<numberOfCard;j++) {
                sb.append(cardDeque.pollFirst());
            }
            sb.append("\n");
        }
        
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


