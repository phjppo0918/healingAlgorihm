import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_MEMBER = Integer.parseInt(br.readLine());
        ArrayList<Member> members = new ArrayList<Member>();
        for(int i=0;i<NUMBER_OF_MEMBER;i++) {
            st = new StringTokenizer(br.readLine());
            int score = Integer.parseInt(st.nextToken());
            int submitCount = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());

            members.add(new Member(i+1,score, submitCount, time));
            
        }
        
        Collections.sort(members);
        sb.append(members.get(NUMBER_OF_MEMBER-1).id);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}

class Member implements Comparable<Member> {
    int id;
    int score;
    int submitCount;
    int time;
    
    public Member(){}
    public Member(int id, int score, int submitCount, int time) {
        this.id = id;
        this.score = score;
        this.submitCount = submitCount;
        this.time = time;
    }
    
    @Override
    public int compareTo(Member member) {
        if(this.score > member.score) {
            return 1;
        }else if(this.score == member.score ) {
            if(this.submitCount < member.submitCount) {
                return 1;
            }else if (this.submitCount == member.submitCount) {
                if(this.time < member.time) {
                    return 1;
                }else {
                    return -1;
                }
            }else {
                return -1;
            }
        }else {
            return -1;
        }
    }
}


