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
            int numberOfMember = Integer.parseInt(br.readLine());
            int member[] = new int [numberOfMember];
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<numberOfMember;j++) {
                member[j] = Integer.parseInt(st.nextToken);
            }
            
            int pivot = 0;
            int answer = 0;
            for(int j=0;j<numberOfMember-1;j++) {
                if(member[j] > member[j+1]) {
                    int temp = member[j];
                    //버블 정렬 구현할거야~ 전환될떄마다 answer ++해주고~
                    answer++;
                }
            }
        }
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


