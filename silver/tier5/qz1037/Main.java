//약수
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        final int NUMBER_OF_MEASURE = Integer.parseInt(st.nextToken()); //<=50
        st = new StringTokenizer(br.readLine());
        int measure[] = new int [NUMBER_OF_MEASURE];
        for(int i=0;i<NUMBER_OF_MEASURE;i++){
            measure[i] = Integer.parseInt(st.nextToken());  //<=1,000,000
        }
        Arrays.sort(measure);
        BigInteger answer = new BigInteger((measure[0] * measure[NUMBER_OF_MEASURE-1])+"");
        
        bw.write(answer+"\n");
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}