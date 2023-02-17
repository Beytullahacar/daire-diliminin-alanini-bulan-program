import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Daire diliminin alanını bulan program*/

        int r,a;
        double sonuc, pi = 3.14;

        Scanner scan = new Scanner(System.in);
        System.out.print("Yarıçap değerini giriniz : ");
        r = scan.nextInt();
        System.out.print("Merkez açısının ölçüsünü giriniz : ");
        a = scan.nextInt();

        sonuc = (pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı : " + sonuc);
    }
}