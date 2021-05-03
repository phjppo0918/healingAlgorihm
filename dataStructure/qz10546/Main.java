import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_MEMBER = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(int i=0;i<NUMBER_OF_MEMBER;i++) {
            String member = br.readLine();
            if(hm.containsKey(member)) {
                int mum = hm.get(member) + 1;
                hm.remove(member);
                hm.put(member, mum);
            }else {
                hm.put(member, 1);
            }
        }
        
        for(int i=0;i<NUMBER_OF_MEMBER-1;i++) {
            String member = br.readLine();
            if(hm.get(member) > 1) {
                int mum = hm.get(member) - 1;
                hm.remove(member);
                hm.put(member, mum);
            }else {
                hm.remove(member);
            }
        }
        List <String> answer = new ArrayList<String>(hm.keySet());
        sb.append(answer.get(0));
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


