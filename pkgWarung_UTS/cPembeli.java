package pkgWarung_UTS;
public class cPembeli {
    private String nama;
    cPembeli (String n){
        nama=n; 
    }
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
