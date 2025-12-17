//Winni Sitinjak-12S25051
//Rafli Batubara-12S25008
import java.util.*;
import java.lang.Math;

public class soal4UAS {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, totalShift, maxshift, minshift;
        double ratarata;
        String maxnama, minnama, kesimpulan;

        totalShift = 0;
        maxshift = -1;
        minshift = 1000;
        n = Integer.parseInt(input.nextLine());
        int shiftArr;
        String[] nama = new String[n];
        int[] shift = new int[n];

        for (i = 0; i <= n - 1; i++) {
            nama[i] = input.nextLine();
            shift[i] = Integer.parseInt(input.nextLine());
        }
        for (i = 0; i <= n - 1; i++) {
            totalShift = totalShift + shift[i];
            if (shift[i] > maxshift) {
                maxshift = shift[i];
                maxnama = nama[i];
            }
            if (shift[i] < minshift) {
                minshift = shift[i];
                minnama = nama[i];
            }
        }
        ratarata = (double) totalShift / n;
        System.out.println("Daftar Shift:");
        for (i = 0; i <= n - 1; i++) {
            System.out.println(nama[i] + "=>" + shift[i]);
        }
        System.out.println("");
        System.out.println("Total Shift=" + totalShift);
        System.out.println("Rata-rata=" + ratarata);
        System.out.println("Shift terbanyak=" + maxnama + "(" + minshift + ")");
        System.out.println("Shift tersedikit:" + minnama + "(" + minshift + ")");
        System.out.println("");
        kesimpulan = cekKesimpulan(maxshift, minshift);
        System.out.println(kesimpulan);
    }
    
    public static String cekKesimpulan(int maxVal, int minVal) {
        String pesan;
        int selisih;

        selisih = maxVal - minVal;
        if (selisih >= 3) {
            pesan = "Distribusi shift tidak merata, beberapa asisten terbebani.";
        } else {
            pesan = "Distribusi shift cukup merata";
        }
        
        return pesan;
    }
}
