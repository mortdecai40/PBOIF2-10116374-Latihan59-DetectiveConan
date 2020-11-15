package pboif2.pkg10116374.latihan59.detectiveconan;
import java.util.Scanner;

/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk menampilkan kemampuan pada tokoh di serial Detektif Conan
 *
 */
public class PBOIF210116374Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Tokoh tokoh = new Tokoh();
        
        System.out.println("===Tokoh Dalam Detektif Konan===");
        System.out.println("---Berdasarkan Keahliannya---");
        tokoh.tampilDaftarKeahlian();
        tokoh.setKeahlian(sc.nextInt());
        
        System.out.println("");
        
        tokoh.tampilKeahlian(tokoh.getKeahlian());
    }
    
}
