import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_CRAIN = Integer.parseInt(br.readLine());
        st =  new StringTokenizer(br.readLine());
        ArrayList <Crain> crain = new ArrayList<Crain>();
        crain.add(new Crain(0));
        for(int i=0;i<NUMBER_OF_CRAIN;i++) {
            crain.add(new Crain(Integer.parseInt(st.nextToken()) ) );
        }
        crain.sort(Comparator.naturalOrder());
        int maxCrainWeight = crain.get(NUMBER_OF_CRAIN).weight;
        int railBox[] = new int [NUMBER_OF_CRAIN + 1];
        for(int i=1;i<=NUMBER_OF_CRAIN;i++) {
            crain.get(i).rail = i;
        }
        int numberOfBox = Integer.parseInt(br.readLine());
        boolean canOperation = true;
        
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<numberOfBox;i++) {
            int box = Integer.parseInt(st.nextToken());
            if(maxCrainWeight < box) {
                canOperation = false;
                break;
            }
            for(int j=1;j<=NUMBER_OF_CRAIN;j++) {
                if(box <= crain.get(j).weight) {
                    railBox[j]++;
                    break;
                }
            }
        }
        if(canOperation) {
            int day = 0;
            while(numberOfBox > 0) {
                day++;
                for(int i=NUMBER_OF_CRAIN;i>0;i--) {
                    
                    if(crain.get(i).rail == 0) {
                        continue;
                    }
                    
                    if(railBox[crain.get(i).rail]==0) {
                        int j;
                        for(j=crain.get(i).rail;j>0;j--) {
                            if(railBox[j] != 0) {
                                crain.get(i).rail = j;
                                break;
                            }
                        }
                        if(j==0) {
                            crain.get(i).rail = j;
                            continue;
                        }
                    }
 
                    numberOfBox--;
                    railBox[crain.get(i).rail]--;
                } 
            }
            sb.append(day);
            
        }else {
            sb.append(-1);
        }
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        
        
        //students.sort(Comparator.reverseOrder());

        bw.flush();
        br.close();
        bw.close();
        
    }

    
}
class Crain implements Comparable<Crain>{
    int weight;
    int rail;
    
    @Override
    public int compareTo(Crain crain) {
        // TODO Auto-generated method stub
        if(this.weight == crain.weight) return 0;
        else if(this.weight >  crain.weight) return 1;
        else return -1;
    } 

    
    public Crain(){}
    
    public Crain(int weight) {
        this.weight = weight;
    }
    
}


