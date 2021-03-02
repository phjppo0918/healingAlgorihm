import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_DED = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_BO = Integer.parseInt(st.nextToken());
        HashSet<String> ded =  new HashSet<String>();
        ArrayList<String> answer = new ArrayList<String>();
        
        for(int i=0;i<NUMBER_OF_DED;i++) {
            ded.add(br.readLine());
        }
        int count = 0;
        for(int i=0;i<NUMBER_OF_BO;i++) {
            String temp = br.readLine();
            if(ded.contains(temp)){
                count++;
                answer.add(temp);
            }
        }
        
        Collections.sort(answer);
        bw.write(count+"\n");
        for(String k : answer) {
            bw.write(k+"\n");
        }

        
       
        bw.flush();
		br.close();
		bw.close();
  
    }
    
}
