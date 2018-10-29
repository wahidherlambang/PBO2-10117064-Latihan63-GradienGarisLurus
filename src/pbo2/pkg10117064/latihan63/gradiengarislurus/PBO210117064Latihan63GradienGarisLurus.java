/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan63.gradiengarislurus;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program menghitung 
 * gradien garis lurus. 
 */
public class PBO210117064Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat kdn = new Koordinat(2, 10, 5, 7);
        Koordinat kdn2 = new Koordinat(5, 1, 3, 12);

        System.out.println("Garis yang melalui titik (2,10) dan (5,7) "
                + "memiliki gradien sebesar " + kdn.hitungGradien());
        System.out.println("Garis yang melalui titik (5,1) dan (3,12) "
                + "memiliki gradien sebesar " + kdn2.hitungGradien());

    }
}
