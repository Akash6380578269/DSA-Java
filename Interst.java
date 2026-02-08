import java.util.*;
public class Interst {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int principle=scan.nextInt();
        int rate_ofInterst=scan.nextInt();
        int n=scan.nextInt();

        int si=(principle*n*rate_ofInterst)/100;
        
        System.out.println(si);
        int amount=principle+ si;
        System.out.println(amount);
        double discount=(2.0/10.0);
        System.out.println(discount);
        double total=amount-discount;
        System.out.println(total);
    }
}

