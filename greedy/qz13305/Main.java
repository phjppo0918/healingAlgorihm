import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        
				final int NUMBER_OF_CITY = Integer.parseInt(br.readLine());

				st =  new StringTokenizer(br.readLine());
				int load[] = new int [NUMBER_OF_CITY-1];
				for(int i=0;i<NUMBER_OF_CITY-1;i++) {
					load[i] =	Integer.parseInt(st.nextToken());
				}

				st =  new StringTokenizer(br.readLine());
				int cost[] = new int [NUMBER_OF_CITY];
					for(int i=0;i<NUMBER_OF_CITY;i++) {
					cost[i] =	Integer.parseInt(st.nextToken());
				}
				int pivot = 0;
				//int thisCost = cost[0];
				while(pivot != NUMBER_OF_CITY-1) {
					int dest = -1;
					for(int i=pivot+1;i<NUMBER_OF_CITY;i++) {
						if(cost[i] < cost[pivot]) {
							dest = i;
							break;
						}
					}

					if(dest != -1) {

					}else {
						
					}

				}


			


        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


