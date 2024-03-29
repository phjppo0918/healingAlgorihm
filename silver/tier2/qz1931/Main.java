import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
            //= new StringTokenizer(br.readLine());
        final int NUMBER_OF_CONFERENCE = Integer.parseInt(br.readLine());
        ArrayList<Conference> conferenceList = new ArrayList<Conference>();
        Conference conf;
        for(int i=0;i<NUMBER_OF_CONFERENCE;i++) {
            st = new StringTokenizer(br.readLine());
            long startTime = Long.parseLong(st.nextToken());
            long finishTime = Long.parseLong(st.nextToken());

            conf = new Conference(startTime, finishTime);
            conferenceList.add(conf);
            
        }
        Collections.sort(conferenceList);
       
      
       
        long roomFinishTime = -1l;
        int confCount = 0;
        for(int i=0;i<NUMBER_OF_CONFERENCE;i++) {
            if(conferenceList.get(i).startTime>=roomFinishTime) {
                roomFinishTime = conferenceList.get(i).finishTime;
                confCount++;
            }
        }
        
        bw.write(confCount+"\n");
        
        bw.flush();
        br.close();
        bw.close();
    } 
   

}
class Conference implements Comparable<Conference> {
    Long startTime;
    Long finishTime;
    //boolean isProgress = false;
    public Conference(){}
    public Conference(Long startTime, Long finishTime){
        this.startTime = startTime;
        this.finishTime = finishTime;
    }
    @Override
    public int compareTo(Conference cf) {
        //끝나는 시간대로 정렬을 하면?
        if( finishTime>cf.finishTime) {
            return 1;
        }else if(finishTime==cf.finishTime){
            if(startTime > cf.startTime) {
                return 1;
            }else if(startTime==cf.startTime) {
                return 0;
            }else {
                return -1;
            }
        }else {
            return -1;
        }
        
    }
    
}

