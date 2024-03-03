package bedenkitleindeksi;

import java.util.Scanner;

public class BedenKitleİndeksi {

    public static void main(String[] args) {
         // kilo boy indeksi hesaplama kilo / (boy * boy)
         // bki 18.5 altında zayıf , 18.5-25 normal , 25-30 fazla kilolu , 30+ obez
        double bki;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Kilonuz: ");
        int kilo = scanner.nextInt();
        System.out.print("Boyunuz(örnek: 1,75): ");
        double boy = scanner.nextDouble();
        
        bki = kilo / (boy * boy);
        if(bki<18.5)
            System.out.println("Zayıf");
        if(18.5 <= bki && bki <25)
            System.out.println("Normal");
        if(25 <= bki && bki < 30)
            System.out.println("Fazla kilolu");
        if(bki > 30)
            System.out.println("Obez");      
    }   
}
