import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        final int X_LENGTH = Integer.parseInt(st.nextToken());
        final int Y_LENGTH = Integer.parseInt(st.nextToken());
        int inventory = Integer.parseInt(st.nextToken());
        int land[][] = new int[X_LENGTH][Y_LENGTH];
        int totalBlock = inventory;
        for(int i=0;i<X_LENGTH;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<Y_LENGTH;j++) {
                land[i][j] = Integer.parseInt(st.nextToken());
                totalBlock += land[i][j];
            }
        }
        int maxLandHeight = totalBlock/(X_LENGTH*Y_LENGTH);
        int timeTemp = 0;
        int minTime = 2000000000;
        int minHight = -1;
        for(int i=0;i<maxLandHeight+1;i++) {
            for(int j=0;j<X_LENGTH;j++) {
                for(int k=0;k<Y_LENGTH;k++) {
                    if(land[j][k] < i) {
                       timeTemp += (i-land[j][k]);
                    }else {
                        timeTemp += (land[j][k]-i)*2;
                    }
                }
            }
            
            if(timeTemp < minTime) {
                minTime = timeTemp;
                minHight = i;
            }
            timeTemp = 0;
             
        }
        
        //땅 깎는데 2초, 올리는데 1초
        bw.write(minTime+" "+minHight+"\n");
        

        
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
   
}