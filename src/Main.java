import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program menghitung gaji karyawan
 * berkonsep objek oriented dan implementasi pewarisan.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        manager.setNik(scanner.next());
        System.out.print("Masukkan Nama : ");
        manager.setNama(scanner.next());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(scanner.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(scanner.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(scanner.nextInt());

        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t\t : " + manager.getNik());
        System.out.println("Nama\t : " + manager.getNama());
        System.out.println("Golongan : " + manager.getGolongan());
        System.out.println("Jabatan\t : " + manager.getJabatan());
        System.out.print("\n");
        System.out.println("TUNJANGAN GOLONGAN\t : " + manager.tunjanganGolongan(manager.golongan));
        System.out.println("TUNJANGAN JABATAN\t : " + manager.tunjanganJabatan(manager.jabatan));
        System.out.println("TUNJANGAN KEHADIRAN\t : " + manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.print("\n");
        System.out.println("GAJI TOTAL : " + manager.gajiTotal());
    }
}
