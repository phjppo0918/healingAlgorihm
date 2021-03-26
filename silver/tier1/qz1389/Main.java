import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
   
    public static boolean member[][];
    public static int NUMBER_OF_NODE;
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        NUMBER_OF_NODE = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_EDGE = Integer.parseInt(st.nextToken());
        member = new boolean [NUMBER_OF_NODE+1][NUMBER_OF_NODE+1]; 
        int kebin[] = new int [NUMBER_OF_NODE+1];
        
        for(int i=0;i<NUMBER_OF_EDGE;i++) {
            st = new StringTokenizer(br.readLine());
            int mem1 = Integer.parseInt(st.nextToken());
            int mem2 = Integer.parseInt(st.nextToken());
            member[mem1][mem2] = true; //차라리 리스트로 바꾸자!
            member[mem2][mem1] = true;
        }
        
        for(int i=1;i<NUMBER_OF_NODE;i++) {
            for(int j=i+1;j<NUMBER_OF_NODE+1;j++) {
                visit[i] = true;
                int kebCount = bfs(i,j);
                kebin[i] += kebCount;
                kebin[j] += kebCount;
            }
        }
        
        sb.append("\n");
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    } 
    public static int bfs(int num1, int num2) {
        Queue<Integer> q = new LinkedList<Integer>();
        boolean visit[] = new boolean[NUMBER_OF_NODE+1];
        int kebinValue = 1;
        
        q.add(num1);
        visit[num1] = true;
        while( !(q.isEmpty()) ){
            int temp = q.poll();
            
            if(member[temp][num2]) {
                break;
            }else {
                kebinValue++;
                for(int i=1;i<NUMBER_OF_NODE+1;i++) {
                    if(member[temp][i]&&!visit[i]) {
                        q.add[i];
                        visit[i] = true;
                    }
                }
            }
            
            
        }
       
        
        return kebinValue;
    }
}





