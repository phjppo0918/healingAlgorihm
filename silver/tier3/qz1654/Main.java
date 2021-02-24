
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    public static long lanCable [];
    public static int NUMBER_OF_LAN_CABLE_REQUIRED;
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_LAN_CABLE = Integer.parseInt(st.nextToken()); //1 <= k <=10,000
        NUMBER_OF_LAN_CABLE_REQUIRED = Integer.parseInt(st.nextToken()); //<=1,000,000
        
        lanCable = new long [NUMBER_OF_LAN_CABLE]; //각 요소 <= 2,147,483,647
        long answer = 0;
        for(int i=0;i<NUMBER_OF_LAN_CABLE;i++) {
            lanCable[i] = Long.parseLong(br.readLine());
            if(lanCable[i]>answer) {
                answer = lanCable[i];
            }          
        }
        long low = 1l;
        long middle = 0;
        //이분 탐색?
        while(low<=answer) {
            
            middle = (low+answer)/2;
            
            int cutCount = 0;
            for(int i=0;i<NUMBER_OF_LAN_CABLE;i++) {
                cutCount += lanCable[i]/middle;
            }
            
            if(cutCount >= NUMBER_OF_LAN_CABLE_REQUIRED) {
                low = middle + 1;
            }else{
                answer = middle -1;
            }
            
        }   
        
        bw.write(answer+"\n");
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
} 