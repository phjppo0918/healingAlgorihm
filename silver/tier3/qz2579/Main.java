import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static int numberOfStair;
    public static int stairScore[];
    public static Integer accumulateScore[];

    public static void main(String [] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       // StringTokenizer st = new StringTokenizer(br.readLine());
      numberOfStair = Integer.parseInt(br.readLine());
        
      stairScore = new int [numberOfStair+1];
      accumulateScore = new Integer [numberOfStair+1];

      for(int i=1;i<numberOfStair+1;i++) {
        stairScore[i] = Integer.parseInt(br.readLine());
      }
      accumulateScore[0] = stairScore[0];
      accumulateScore[1] = stairScore[1];
      if(numberOfStair>1) {

        accumulateScore[2] = stairScore[1] + stairScore[2];
      }
      int answer = getScore(numberOfStair);
      bw.write(answer+"\n");


      bw.flush();
      br.close();
      bw.close();
  
    }
    //top - down 방식
    public static int getScore(int pivot) {

        if(accumulateScore[pivot]==null) {
          accumulateScore[pivot] = 
            Math.max(getScore(pivot-2),
             stairScore[pivot-1]+getScore(pivot-3)) + stairScore[pivot];
        }
        return  accumulateScore[pivot];
    
    }
 
}