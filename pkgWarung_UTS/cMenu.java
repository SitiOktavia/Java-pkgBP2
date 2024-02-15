package pkgWarung_UTS;
public class cMenu {
    private String nama;
    private int harga;
    cMenu(String n, int h){
        nama=n; harga=h;
    }
    public void setNama(String n){
        nama=n;
    }
    public void setHarga(int h){
        harga=h;
    }
    public String getNama(){
        return nama;
    }
    public int getHarga(){
        return harga;
    }
    public String ToString(){
      return nama+"\t\t\tRp"+harga+"";  
    }
}
