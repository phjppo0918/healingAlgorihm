import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_SUBJECT = Integer.parseInt(st.nextToken());
        int cost[] = new int [NUMBER_OF_SUBJECT];
        int mileage = Integer.parseInt(st.nextToken());
        for(int i=0;i<NUMBER_OF_SUBJECT;i++) {
            st = new StringTokenizer(br.readLine());
            int numberOfJoinMember = Integer.parseInt(st.nextToken());
            int capacity = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            Integer member[] = new Integer [numberOfJoinMember];
            for(int j=0;j<numberOfJoinMember;j++) {
                member[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(member,Collections.reverseOrder());
            
            if(capacity > numberOfJoinMember) {
                cost[i] = 1;
            }else {
                cost[i] = member[capacity-1];               
            }
              
        }
        Arrays.sort(cost);
        int answer = 0;
        for(int i=0;i<NUMBER_OF_SUBJECT;i++) {
            if(cost[i] <= mileage) {
                answer++;
                mileage -= cost[i];
            }else {
                break;
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


