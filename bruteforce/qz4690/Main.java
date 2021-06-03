import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int aTriple=0, bTriple=0,cTriple =0,dTriple =0;

        for (int a = 6; a < 101; a++) {
            aTriple = a*a*a;
            for (int b = 2; b < a; b++) {
                bTriple = b*b*b;
                for (int c = b; c < a; c++) {
                    cTriple = c*c*c;
                    if(bTriple+cTriple > aTriple){
                        break;
                    }
                    for (int d = c; d < a; d++) {
                        dTriple = d*d*d;
                        if(aTriple == (bTriple)+(cTriple)+(dTriple)) {
                            sb.append("Cube = ");
                            sb.append(a);
                            sb.append(", Triple = (");
                            sb.append(b);
                            sb.append(",");
                            sb.append(c);
                            sb.append(",");
                            sb.append(d);
                            sb.append(")\n");
                        }else if(bTriple+cTriple+dTriple > aTriple){
                            break;
                        }
                    }
                }
            }
        }
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


