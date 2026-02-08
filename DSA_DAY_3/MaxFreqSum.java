import java.util.HashMap;

public class MaxFreqSum{
    static int MaxVowelMaxConsonant(String s){
           int MaxVowel=0;
           int MaxConsonant=0;
           HashMap<Character , Integer> map=new HashMap<>();
           for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int freq=map.getOrDefault(ch,0 )+1;
            map.put(ch,freq);
             if(isVowel(ch)){
                MaxVowel=Math.max(MaxVowel, freq);
             }
             else{
                MaxConsonant=Math.max(MaxConsonant, freq);
             }

           }
           return MaxVowel+MaxConsonant;
        
    }
    private  static boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public static void main(String[] args) {
        String s="successes";
        int res=MaxVowelMaxConsonant(s);
        System.out.println(res);

    }
}