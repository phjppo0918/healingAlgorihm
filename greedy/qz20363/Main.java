import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int needSun = Integer.parseInt(st.nextToken());
        final int neddWater = Integer.parseInt(st.nextToken());
        int answer1 =  needSun + neddWater + neddWater/10;
        int answer2 =  needSun + neddWater + needSun/10;
        if(answer1 < answer2) {
            sb.append(answer1);
        }else {
            sb.append(answer2);
        }
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


