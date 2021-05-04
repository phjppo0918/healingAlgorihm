import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_NUMBER = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_SEARCH = Integer.parseInt(st.nextToken());
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> search = new ArrayList<Integer>(); // class 형태로 만들어서 기존 위치 파악해야할듯
        for(int i=0;i<NUMBER_OF_NUMBER;i++) {
            al.add(Integer.parseInt(br.readLine()));
        }
        for(int i=0;i<NUMBER_OF_SEARCH;i++) {
            search.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(al);
        Collections.sort(search);
        int alPivot = 0;
        int searchPivot = 0;
        while(searchPivot != NUMBER_OF_SEARCH && alPivot != NUMBER_OF_NUMBER) {
            if(al.get(alPivot) < search.get(searchPivot)) {
                alPivot++;
            }else if(al.get(alPivot) > search.get(searchPivot)){
                sb.append(-1);
                sb.append("\n");
                searchPivot++;
            }else {
                sb.append(al.get(alPivot));
                sb.append("\n");
                searchPivot++;
                alPivot++;
            }
        }
        
        if(searchPivot < NUMBER_OF_SEARCH && alPivot == NUMBER_OF_NUMBER) {
            while(searchPivot) {
                
            }
        }
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


