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
        Stack<Integer> repeat = new Stack<>();
        Stack<Integer> plusTemp = new Stack<>();
        char input[] = br.readLine().toCharArray();
        int length = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '(') {
                repeat.add(stack.pop() - '0');
                stack.add('(');
            } else if (input[i] == ')') {

                int lengthCount = 0;
                char pop;
                while ((pop = stack.pop()) != '(') {
                    if (pop == '*') {
                        lengthCount += plusTemp.pop();
                        continue;
                    }

                    lengthCount++;
                }
                plusTemp.add(lengthCount * repeat.pop());
                stack.add('*');
            } else {
                stack.add(input[i]);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.pop() == '*') {
                length += plusTemp.pop();
            } else {
                length++;
            }
        }
        sb.append(length);
        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}