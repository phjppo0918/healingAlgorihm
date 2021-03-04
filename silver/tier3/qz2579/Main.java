import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static int numberOfStair;
    public static int stairScore[];

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       // StringTokenizer st = new StringTokenizer(br.readLine());
        numberOfStair = Integer.parseInt(br.readLine());
        
        stairScore = new int [numberOfStair];

        for(int i=0;i<numberOfStair;i++) {
            stairScore[i] = Integer.parseInt(br.readLine());
        }
        int answer = getScore(numberOfStair-1);
        bw.write(answer+"\n");
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    //top - down 방식
    public static int getScore(int pivot) {
        if(pivot<3) {
            return stairScore[pivot];
        }

        return Math.max(getScore(pivot-2), stairScore[pivot-1]+getScore(pivot-3))+  stairScore[pivot];
    
    }
 
}