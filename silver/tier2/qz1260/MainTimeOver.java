import java.util.*;
import java.io.*;
//import java.math.BigInteger;
class MainTimeOver{
    public static Queue<Integer> dfsAnswer;
    public static Queue<Integer> bfsAnswer;
    public static ArrayList<ArrayList<Integer>> graph;
    public static ArrayList<ArrayList<Integer>> graphForBFS;
    public static boolean visited[];
    public static int dfsHaveNodeCount = 0;
    public static int bfsHaveNodeCount = 0;

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        graph= new ArrayList<ArrayList<Integer>>();
        final int NUMBER_OF_NODE = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_EDGE = Integer.parseInt(st.nextToken());
        final int START_POINT = Integer.parseInt(st.nextToken()) -1;
        
        
        for(int i=0;i<NUMBER_OF_NODE;i++) {
            graph.add(i,new ArrayList<Integer>());
        }
        
        for(int i=0;i<NUMBER_OF_EDGE;i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken()) - 1;
            int num2 = Integer.parseInt(st.nextToken()) - 1;
            graph.get(num1).add(num2);
            graph.get(num2).add(num1);
        }
        
        for(int i=0;i<NUMBER_OF_NODE;i++) {
             Collections.sort(graph.get(i));
        }
        
        graphForBFS = graph;
        dfsAnswer = new LinkedList<Integer>();
        bfsAnswer = new LinkedList<Integer>();
        
        //int pivot = 1;
       // int tempPoint = START_POINT;
        visited = new boolean[NUMBER_OF_NODE];
        //visited[START_POINT-1] = true;
        //깊이 우선
        dfs(START_POINT);
        
        visited = new boolean[NUMBER_OF_NODE];
        //너비 우선
        bfs(START_POINT);

        for(int i=0;i<dfsHaveNodeCount;i++) {
            bw.write(dfsAnswer.poll()+1 + " ");
        }
        bw.write("\n");
        for(int i=0;i<bfsHaveNodeCount;i++) {
            bw.write(bfsAnswer.poll()+1 + " ");
        }
        bw.write("\n");
        bw.flush();
        br.close();
        bw.close();


    }
    public static void dfs(int num) {
        
        if(!visited[num]) {
            dfsAnswer.add(num);
            visited[num] = true;
            dfsHaveNodeCount++;
        }
       
        for(int i : graph.get(num)) {
            if(!visited[i]) {
                dfs(i);
            }
        }
    }
    public static void bfs(Integer num) {
        
        if(!visited[num]) {
            bfsAnswer.add(num);
            visited[num] = true;
            bfsHaveNodeCount++;
        }
       
        for(Integer i: graphForBFS.get(num)) {
            graphForBFS.get(i).remove(num);
            
            if(!visited[i]) {
                bfsAnswer.add(i);
                visited[i] = true;
                bfsHaveNodeCount++;
            }
        }
        
        for(Integer i: graphForBFS.get(num)) {
            if(!(graphForBFS.get(i).isEmpty())) {
                bfs(i);
            }
        }
        
    }
    
}

