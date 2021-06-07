import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        final int NUMBER_OF_COUNTRY = Integer.parseInt(br.readLine());
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        ArrayList<Country> ctArrayList = new ArrayList<>();
        long peopleTotal = 0;
        for (int i = 0; i < NUMBER_OF_COUNTRY; i++) {
            st = new StringTokenizer(br.readLine());
            int location = Integer.parseInt(st.nextToken());
            long numberOfPeople = Integer.parseInt(st.nextToken());
            peopleTotal += numberOfPeople;
            ctArrayList.add(new Country(location, numberOfPeople));
        }

        Collections.sort(ctArrayList);
        long peopleSum = 0;
        for (int i = 0; i < NUMBER_OF_COUNTRY; i++) {
            peopleSum += ctArrayList.get(i).numberOfPeople;
            if (peopleSum >= (peopleTotal + 1) / 2) {
                sb.append(ctArrayList.get(i).location);
                sb.append("\n");
                break;
            }
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }
}

class Country implements Comparable<Country> {

    int location;
    long numberOfPeople;

    public Country() {
    }

    public Country(int location, long numberOfPeople) {
        this.location = location;
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public int compareTo(Country country) {
        if (this.location == country.location) {
            return (int) (this.numberOfPeople - country.numberOfPeople);
        }

        return this.location - country.location;
    }
}


