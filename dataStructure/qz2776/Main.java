import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        int numberOfNote1Case, numberOfNote2Case;
        ArrayList<Integer> note1;
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            numberOfNote1Case = Integer.parseInt(br.readLine());
            char temp[] = br.readLine().toCharArray();
            note1 = new ArrayList<Integer>();
            for(int j=0;j<numberOfNote1Case;j++) {
                note1.add(temp[j] - '0');
            }
            Collections.sort(note1);
            numberOfNote2Case = Integer.parseInt(br.readLine());
            temp = br.readLine().toCharArray();
            int note2[] = new int [numberOfNote2Case];
            for(int j=0;j<numberOfNote2Case;j++) {
                note2[j] = temp[j] - '0';
            }
            boolean isTurn = false;
            int pivot = 0;
            for(int j=0;j<numberOfNote2Case;j++) {
                if(note2[j] > note1.get(pivot)) {
                    while(note2[j] > note1.get(pivot) && pivot != numberOfNote1Case) {
                        pivot++;
                    }
                    if(note2[j] == note1.get(pivot)) {
                        sb.append("1\n");
                    }else {
                        sb.append("0\n");
                        if(pivot == numberOfNote1Case) {
                            pivot--;
                        }
                    }
                }else if(note2[j] < note1.get(pivot)) {
                    while(note2[j] < note1.get(pivot) && pivot != -1) {
                        pivot--;
                    }
                    if(note2[j] == note1.get(pivot)) {
                        sb.append("1\n");
                    }else {
                        sb.append("0\n");
                        if(pivot == -1) {
                            pivot++;
                        }
                    }                  
                }else {
                    sb.append("1\n");
                }
                
            }           
        }
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


