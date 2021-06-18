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
        final char INPUT[] = br.readLine().toCharArray();
        for (int i = 0; i < INPUT.length; i++) {
            if ('A' <= INPUT[i] && INPUT[i] <= 'Z') {
                sb.append(INPUT[i]);
            } else if (INPUT[i] == '(') {
                stack.add('(');
            } else if (INPUT[i] == ')') {
                char temp;
                while ((temp = stack.pop()) != '(') {
                    sb.append(temp);
                }
            } else {
                if (stack.isEmpty()) {
                    stack.add(INPUT[i]);
                } else {
                    if (getGrade(stack.peek()) < getGrade(INPUT[i])) {
                        stack.add(INPUT[i]);
                    } else {
                        while (!stack.isEmpty() && (getGrade(stack.peek()) >= getGrade(INPUT[i]))) {
                            sb.append(stack.pop());
                        }
                        stack.add(INPUT[i]);
                    }
                }
            }

        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }

    public static int getGrade(char oper) {
        if (oper == '(') {
            return 0;
        } else if (oper == '+' || oper == '-') {
            return 1;
        }
        return 2;
    }

}