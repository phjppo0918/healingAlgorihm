import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static boolean farm[][];
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<ArrayList<Integer>> graph= new ArrayList<ArrayList<Integer>>();
        final int NUMBER_OF_NODE = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_EDGE = Integer.parseInt(st.nextToken());
        final int START_POINT = Integer.parseInt(st.nextToken());
        
        for(int i=0;i<NUMBER_OF_NODE;i++) {
            graph.add(i+1,new ArrayList<Integer>());
        }
        
        for(int i=0;i<NUMBER_OF_EDGE;i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            graph.get(num1).add(num2);
            graph.get(num2).add(num1);
        }
        
        for(int i=0;i<NUMBER_OF_NODE;i++) {
             Collections.sort(graph.get(i+1));
        }
        
        ArrayList<ArrayList<Integer>> graphForBFS = graph;
        int dfs[] = new int[NUMBER_OF_NODE]; //깊이우선 
        int bfs[] = new int[NUMBER_OF_NODE]; //너비우선
        dfs[0] = START_POINT;
        bfs[0] = START_POINT;
        int pivot = 1;
        int tempPoint = START_POINT;
        //깊이 우선
        while(pivot<NUMBER_OF_NODE+1) {
            graph.get(tempPoint);
        }

        bw.flush();
        br.close();
        bw.close();


    }

}

