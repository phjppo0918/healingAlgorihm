import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {
    public static HashSet<String> hashSet = new HashSet<>();
    public static HashMap<Integer, Integer> pair = new HashMap<>();
    public static ArrayList<Integer> openPivot = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st;// = new StringTokenizer(br.readLine());
        String inputStr = br.readLine();
        char input[] = inputStr.toCharArray();

        Stack<Integer> bracket = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '(') {
                openPivot.add(i);
                bracket.push(i);
            } else if (input[i] == ')') {
                pair.put(bracket.pop(), i);
            }
        }

        removeBracket(0, input);

        ArrayList<String> arrayList = new ArrayList<>(hashSet);
        Collections.sort(arrayList);
        if (arrayList.contains(inputStr)) {
            arrayList.remove(inputStr);
        }
        for (String k : arrayList) {
            sb.append(k);
            sb.append("\n");
        }
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }

    public static void removeBracket(int pivot, char str[]) {
        if (pivot == openPivot.size()) {
            StringBuilder sb = new StringBuilder();
            for (char k : str) {
                if (k != 0) {
                    sb.append(k);
                }
            }
            hashSet.add(sb.toString());
            return;
        }
        //char strTemp[] = str.clone();

        str[openPivot.get(pivot)] = 0;
        str[pair.get(openPivot.get(pivot))] = 0;
        removeBracket(pivot + 1, str);

        str[openPivot.get(pivot)] = '(';
        str[pair.get(openPivot.get(pivot))] = ')';
        removeBracket(pivot + 1, str);

    }


}