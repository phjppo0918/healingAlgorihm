import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        final int NUMBER_OF_CASE = Integer.parseInt(br.readLine());
        
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(int i=0;i<NUMBER_OF_CASE;i++) {
            String key = br.readLine();
            if(map.containsKey(key)) {
                int count = map.get(key);
                count++;
                map.remove(key);
                map.put(key, count);
                //System.out.println(key +"값 추가: "+ count);
            }else {
                map.put(key, 1);
               // System.out.println(key +"생성");
            }
        }
       
        List<String> keyList = new ArrayList<String>(map.keySet());
        String best = keyList.get(0);
        for(String k : keyList) {
            if(map.get(best) < map.get(k)) {
                best = k;
            }else if(map.get(best) == map.get(k)) {
                int compare = best.compareTo(k);
                if(compare > 0) {
                    best = k;
                }
            }
        }
        
        sb.append(best);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


