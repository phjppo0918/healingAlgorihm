import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final String INPUT = br.readLine();
				final int NUMBER_OF_LIGHT = INPUT.length();
				
				boolean light[] = new boolean [NUMBER_OF_LIGHT+1];				
				for(int i=1;i<=NUMBER_OF_LIGHT;i++) {
					if(INPUT.charAt(i-1) == 'Y') {
						light[i] = true;
					}
				}

				int answer = 0;
				for(int i=1;i<=NUMBER_OF_LIGHT;i++) {
					if(light[i]) {
						answer++;
						int k = i;
						while( k <= NUMBER_OF_LIGHT ) {
							light[k] = !light[k];
							k += i;
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


