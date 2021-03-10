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
       
       // ArrayList<Integer> room = new ArrayList<Integer>();
        //boolean isProgress[] = new boolean[NUMBER_OF_CONFERENCE];
        //int firstConferFinishTime = conferenceList.get(0).finishTime;     
        //isProgress[0] = true;
        int roomCount = 0;
        long roomFinishTime;
        while(!conferenceList.isEmpty()) {
           
            roomFinishTime = conferenceList.remove(0).finishTime;
            roomCount++;
            for(int i=0;i<conferenceList.size();i++) {
                if(conferenceList.get(i).startTime >= roomFinishTime) {
                    roomFinishTime = conferenceList.remove(i).finishTime;
                    i--;
                }
            }
            
        }
        bw.write(roomCount+"\n");
        
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
        
        if( startTime>cf.startTime) {
            return 1;
        }else if(startTime==cf.startTime){
            if(finishTime > cf.finishTime) {
                return 1;
            }else if(finishTime==cf.finishTime) {
                return 0;
            }else {
                return -1;
            }
        }else {
            return -1;
        }
        
    }
    
}

