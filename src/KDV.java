 import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
    int dolap,koltuk,kitaplik;
        Scanner inp = new Scanner(System.in);
        System.out.println("Dolap Fiyati");
        dolap = inp.nextInt();

        System.out.println("Koltuk Fiyati");
        koltuk = inp.nextInt();

        System.out.println("Kitaplik Fiyati");
        kitaplik = inp.nextInt();

       int toplam = (dolap + koltuk + kitaplik);
       double sonuc = toplam;
       System.out.println("Toplam Tutar :" + sonuc);
       double fiyat = toplam*1.18 ;
       System.out.println("Kdvli Tutar :" + fiyat);
       double kdv = toplam*0.18;
       System.out.println("Toplam Kdv :" + kdv );
    }
}
