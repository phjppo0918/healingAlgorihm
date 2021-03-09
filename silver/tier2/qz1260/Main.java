import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static int NUMBER_OF_NODE;
    public static int NUMBER_OF_EDGE;
    
    public static boolean [][] graph;
    public static Queue<Integer> dfsAnswer;
    public static Queue<Integer> bfsAnswer;
    public static boolean dfsIsVisit[];
    public static boolean bfsIsVisit[];

    public static Queue<Integer> bfsTemp;
    public int pivot = 0;
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        NUMBER_OF_NODE = Integer.parseInt(st.nextToken());
        NUMBER_OF_EDGE = Integer.parseInt(st.nextToken());
        final int START_POINT = Integer.parseInt(st.nextToken());
        
        graph = new boolean[NUMBER_OF_NODE+1][NUMBER_OF_NODE+1];
        dfsAnswer = new LinkedList<Integer>();
        bfsAnswer = new LinkedList<Integer>();;
        dfsIsVisit = new boolean[NUMBER_OF_NODE+1];
        bfsIsVisit = new boolean[NUMBER_OF_NODE+1];
        bfsTemp = new LinkedList<Integer>();
        
        for(int i=0;i<NUMBER_OF_EDGE;i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            graph[num1][num2] = true;
            graph[num2][num1] = true;
        }
        
        bw.flush();
        br.close();
        bw.close();
    } 
    
    public static void dfs(int num) {
        dfsAnswer.offer(num);
        dfsIsVisit[num] = true;
        for(int i=1;i<NUMBER_OF_NODE+1;i++) {
            if(graph[num][i]&&!dfsIsVisit[i]) {
                dfs(i);
            }
        }
    }
    public static void bfs(int num) {
        bfsTemp.offer(num);
        bfsIsVisit[num] = true;
        
        while(bfsTemp.isEmpty()) {
            bfsAnswer(bfsTemp.poll());
            
            for(int i=1;i<NUMBER_OF_NODE+1;i++) {
                if(graph[num][i]&&!dfsIsVisit[i]) {
                    bfsTemp.offer(i);
                    bfsIsVisit[i] = true;
                }
            }
        }
        
    }
}

