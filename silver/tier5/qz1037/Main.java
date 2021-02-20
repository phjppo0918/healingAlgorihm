//약수
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        final int NUMBER_OF_MEASURE = Integer.parseInt(st.nextToken()); //<=50
        StringTokenizer st = new StringTokenizer(br.readLine());
        int measure[] = new int [NUMBER_OF_MEASURE];
        for(int i=0;i<NUMBER_OF_MEASURE;i++){
            measure[i] = Integer.parseInt(br.readLine());  //<=1,000,000
        }
        
    }
    
}