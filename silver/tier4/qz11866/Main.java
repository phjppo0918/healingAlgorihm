import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> group = new ArrayList<Integer>();
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int pivot = 0;
        int numberOfMember = Integer.parseInt(st.nextToken());
        
        final int CYCLE = Integer.parseInt(st.nextToken());
        
        for(int i=0;i<numberOfMember;i++) {
            group.add(i+1);
        }
        
        while(group.size()!=0) {
            for(int i=0;i<CYCLE-1;i++) {
                if(pivot==numberOfMember) {
                    pivot = 0;
                }
                pivot++;
                
            }
            if(pivot==numberOfMember) {
                    pivot = 0;
            }
            answer.add(group.remove(pivot));
            numberOfMember--;

        }
        bw.write("<");
        for(int i=0;i<answer.size()-1;i++) {
            bw.write(answer.get(i)+", ");
        }
        bw.write(answer.get(answer.size()-1)+">\n");
         

        
       
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}
