import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_TREE = Integer.parseInt(br.readLine());
        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 =  new StringTokenizer(br.readLine());
        int tree[] = new int[NUMBER_OF_TREE];
        int grow[] = new int[NUMBER_OF_TREE];
        for(int i=0;i<NUMBER_OF_TREE;i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            grow[i] = Integer.parseInt(st2.nextToken());
        }
        for(int i=0;i<NUMBER_OF_TREE;i++) {
            int best = -1;
            for(int j=0;j<NUMBER_OF_TREE;j++) {
                if(tree[j] > best) {
                    best = j;
                    continue;
                }
                tree[j] += grow[j];
            }
            answer += tree[best];
            tree[best] = grow[best];
        }
       
        
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


