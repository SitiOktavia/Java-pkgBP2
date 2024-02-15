package bp2.pkg2022; 
// class" pendukung sistem
// UMKM --> Warung --> Kasir
// identifikasi kandidat class (data+method) berkaitan
// kandidat: pembeli, barang, pemilik, kasir, admin
class Barang {
    // data, variabel
    private String namaBarang;
    private int hargaBarang;
    // method, fungsi
    void createBarang(String n, int h) {
        namaBarang = n;
        hargaBarang = h;
    }
    void readBarang() {
        System.out.println("Nama    : "+namaBarang);
        System.out.println("Harga   : "+hargaBarang);
    }
    void updateBarang(int h) {
        hargaBarang = h;
    }
    void deleteBarang() {
        namaBarang = null;
        hargaBarang = 0;
    }
}
public class BP22022 {
    // variable" global

    // method"

    public static void main(String[] args) {
        // variable" lokal
        // create object
        Barang brg = new Barang();
        brg.readBarang();   //message passing
        brg.createBarang("Sepatu", 100000);
        brg.readBarang();
        brg.updateBarang(125000);
        brg.readBarang();
        brg.deleteBarang();
        brg.readBarang();
    }
}


