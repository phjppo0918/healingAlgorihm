import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_TEAM = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_BREAK = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_SPARE = Integer.parseInt(st.nextToken());
        
        int breakTeam[] = new int [NUMBER_OF_BREAK];
        boolean breakBoat[] = new boolean [NUMBER_OF_TEAM+1];
        boolean spareTeam[] = new boolean [NUMBER_OF_TEAM+1];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_BREAK;i++) {
            breakTeam[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_SPARE;i++) {
             spareTeam[Integer.parseInt(st.nextToken())] = true;
        }
        
        Arrays.sort(breakTeam);
        int answer = 0;
        
        for(int i=0;i<NUMBER_OF_BREAK;i++) {
            int temp = breakTeam[i];
            if(spareTeam[temp]) {
                spareTeam[temp] = false;
            }else {
                if(temp > 1 && spareTeam[temp - 1]) {
                    spareTeam[temp-1] = false;
                }else {
                    if(temp != NUMBER_OF_TEAM && spareTeam[temp+1]) {
                        spareTeam[temp+1] = false; 
                    }else {
                        answer++;
                    }
                }
                
            }              
        }
        
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


