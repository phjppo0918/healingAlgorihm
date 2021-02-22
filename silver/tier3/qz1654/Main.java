
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
        long longestCable = 0;
        for(int i=0;i<NUMBER_OF_LAN_CABLE;i++) {
            lanCable[i] = Integer.parseInt(br.readLine());
            if(lanCable[i]>longestCable) {
                longestCable = lanCable[i];
            }          
        }
        
        //이분 탐색?
        long answer = searchLongestLanCable(1,longestCable);
        
        //제일 큰 수를 등분
        
        bw.write(answer+"\n");
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
    public static long searchLongestLanCable(long low, long high) {
        long temp = (high+low)/2;
        int numberOfCutCable = cutCable(temp);
        if(low == temp||temp == high) {
            return temp;
        }
        
        if(numberOfCutCable >= NUMBER_OF_LAN_CABLE_REQUIRED) {
            System.out.println(temp);
            return searchLongestLanCable(temp,high);
        }else {
            System.out.println(temp);
            return searchLongestLanCable(low,temp-1);
        }
    }
    
    public static int cutCable(long cutLength){
        int cutCableCount = 0;
        for(int i=0;i<lanCable.length;i++) {
            cutCableCount += (lanCable[i]/cutLength);
        }
        
        return cutCableCount;
    }
}