import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int MAX_HOUR = Integer.parseInt(st.nextToken());
        final int NUMBER = Integer.parseInt(st.nextToken());
        int count = 0;
        if (NUMBER == 0) {
            for (int hh = 0; hh <= MAX_HOUR; hh++) {
                if (hh < 10 || hh % 10 == 0) {
                    count += 60 * 60;
                    continue;
                }
                for (int mm = 0; mm < 60; mm++) {
                    if (mm < 10 || mm % 10 == 0) {
                        count += 60;
                        continue;
                    }
                    for (int ss = 0; ss < 60; ss++) {
                        if (ss < 10 || ss % 10 == 0) {
                            count += 1;
                        }
                    }
                }
            }
        } else {

            for (int hh = 0; hh <= MAX_HOUR; hh++) {
                if (hh % 10 == NUMBER || hh / 10 == NUMBER) {
                    count += 60 * 60;
                    continue;
                }
                for (int mm = 0; mm < 60; mm++) {
                    if (mm % 10 == NUMBER || mm / 10 == NUMBER) {
                        count += 60;
                        continue;
                    }
                    for (int ss = 0; ss < 60; ss++) {
                        if (ss % 10 == NUMBER || ss / 10 == NUMBER) {
                            count += 1;
                        }
                    }
                }
            }

        }


        sb.append(count);
        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}



