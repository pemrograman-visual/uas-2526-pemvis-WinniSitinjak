//Winni Sitinjak-12S25051
//Rafli Batubara-12S25008
import java.util.*;
import java.lang.Math;

public class soal5UAS {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, totallolos, tanggungan;
        String status;

        totallolos = 0;
        n = Integer.parseInt(input.nextLine());
        String[] nama = new String[n];
        double[] ipk = new double[n];
        int[] gaji = new int[n];

        for (i = 0; i <= n - 1; i++) {
            nama[i] = input.nextLine();
            ipk[i] = Double.parseDouble(input.nextLine());
            gaji[i] = Integer.parseInt(input.nextLine());
            tanggungan = Integer.parseInt(input.nextLine());
        }
        System.out.println("");
        for (i = 0; i <= n - 1; i++) {
            status = cekKelulusan(ipk[i], gaji[i]);
            System.out.println(nama[i] + "->" + status);
            if (status.equals("Lolos syarat awal")) {
                totallolos = totallolos + 1;
            }
        }
        System.out.println("");
        System.out.println("Total lolos:" + totallolos);
    }
    
    public static String cekKelulusan(double ipk, int gaji) {
        String hasil;

        if (ipk >= 3.0 && gaji <= 3000000) {
            hasil = "Lolos syarat awal";
        } else {
            hasil = "Tidak Lolos";
        }
        
        return hasil;
    }
}
