import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        
        final int NUMBER_OF_USER = Integer.parseInt(br.readLine());
        
        int answer = 1;
        User winner = new User(0,0,0,0);
        
        for(int i=1; i<=NUMBER_OF_USER;i++) {
            st = new StringTokenizer(br.readLine());
            int idTemp = i;
            int scoreTemp = Integer.parseInt(st.nextToken());
            int numberOfSubmitTemp = Integer.parseInt(st.nextToken());
            int uploadTimeTemp = Integer.parseInt(st.nextToken());

            if(winner.score > scoreTemp) {
                continue;
            }
            
            if(winner.score < scoreTemp ) {
                winner = new User(idTemp, scoreTemp, numberOfSubmitTemp, uploadTimeTemp);
                continue;
            }
            
        
            if(winner.numberOfSubmit < numberOfSubmitTemp) {
                continue;
            }

            if(winner.numberOfSubmit > numberOfSubmitTemp) {
                winner = new User(idTemp, scoreTemp, numberOfSubmitTemp, uploadTimeTemp);
                continue;
            }

       
            if(winner.uploadTime < uploadTimeTemp) {
                continue;
            }

            winner = new User(idTemp, scoreTemp, numberOfSubmitTemp, uploadTimeTemp);

        
        
        }
        
        
        
        sb.append(winner.userId);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}

class User {
    public int userId;
    public int score;
    public int numberOfSubmit;
    public int uploadTime;
    
    public User(int userId, int score, int numberOfSubmit, int uploadTime) {
        this.userId = userId;
        this.score = score;
        this.numberOfSubmit = numberOfSubmit;
        this.uploadTime = uploadTime;
    }
}


