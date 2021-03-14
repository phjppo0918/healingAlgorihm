import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
//import java.math.BigInteger;
public class Main{
    public static ArrayList<ArrayList<Integer>> graph;
    public static boolean isGone[];
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_NODE = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_EDGE = Integer.parseInt(st.nextToken());
        isGone = new boolean[NUMBER_OF_NODE];   
        
        graph = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<NUMBER_OF_NODE;i++) {
            graph.add(new ArrayList<Integer>());
        }
        int startNode;
        int finishNode;
        for(int i=0;i<NUMBER_OF_EDGE;i++) {
            st = new StringTokenizer(br.readLine());
            startNode = Integer.parseInt(st.nextToken())-1;
            finishNode = Integer.parseInt(st.nextToken())-1;
            graph.get(startNode).add(finishNode);
            graph.get(finishNode).add(startNode);         
        }
        
        int answer = 0;
        
        for(int i=0;i<NUMBER_OF_NODE;i++) {
            if(!isGone[i]) {
                answer++;
                searchNode(i);
            }
        }
        bw.write(answer+"\n");
        
        bw.flush();
        br.close();
        bw.close();
        
    } 
    public static void searchNode(Integer node) {
        if(isGone[node]) {
            return;
        }
        isGone[node] = true;
        for(Integer i : graph.get(node)) {
            if(!isGone[i]) {
                searchNode(i);
            }
        }
    }
}
