import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
 
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        //= new StringTokenizer(br.readLine());
      
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
       //int wearCount[] = new int[30];
        //int pivot = 0;
        HashMap<String, Integer> wear; 
        int answer[] = new int [NUMBER_OF_TESTCASE];
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            wear = HashMap<String, Integer>();
            int numberOfWear = Integer.parseInt(br.readLine());
            for(int j=0;j<numberOfWear;j++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String temp = st.nextToken();
                if(wear.containsKey(temp)) {
                    wear.replace(temp, wear.get(temp)+1);
                }else {
                    wear.put(temp, 1);
                }
            }
           
            
            int answerTemp = 1;
            for(int j=0;j<wear.size();j++) {
                
            }
        }
        bw.flush();
        br.close();
        bw.close();


    }
   
}
