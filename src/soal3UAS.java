//Winni Sitinjak-12S25051
//Rafli Batubara-12S25008
import java.util.*;
import java.lang.Math;

public class soal3UAS {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i;
        int jumlahAlat;
        int totalOrang;
        int totalKamar;
        String nama;

        n = Integer.parseInt(input.nextLine());
        totalKamar = 0;
        totalOrang = 0;
        System.out.println("Total Konsumsi");
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            jumlahAlat = Integer.parseInt(input.nextLine());
            totalOrang = hitungKonsumsi(jumlahAlat);
            System.out.println(nama + "=" + totalOrang + "wh");
            totalKamar = totalKamar + totalOrang;
        }
        System.out.println("Total konsumsi kamar=" + totalKamar);
        if (totalKamar <= 1000) {
            System.out.println("Konsumsi masih dalam  batas wajar");
        } else {
            System.out.println("Konsumsi melebihi baats wajar");
        }
    }
    
    public static int hitungKonsumsi(int jumlahAlat) {
        int totalOrang, i, konsumsi;

        totalOrang = 0;
        for (i = 1; i <= jumlahAlat; i++) {
            konsumsi = Integer.parseInt(input.nextLine());
            if (konsumsi <= 0) {
            } else {
                System.out.println("INVALID");
                konsumsi = Integer.parseInt(input.nextLine());
            }
            totalOrang = totalOrang + konsumsi;
        }
        
        return totalOrang;
    }
}
