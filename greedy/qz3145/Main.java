import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int startPoint = Integer.parseInt(st.nextToken());
        int endPoint = Integer.parseInt(st.nextToken());
        
        final int NUMBER_OF_CASE = Integer.parseInt(br.readLine());
        
        int click[] = new int [NUMBER_OF_CASE+1];
        click[0] = startPoint - endPoint;
        if(click[0] < 0) {
            click[0] *= -1;
        }
        int min = click[0];
        for(int i=1;i<=NUMBER_OF_CASE;i++) {
            int temp = Integer.parseInt(br.readLine());
            click[i] = temp - endPoint;
            if(click[i] < 0) {
                click[i]--;
                click[i] *= -1;
            }else {
                click[i]++;
            }
            if(click[i] < min) {
                min = click[i];
            }
        }
        sb.append(min);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


