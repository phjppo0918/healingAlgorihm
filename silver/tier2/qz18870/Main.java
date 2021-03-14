import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
//import java.math.BigInteger;
public class Main{
    public static ArrayList<ArrayList<Integer>> graph;
    public static boolean isGone[];
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        //= new StringTokenizer(br.readLine());
        
        final int NUMBER_OF_LOCATION = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        int location[] = new int[NUMBER_OF_LOCATION];
        for(int i=0;i<NUMBER_OF_LOCATION;i++) {
            location[i] = Integer.parseInt(st.nextToken());
        }
        int rank[] = new int [NUMBER_OF_LOCATION];
        for(int i=0;i<NUMBER_OF_LOCATION-1;i++) {
            for(int j=i+1;j<NUMBER_OF_LOCATION;j++) {
                if(location[i]>location[j]) {
                    rank[i]++;
                }else if(location[i]<location[j]) {
                    rank[j]++;
                }
            }
        }
        for(int i=0;i<NUMBER_OF_LOCATION;i++) {
            bw.write(rank[i]+" ");
        }
        bw.write("\n");
        
        
        bw.flush();
        br.close();
        bw.close();
        
    } 

}
class Location {
    int value;
    int rank;
  
}
