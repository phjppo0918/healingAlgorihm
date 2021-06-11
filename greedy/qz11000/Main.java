import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        final int NUMBER_OF_LECTURE = Integer.parseInt(br.readLine());
        StringTokenizer st; // = new StringTokenizer(br.readLine());
        ArrayList<Lecture> lectures = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_LECTURE; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int finish = Integer.parseInt(st.nextToken());
            lectures.add(new Lecture(start, finish));
        }
        Collections.sort(lectures);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        answer++;
        lectureFinishTime = 1;
    }
        sb.append(answer);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

}

}

class Lecture implements Comparable<Lecture> {

    int start;
    int finish;

    public Lecture() {

    }

    public Lecture(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    @Override
    public int compareTo(Lecture lecture) { // -1 0 1 순
        return this.start - lecture.start;
    }

}