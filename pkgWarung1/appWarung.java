/*
1.narasi: Budi membeli sate di warung murah
2.class : pembeli (Budi), makanan (sate), warung (murah)
3.melengkapi isi class : data+method
4.coding di main class/app
 */
package pkgWarung1;
import java.util.Scanner;
// class provider
class cPembeli {

}
class cMakanan {

}
class cWarung {
    // data
    private String namaWarung, alamatWarung;
    // method2 standar
    // 1. constructor  > istimewa; inisialisasi data / variable
    cWarung() { //default
        namaWarung = " "; alamatWarung = " ";
        System.out.println("Default object created..");
    }
    cWarung(String nm, String al) { //parameterized
        namaWarung = nm; alamatWarung = al;
        System.out.println("Object warung" + namaWarung + " dibuat..");
    }
    // 2. setter  => mengisi nilai / data
    public void setNamaWarung(String n) {
        namaWarung = n;
    }
    public void setAlamatWarung(String a) {
        alamatWarung = a;
    }
    // 3. getter  > mengambil / membaca data
    public String getNamaWarung() {
        return namaWarung;
    }
    public String getAlamatWarung() {
        return alamatWarung;
    }
    // 4. toString  > menghasilkan teks isi data class
    public String lihatData() {
        return "Warung " + namaWarung + " [" + alamatWarung + "]";
    }
}
public class appWarung {
    public static void main(String[] args) {
        cWarung wrg1 = new cWarung (); //membuat object
        Scanner s = new Scanner (System.in);
        int pilih = 0;

        do {
            System.out.println("Warung " + wrg1.getNamaWarung());
            System.out.println("1. Buat Warung"
                            + "\n2. Lihat Warung"
                            + "\n3. Ubah Warung"
                            + "\n4. Selesai");
            System.out.print("Pilih = ");
            pilih = s.nextInt();

            switch(pilih) {
                case 1 : 
                    System.out.print("Nama Warung = ");
                    String nm = s.next();
                    System.out.print("Alamat      = ");
                    String al = s.next();
                    wrg1 = new cWarung(nm, al);
                    break;
                case 2 : 
                    String w = wrg1.lihatData();
                    System.out.println("Data = " + w);
                    break;
                case 3 : 
                    System.out.print("Alamat baru = ");
                    String a = s.next();
                    wrg1.setAlamatWarung(a);
                    break;
                case 4 : 
                    System.out.println("Terima Kasih..");
                    break;
            }
        } while (pilih != 4);
    }
}
    

