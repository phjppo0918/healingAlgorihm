import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_NODE = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_EDGE = Integer.parseInt(st.nextToken());
        int graph[][] = new int [NUMBER_OF_NODE+1][NUMBER_OF_NODE+1];
        final int MAX_CONNECTION = NUMBER_OF_NODE * NUMBER_OF_NODE - NUMBER_OF_NODE;
        int connection = 0;
        for(int i=0;i<NUMBER_OF_EDGE;i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            graph[num1][num2] = 1;
            graph[num2][num1] = 1;
            connection += 2;
        }
        
        // 그래프 탐색
        int day = 0;
        ArrayList<Integer> dayCount = new ArrayList<Integer>();
        int count = 0;
        while(connection != MAX_CONNECTION) {
            day++;
            for(int i=1;i<NUMBER_OF_NODE;i++) {
                
                for(int j=i+1;j<=NUMBER_OF_NODE;j++) {
                    
                    if(graph[i][j] == day) {
                        
                        for(int k=1;k<=NUMBER_OF_NODE;k++) {
                            
                            if(k != i && k != j && graph[j][k] > 0 && graph[j][k] <= day && graph[i][k] == 0) {
                                graph[i][k] = day + 1;
                                graph[k][i] = day + 1;
                                count++;
                                connection += 2;
                            }
                            
                        }
                        
                    }
                    
                }
                
            }
            
            dayCount.add(count);
            count = 0;          
            
        }
        
        sb.append(day);
        sb.append("\n"); 
        for(Integer k : dayCount) {
            sb.append(k);
            sb.append("\n"); 
        }
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


