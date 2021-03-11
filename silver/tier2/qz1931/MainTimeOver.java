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
       
      
        int roomMaxCount = 0;
        int roomCount = 0;
        long roomFinishTime;
        long MaxFirstConfFinishTime = conferenceList.get(NUMBER_OF_CONFERENCE-1).finishTime;
        boolean repeatBreak = false;
        while(true) {
            for(int i=0;i<NUMBER_OF_CONFERENCE;i++) {
                roomFinishTime = conferenceList.get(i).finishTime;
                
                if(conferenceList.get(i).startTime > MaxFirstConfFinishTime) {
                    repeatBreak = true;
                    break;
                }
                
                roomCount++;
                
                for(int j=i+1;j<NUMBER_OF_CONFERENCE;j++) {
                    if(roomFinishTime <= conferenceList.get(j).startTime) {
                        roomFinishTime = conferenceList.get(j).finishTime;
                        roomCount++;
                    }
                }
                
                if(roomMaxCount <= roomCount) {
                    roomMaxCount = roomCount;
                    MaxFirstConfFinishTime =  conferenceList.get(i).finishTime;
                }
                roomCount = 0;
            }
            
            if(repeatBreak) {
                break;
            }
        }
        
        bw.write(roomMaxCount+"\n");
        
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

