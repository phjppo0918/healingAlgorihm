import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static long tree[];
    public static int NUMBER_OF_TREE;
    public static long REQUEST_LENGTH;
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       
        StringTokenizer st = new StringTokenizer(br.readLine());
        NUMBER_OF_TREE = Integer.parseInt(st.nextToken());
        REQUEST_LENGTH = Long.parseLong(st.nextToken());
        
        tree = new long[NUMBER_OF_TREE];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_TREE;i++) {
            tree[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(tree);
        long  max = tree[NUMBER_OF_TREE-1];
        long  min = 0l;
        long  avg = 0l;
        long  cutLength = 0l;
        while(min<=max) {
            avg = (min+max)/2;
            cutLength = cut(avg);
            
            if(cutLength >= REQUEST_LENGTH) {
                min = avg+1;
                
            }else {
                max =avg-1;
            }
            
        }
        bw.write(max+"\n");
        
       
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    public static long  cut(long  high) {
        long  total = 0l;
        long  temp = 0l;
        for(int i=0;i<NUMBER_OF_TREE;i++) {
            temp = tree[i] - high;
            
            if(temp>0) {
                total += temp;
            }
            
            temp = 0l;
        }
        
        return total;
    }
    
}