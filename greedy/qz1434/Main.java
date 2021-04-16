import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        final int NUMBER_OF_BOX = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_BOOK = Integer.parseInt(st.nextToken());
        
        int box[] = new int [NUMBER_OF_BOX];
        int book[] = new int [NUMBER_OF_BOOK];
        
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<NUMBER_OF_BOX;i++) {
            box[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_BOOK;i++) {
            book[i] = Integer.parseInt(st.nextToken());
        }

        int boxPivot = 0;
        int answer = 0;
        for(int i=0;i<NUMBER_OF_BOOK;i++) {
    
            if(book[i] > box[boxPivot]) {
                boxPivot++;
                i--;
                continue;
            }
            
            box[boxPivot] -= book[i];
        }
        for(int i : box) {
            answer += i;
        }
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


