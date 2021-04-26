import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_BOOK = Integer.parseInt(br.readLine());

        int book[] = new int [NUMBER_OF_BOOK];
        
        for(int i=0;i<NUMBER_OF_BOOK;i++) {
            book[i] = Integer.parseInt(br.readLine());
        }
        int maxBook = NUMBER_OF_BOOK;
        int answer = NUMBER_OF_BOOK;
        for(int i=NUMBER_OF_BOOK-1;i>=0;i--) {
            if(book[i]== maxBook) {
                answer--;
                maxBook--;
            }
        }      
      
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


