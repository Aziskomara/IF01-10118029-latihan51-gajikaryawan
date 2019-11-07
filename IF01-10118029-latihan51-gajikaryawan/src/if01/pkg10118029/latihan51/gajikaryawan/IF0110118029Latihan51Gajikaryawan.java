/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Gaji Karyawan
 */
public class IF0110118029Latihan51Gajikaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        manager manager = new manager();
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");manager.setNik(scanner.nextLine());
        System.out.print("Masukkan Nama : ");manager.setNama(scanner.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");manager.setGolongan(scanner.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");manager.setJabatan(scanner.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");manager.setKehadiran(scanner.nextInt());
        
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK\t\t: " + manager.getNik());
        System.out.println("NAMA\t\t: " + manager.getNama());
        System.out.println("GOLONGAN\t: " + manager.getGolongan());
        System.out.println("JABATAN\t\t: " + manager.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN\t\t: " + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t\t: " + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t\t: " + manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t\t: " + manager.gajiTotal());
    }
    
}
