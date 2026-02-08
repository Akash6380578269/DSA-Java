public class main {
    public static void main(String[] args) {
        int num=373;
        int bal=0;
        if(num>365){
         int years=num/365;
        System.out.println(years);
        bal=num%365;
         
          }
     if(bal>7){
        int weeks=bal/7;
        int days=bal%7;
        System.out.println(weeks);
        System.out.println(days);

           }
       }
}
