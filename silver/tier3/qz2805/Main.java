import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static int tree[];
    public static int NUMBER_OF_TREE;
    public static int REQUEST_LENGTH
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       
        StringTokenizer st = new StringTokenizer(br.readLine());
        NUMBER_OF_TREE = Integer.parseInt(st.nextToken());
        REQUEST_LENGTH = Integer.parseInt(st.nextToken());
        
        tree[] = new int[NUMBER_OF_TREE];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_TREE;i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }
        //지금고민중인게...굳이 sort가필요할까
        //max = 2,000,000,000
        int max = 2000000000;
        int min = 0;
        int avg = 0;
        int cutLength = 0;
        while(min>=max) {
            avg = (min+max)/2;
            cutLength = cut(avg);
            if(cutLength > REQUEST_LENGTH) {
                min = avg;
                
            }else {
                max =avg;
            }
            
        }
        
       
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    public static int cut(int high) {
        int total = 0;
        int temp = 0;
        for(int i=0;i<NUMBER_OF_TREE;i++) {
            temp = tree[i] - high;
            
            if(temp>0) {
                total += temp;
            }
            
            temp = 0;
        }
        
        return total;
    }
    
}