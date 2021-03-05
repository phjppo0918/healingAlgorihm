import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{

  static int LENGTH;
  byte paper[][];
  static int paperCount = 0;
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
        paper[i][j] =(byte)Integer.parseInt(st.nextToken());
      }
    }


    bw.flush();
    br.close();
    bw.close();
      

  }
  public static void cutPaper(int x, int y, int size) {
    //int centerLeft = (start+end)/2;
    byte color = paper[x][y];
    for(int i=x;i<size;i++) {
      for(int j=y;j<size;j++) {
        if(paper[i][j] != color) {
          
        }
      }
    }
  }


}