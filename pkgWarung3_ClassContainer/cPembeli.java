package pkgWarung3_ClassContainer;
public class cPembeli {
    private String nama;
    private String alamat;
    private cMakanan makanan; //relasi HAS A (agregasi)
    public void tambahMakanan(cMakanan m){
        makanan=m;
        System.out.println("Penambahan sukses...");
    }
    public void lihatMakanan(){
        System.out.println("Makanan : "+makanan.ToString());
    }
    public void hapusMakanan(){
        makanan=null;
        System.out.println("Penghapusan sukses...");
    }
    public void ubahMakanan(cMakanan m){
        makanan=m;
    }
    //constructor parameterized
    cPembeli (String n){
        nama=n; 
        System.out.println("Object "+nama+" dibuat...");
    }
    //setter
    public void setNama(String n){
        nama=n;
    }
    public String getNama(){
        return nama;
    }
    public String ToString(){
        return "Pembeli : "+nama;
    }
}
