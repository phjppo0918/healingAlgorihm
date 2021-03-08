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
        ArrayList<String> key;
        int answer[] = new int [NUMBER_OF_TESTCASE];
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            wear = new HashMap<String, Integer>();
            key = new ArrayList<String>();
            int numberOfWear = Integer.parseInt(br.readLine());
            for(int j=0;j<numberOfWear;j++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String temp = st.nextToken();
                if(wear.containsKey(temp)) {
                    wear.replace(temp, wear.get(temp)+1);
                }else {
                    wear.put(temp, 1);
                    key.add(temp);
                }
            }
           
            
            int answerTemp = 1;
            for(String k : key) {
               answerTemp *= (wear.get(k)+1);
            }
            answer[i] = answerTemp -1;
        }
        
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            bw.write(answer[i]+"\n");
        }
        bw.flush();
        br.close();
        bw.close();


    }
   
}
