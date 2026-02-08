// //import java.util.HashMap;
// import java.util.HashSet;

// public class longestString {
// static int longStr(String s){
//     int start=0;
//     int maxLen=0;
//     HashSet<Character> set =new HashSet<>();
//     for(int end=0;end<s.length();end++){
//         while(set.contains(s.charAt(end))){
//             set.remove(s.charAt(start));
//             start++;
//         }
//         set.add(s.charAt(end));
//         maxLen=Math.max(maxLen, end-start+1);
//    }
//    return maxLen;
// }
//     public static void main(String[] args) {
//         String s="abcaa";
//       int res= longStr(s);
//       System.out.println(res);
//     }
// }

import java.util.HashSet;

public class longestString {

    public static void main(String[] args) {
        String  s="abca";
        int start=0;
        int maxLen=0;
        HashSet<Character> set=new HashSet<>();
        for(int end=0;end<s.length();end++){
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
          maxLen=Math.max(maxLen, end-start+1);
        }
        System.out.println(maxLen);

    }
}