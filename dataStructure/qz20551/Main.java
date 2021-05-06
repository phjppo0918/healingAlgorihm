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
        ArrayList<Search> search = new ArrayList<Search>(); // class 형태로 만들어서 기존 위치 파악해야할듯
        for(int i=0;i<NUMBER_OF_NUMBER;i++) {
            al.add(Integer.parseInt(br.readLine()));
        }
        for(int i=0;i<NUMBER_OF_SEARCH;i++) {
            search.add(new Search(i,Integer.parseInt(br.readLine())) );
        }
        Collections.sort(al);
        Collections.sort(search);
        int alPivot = 0;
        int searchPivot = 0;
        while(searchPivot != NUMBER_OF_SEARCH && alPivot != NUMBER_OF_NUMBER) {
            if(al.get(alPivot) < search.get(searchPivot).value) {
                alPivot++;
            }else if(al.get(alPivot) > search.get(searchPivot).value){
                search.get(searchPivot).answer = -1;
                searchPivot++;
            }else {
                search.get(searchPivot).answer = alPivot;
                searchPivot++;
                //alPivot++;
            }
        }
        
        while(searchPivot != NUMBER_OF_SEARCH) {
            search.get(searchPivot).answer = -1;
            searchPivot++;
        }
        ArrayList<Search2> sh2 = new ArrayList<Search2>();
        for(int i=0;i<searchPivot;i++) {
            sh2.add(new Search2(search.get(i).location, search.get(i).answer));
        }
        Collections.sort(sh2);
        for(Search2 k: sh2) {
            sb.append(k.answer);
            sb.append("\n"); 
        }

        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    } 
}
class Search2 implements Comparable<Search2> {
    int location;
    int answer = -1;
    public Search2(){}
    public Search2(int location, int answer) {
        this.location = location;
        this.answer = answer;
    }
    @Override
    public int compareTo(Search2 search) {
        if(this.location > search.location) {
            return 1;
        }else if (this.location == search.location) {
            return 0;
        }else {
            return -1;
        }
    }
}
class Search implements Comparable<Search> {
    int location;
    int value;
    int answer = -1;
    public Search(){}
    public Search(int location, int value) {
        this.location = location;
        this.value = value;
    }
    
    @Override
    public int compareTo(Search search) {
        if(this.value > search.value) {
            return 1;
        }else if (this.value == search.value) {
            return 0;
        }else {
            return -1;
        }
    }
}


