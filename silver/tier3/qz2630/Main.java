import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{

  static int LENGTH;
  static byte paper[][];
  static int paperCount = 0;
  static int bluePaperCount = 0;
  public static void main(String [] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st;
    //= new StringTokenizer(br.readLine());

    LENGTH = Integer.parseInt(br.readLine());
    paper = new byte[LENGTH][LENGTH];
    for(int i=0;i<LENGTH;i++) {
      st = new StringTokenizer(br.readLine());
      for(int j=0;j<LENGTH;j++) {
        paper[i][j] =(byte)Integer.parseInt(st.nextToken()); //파랑 : 1
      }
    }
    cutPaper(0,0,LENGTH);
    bw.write(paperCount-bluePaperCount+"\n");
    bw.write(bluePaperCount+"\n");

      
    bw.flush();
    br.close();
    bw.close();
      

  }
  public static void cutPaper(int x, int y, int size) { // x 가 행    y 가 열
    if(size==1) {
        paperCount++;
        if(paper[x][y]==1) {
            bluePaperCount++;
        }
        return;
    }
    //int centerLeft = (start+end)/2;
    byte color = paper[x][y];
    boolean isFull = true;
      
    for(int i=x;i<x+size;i++) {
      for(int j=y;j<y+size;j++) {
          
        if(paper[i][j] != color) {
            isFull = false;
            break;
        }
          
      }
      if(!isFull) {
        break;
      }
    }
    
    if(isFull) {
        paperCount++;
        if(paper[x][y]==1) {
            bluePaperCount++;
        }
        return;
    }else {
        //4방면 호출
        //1사
        cutPaper(x,y,size/2);
        //2사
        cutPaper(x,y+size/2,size/2);
        //3사
        cutPaper(x+size/2,y,size/2);
        //4사
        cutPaper(x+size/2,y+size/2,size/2);

    }

  }


}