import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_TREE = Integer.parseInt(br.readLine());
        long answer = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        ArrayList<Tree> tree = new ArrayList<Tree>();
        for(int i=0;i<NUMBER_OF_TREE;i++) {
            int length = Integer.parseInt(st.nextToken());
            int grow = Integer.parseInt(st2.nextToken());
            tree.add(new Tree(length, grow));
        }
        
        Collections.sort(tree);
        
       
       for(int i = 0;i<NUMBER_OF_TREE;i++) {
            answer += tree.get(i).length + (long)tree.get(i).grow * i;
       }
        
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}
class Tree implements Comparable<Tree> {
    int length;
    int grow;
    Tree(){}
    Tree(int length, int grow) {
        this.length = length;
        this.grow = grow;
    }
    
    @Override
    public int compareTo(Tree tree) {
        if(this.grow > tree.grow) {
            return 1;
        }else if (this.grow == tree.grow) {
            return 0;
        }else {
            return -1;
        }
    }


}


