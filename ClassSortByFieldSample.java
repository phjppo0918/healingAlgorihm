import java.util.*;
import java.io.*;

public class Main{

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Sample> sampleList = new ArrayList<Sample>();
        Collections.sort(numList);

        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}
class Sample implements Comparable<Sample> {
    private int value;
    private int seq;
    private int frequency = 1;
    public Sample(int value, int seq) {
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
    public int compareTo(Sample sample) { // -1 0 1 순
        if(this.frequency > num.getFrequency()) {
            return 1;
        }else if (this.frequency == num.getFrequency()) {
            if(this.seq < num.getSeq()) {
                return 1;
            }else {
                return -1;
            }
        }else {
            return -1;
        }
    }
}

