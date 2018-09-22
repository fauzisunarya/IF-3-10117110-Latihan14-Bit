
package pkgif.pkg3.pkg10117110.latihan14.bit;

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Bilangan Bit
 */
public class IF310117110Latihan14Bit {

    public static void main(String[] args) {
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; // 13 = 0000 1101
        int c = 0;
        c = a & b;
        // 12 = 0000 1100
        System.out.println("a & b = " + c);
        c = a | b;
        // 61 = 0011 1101
        System.out.println("a | b = " + c);
        c = a ^ b;
        // 49 = 0011 0001
        System.out.println("a ^ b = " + c);
        c = ~a;
        // -61 = 1100 0011
        System.out.println("~a = " + c);
        c = a << 2;
        // 240 = 1111 0000
        System.out.println("a << 2 = " + c);
        c = a >> 2;
        // 15 = 0000 1111
        System.out.println("a >> 2 = " + c);

    }
    
}
