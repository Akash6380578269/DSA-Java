public class carrypass {
    public static void main(String[] args) {
        String s="abcagkagg";
        int count=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count++;
            }
            else if(s.charAt(i)=='g'){
                  res=res+count;
            }
        }
        System.out.println(res);
    }
    
}
