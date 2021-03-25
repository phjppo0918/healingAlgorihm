import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
//import java.math.BigInteger;
public class Main{
   
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        //= new StringTokenizer(br.readLine());
        
        final int NUMBER_OF_CASE = Integer.parseInt(br.readLine());
        ArrayList<Location> locList = new ArrayList<Location>();
        int answer[] = new int[NUMBER_OF_CASE];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_CASE;i++) {
            locList.add(new Location(i,Integer.parseInt(st.nextToken())));
        }
       
        Collections.sort(locList);
        
        int rank = 0;
        answer[locList.get(0).pitch] = rank;
        for(int i=1;i<locList.size();i++) {
            if(locList.get(i).value == locList.get(i-1).value) {
                answer[locList.get(i).pitch] = rank;
            }else {
                answer[locList.get(i).pitch] = ++rank;
            }
        }
        
        for(int i : answer) {
            sb.append(i+" ");
        }
        sb.append("\n");
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    } 

}
class Location implements Comparable<Location> {
    int pitch;
    int value;
    public Location(){}
    public Location(int pitch, int value) {
        this.pitch = pitch;
        this.value = value;
    }
    
    @Override
    public int compareTo(Location loc) {
        if(this.value > loc.value) {
            return 1;
        }else if (this.value == loc.value) {
            return 0;
        }else {
            return -1;
        }
    }


}


