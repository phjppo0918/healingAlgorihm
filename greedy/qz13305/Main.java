import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        
        final int NUMBER_OF_CITY = Integer.parseInt(br.readLine());
       
        int road[] = new int [NUMBER_OF_CITY-1];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_CITY-1;i++) {
            road[i] = Integer.parseInt(st.nextToken());
        }
        
        int cost[] = new int [NUMBER_OF_CITY];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_CITY;i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }
        
        int pivot = 0;
        long answer = 0;
        while(pivot != NUMBER_OF_CITY-1) {
            int dest = NUMBER_OF_CITY - 1;
            for(int i=pivot+1; i<NUMBER_OF_CITY;i++) {
                if(cost[pivot] > cost[i]) {
                    dest = i;
                    break;
                }
            }
            int roadLength = 0;
            for(int i=pivot;i<dest;i++) {
                roadLength += road[i];
            }
            answer += (long)roadLength * cost[pivot];
            pivot = dest;
        }
        
        
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


