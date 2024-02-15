package pkgFinalProjectUAS;
public class cBarang {
    String nama;
    int harga;
    cBarang(String n, int h){//konstruktor
        nama=n; harga=h;
    }//konstruktor dipakai di class aplikasi, di class aplikasi akan create object dari class barang untuk dimasukkan dalam transaksi

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
}
