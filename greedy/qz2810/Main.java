import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_SEAT = Integer.parseInt(br.readLine());
        String seat = br.readLine();
        int numberOfS = 0;
        int numberOfL = 0;
        for(int i=0;i<NUMBER_OF_SEAT;i++) {
            if(seat.charAt(i) == 'S') {
                numberOfS++;
            }else {
                numberOfL++;
            }
        }
        int answer = 0;
        if(numberOfL == 0) {
            answer = numberOfS;
        }else {
            answer = (NUMBER_OF_SEAT + 1) - (numberOfL/2);
        }
        
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


