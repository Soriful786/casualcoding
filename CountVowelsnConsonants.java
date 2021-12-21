import java.io.*;
public class CountVowelsnConsonants {    
    int [] Count(String S){
        int vCount = 0, cCount = 0;    
        S = S.toLowerCase();    
        for(int i = 0; i < S.length(); i++) {    
            if(S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'o' || S.charAt(i) == 'u') {    
                vCount++;    
            }    
            else if(S.charAt(i) >= 'a' && S.charAt(i)<='z') {      
                cCount++;    
            }    
        }
        int arr[] = {vCount,cCount};
        return arr;
    }
    public static void main(String[] args) throws IOException {    
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r); 
        CountVowelsnConsonants m = new CountVowelsnConsonants();
        String S= br.readLine();
        int arr[]=m.Count(S);
        System.out.println("Number of vowels: " + arr[0]);    
        System.out.println("Number of consonants: " + arr[1]);    
        br.close();
        r.close();
    }    
}