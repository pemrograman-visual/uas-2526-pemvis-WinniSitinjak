//Winni Sitinjak-12S25051
//Rafli Batubara-12S25008
import java.util.*;
import java.lang.Math;

public class soal2UAS {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jumlahbarang;
        String namabarang;
        int stokawal;
        int terjual;
        int stokakhir;
        String status;
        int i;

        jumlahbarang = Integer.parseInt(input.nextLine());
        for (i = 1; i <= jumlahbarang; i++) {
            namabarang = input.nextLine();
            stokawal = Integer.parseInt(input.nextLine());
            terjual = Integer.parseInt(input.nextLine());
            if (terjual > stokawal && terjual < 0) {
            } else {
                System.out.println("INVALID, ulangi saudara");
                terjual = Integer.parseInt(input.nextLine());
            }
            stokakhir = stokawal - terjual;
            status = cekStatus(stokakhir);
            System.out.println(namabarang + " " + "stok awal:" + stokawal + " " + "terjual:" + terjual + " " + "stok akhir:" + stokakhir + " " + status);
        }
    }
    
    public static String cekStatus(int stokakhir) {
        String status;
        int jumlahbarang, i;

        jumlahbarang = 1;
        for (i = 1; i <= jumlahbarang; i++) {
            if (stokakhir == 0) {
                status = "Habis, segera restock!";
            } else {
                if (stokakhir < 5) {
                    status = "Stok menipis.";
                } else {
                    if (stokakhir >= 5) {
                        status = "stok aman";
                    }
                }
            }
        }
        
        return status;
    }
}
