import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int MESSAGE_LENGTH = Integer.parseInt(st.nextToken());
        final int MAX_NUM_VALUE = Integer.parseInt(st.nextToken());
        
        Map<Integer, Num> map = new LinkedHashMap<Integer, Num>();
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<MESSAGE_LENGTH;i++) {
            Integer input = Integer.parseInt(st.nextToken());
            if(map.containsKey(input)) {
                map.get(input).addFreqency();
            }else {
                map.put(input, new Num(input, i));
            }
        }
        ArrayList<Num> numList = new ArrayList<Num>(map.values());
        Collections.sort(numList);
        sb.append("\n"); 
        for(int i=0;i<numList.size();i++) {
            for(int j=0;j<numList.get(i).getFrequency();j++) {
                sb.append(numList.get(i).getValue());
                sb.append(" ");
            }
        }
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}
class Num implements Comparable<Num> {
    private int value;
    private int seq;
    private int frequency = 1; 
    public Num(int value, int seq) {
        this.value = value;
        this.seq = seq;
    }
    public void addFreqency() {
        frequency++;
    }
    public int getValue() {
        return this.value;
    }
    public int getSeq() {
        return this.seq;
    }
    public int getFrequency() {
        return this.frequency;
    }
    
    
    @Override
    public int compareTo(Num num) { //아예 역순으로
        if(this.frequency > num.getFrequency()) {
            return -1;
        }else if (this.frequency == num.getFrequency()) {
            if(this.seq < num.getSeq()) {
                return -1;
            }else {
                return 1;
            }
        }else {
            return 1;
        }
    }
}

