import java.util.Scanner;

/**
 * recursiveAsalSayi
 */
public class recursiveAsalSayi {
    static boolean isPrime(int a,int i){
        if(a <= 2)
            return a == 2 ? true : false;
        if(a % i == 0)
            return false;
        if(i * i > a)
            return true;
        return isPrime(a, ++i);
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int a = scan.nextInt();
        String str = isPrime(a, 2) ? " sayısı ASALDIR !" : " sayısı ASAL değildir !";
        System.out.println(a + str);
    }
}