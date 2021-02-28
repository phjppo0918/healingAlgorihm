import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        ArrayList<Person> ps = new ArrayList<Person>();
        int ageTemp;
        String nameTemp;
        StringTokenizer st;
        //= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
           ageTemp = Integer.parseInt(st.nextToken());
           nameTemp = st.nextToken();
            ps.add(new Person(ageTemp, nameTemp));
        }
        
        Collections.sort(ps);
     
       for(Person p : ps){
           
           bw.write(p.getAge()+" "+p.getName()+"\n");
       }
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}

class Person implements Comparable<Person> {
    private int age;
    private String name;
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(Person p) {
       return this.age - p.getAge();
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    
}