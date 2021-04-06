import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int before = Integer.parseInt(st.nextToken());
        int squared = Integer.parseInt(st.nextToken());
        int answer = 1;
        int startCyclePoint = 0;
        ArrayList<Integer> graph = new ArrayList<Integer>();
        graph.add(before);
        while(true){
            String tempStr = before + "";
            int tempInt = 0;
            
            for(int i=0;i<tempStr.length();i++) {
                int tempSquared = 1;
                int tempOnce = tempStr.charAt(i) - '0';
                
                for(int j=0;j<squared;j++) {
                    tempSquared *= tempOnce;
                }
                tempInt += tempSquared;
            }
            
            if(graph.contains(tempInt)) {
                startCyclePoint = graph.indexOf(tempInt);
                break;
            }else {
                graph.add(tempInt);
                before = tempInt;
            }
        }
        sb.append(startCyclePoint);    
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


