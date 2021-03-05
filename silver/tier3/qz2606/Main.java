import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
  static int NUMBER_OF_NODE;
  static int NUMBER_OF_EDGE;
  static boolean graph[][];
  static boolean isBirus[];
  static int birusCount = 0;
  public static void main(String [] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st;
    //= new StringTokenizer(br.readLine());
    //다중 리스트
    NUMBER_OF_NODE = Integer.parseInt(br.readLine());
    NUMBER_OF_EDGE = Integer.parseInt(br.readLine());
    graph = new boolean[NUMBER_OF_NODE][NUMBER_OF_NODE];
    isBirus = new boolean[NUMBER_OF_NODE];
    for(int i=0;i<NUMBER_OF_EDGE;i++) {
      st = new StringTokenizer(br.readLine());
      int num1 = Integer.parseInt(st.nextToken());
      int num2 = Integer.parseInt(st.nextToken());
      graph[num1-1][num2-1] = true;
      graph[num2-1][num1-1] = true;
    }

    infection(0);
    bw.write(birusCount-1+"\n");
    
    bw.flush();
    br.close();
    bw.close();
      

  }

  public static void infection(int node) {

    if(isBirus[node]) {
      return;
    }

    isBirus[node] = true;
    birusCount++;

    for(int i=0;i<NUMBER_OF_NODE;i++) {

      if(graph[node][i]) {
        
        graph[node][i] = false;
        graph[i][node] = false;
        infection(i);

      }

    }

  }

}