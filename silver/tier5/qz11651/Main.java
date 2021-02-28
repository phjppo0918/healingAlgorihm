import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        ArrayList<Location> lc = new ArrayList<Location>();
        int xTemp;
        int yTemp;
        StringTokenizer st;
        //= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
           xTemp = Integer.parseInt(st.nextToken());
           yTemp = Integer.parseInt(st.nextToken());

            lc.add(new Location(xTemp, yTemp));
        }
        
        Collections.sort(lc);
     
       for(Location l : lc){
           
           bw.write(l.getX()+" "+l.getY()+"\n");
       }
        
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}

class Location implements Comparable<Location> {
    private int x;
    private int y;
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Location l) {
       if(this.y>l.getY()){
           return 1;
       }else if(this.y == l.getY()) {
           if(this.x>l.getX()) {
               return 1;
           }else {
               return -1;
           }
       }else {
           return -1;
       }
    }
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}