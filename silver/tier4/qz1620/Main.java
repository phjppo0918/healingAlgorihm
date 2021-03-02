import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_POKETMON = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_REQUEST = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> keyInt = new HashMap<Integer, String>();
        HashMap<String, Integer> keyString = new HashMap<String, Integer>();
        for(int i=0;i<NUMBER_OF_POKETMON;i++) {
            String poketmon = br.readLine();
            keyInt.put(i+1,poketmon);
            keyString.put(poketmon,i+1);
        }
        String answer[] = new String[NUMBER_OF_REQUEST];
        for(int i=0;i<NUMBER_OF_REQUEST;i++) {
            String request = br.readLine();
            if(request.charAt(0)> ('A'-1)) {
                answer[i] = keyString.get(request)+"";
            }else{
                answer[i] = keyInt.get(Integer.parseInt(request)); 
            }
        }
        for(int i=0;i<NUMBER_OF_REQUEST;i++) {
            bw.write(answer[i]+"\n");
        }

        
       
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}
