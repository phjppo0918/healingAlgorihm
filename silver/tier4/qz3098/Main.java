import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUNBER_OF_NODE = Integer.parseInt(st.nextToken());
        final int NUNBER_OF_EDGE = Integer.parseInt(st.nextToken());
        final int MAX_CONNECTION = NUMBER_OF_NODE * NUMBER_OF_NODE - NUMBER_OF_NODE;
        int connection = 0;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<NUNBER_OF_NODE;i++) {
            graph.add(i, new ArrayList<Integer>());
        }
        
        for(int i=0;i<NUNBER_OF_EDGE;i++) {
            st =  new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            graph.get(num1).add(num2);
            graph.get(num2).add(num1);
            connection += 2;
        }
        
        for(int i=1;i<=NUNBER_OF_NODE;i++) {
            
        }
        
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}

