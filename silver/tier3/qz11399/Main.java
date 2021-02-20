//ATM
//그리디 알고리즘
import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String [] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        final int NUMBER_OF_MEMBER = Integer.parseInt(st.nextToken());
        int memberWaitingMinute[] = new int [NUMBER_OF_MEMBER];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_MEMBER;i++) {
            memberWaitingMinute[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(memberWaitingMinute);
        int totalMinute = 0;
        for(int i=0;i<NUMBER_OF_MEMBER;i++) {
            memberWaitingMinute[i] *= (NUMBER_OF_MEMBER-i);
            totalMinute += memberWaitingMinute[i];
        }
        bw.write(totalMinute+"\n");
  
        bw.flush();
		br.close();
		bw.close();
    }
}