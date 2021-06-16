import java.util.*;
import java.io.*;

import java.math.BigInteger;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st;

        Stack<Character> stack = new Stack<>();
        char input[] = br.readLine().toCharArray();
        int strLength = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == ')') {
                while (true) {
                    char stackPop = stack.pop();
                    if (stackPop == '(') {
                        strLength *= (stack.pop() - '0');
                        break;
                    }
                    strLength++;

                }
            } else {
                stack.add(input[i]);
            }
        }
        sb.append(strLength + stack.size());

        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}
