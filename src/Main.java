import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Girilecek Not sayısısnı giriniz");
        int sum = 0;

        Scanner input = new Scanner(System.in);
        int notSayisi = input.nextInt();
        for (int i = 1; i <= notSayisi; i++) {
            System.out.println("öğrencinin "+ i+ ". notu giriniz");
            int notlar = input.nextInt();
            sum += notlar;


        }
        float ortalama = sum/notSayisi;
        System.out.println("Not ortalaması: "+ortalama);

        if (ortalama>80)
            System.out.println("Yüksek puan");

    }

}