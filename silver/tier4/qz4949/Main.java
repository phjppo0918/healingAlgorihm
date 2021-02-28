import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String total = "";
        String temp;
        String buffer = "";
        ArrayList<String> arr = new ArrayList<String>();
        while(true) {
            temp = br.readLine();
            if(temp.equals(".")) {
                break;
            }
            
            if(temp.charAt(temp.length()-1) != '.') {
                buffer= buffer + temp;
            }else {
                arr.add(buffer + temp);
                buffer = "";
            }    
     
           //System.out.println(total);
        }
        char stack[];
        int pivot = -1;
       
       // System.out.println(arr.length);
        boolean answer[] = new boolean[arr.size()]; //true false 거꾸로
        for(int i=0; i<arr.size(); i++) {
            
            stack = new char[arr.get(i).length()];
            pivot = -1;
            
            for(int j=0;j<arr.get(i).length();j++) {
                if(arr.get(i).charAt(j)=='(') { 
                    
                    pivot++;
                    stack[pivot] = '(';
                    
                }else if(arr.get(i).charAt(j)=='[') {
                    
                    pivot++;
                    stack[pivot] = '[';
                    
                }else if(arr.get(i).charAt(j)==')') {
                    
                    if(pivot<0) {
                        answer[i] = true;
                        break;
                    }
                    
                    if(stack[pivot]=='(') {
                        pivot--;
                    }else {
                        answer[i] = true;
                        break;
                    }
                    
                }else if(arr.get(i).charAt(j)==']'){
                    
                     if(pivot<0) {
                        answer[i] = true;
                        break;
                    }
                    
                    if(stack[pivot]=='[') {
                        pivot--;
                    }else {
                        answer[i] = true;
                        break;
                    }
                    
                }
                
            }
            
            
        }
        
        for(int i=0;i<arr.size();i++) {
            if(answer[i]) {
                bw.write("no\n");
            }else {
                bw.write("yes\n");
            }
        }
     
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}