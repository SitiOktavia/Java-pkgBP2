package pkgWarung4_inheritance;
public class cPembelian {
    private cPembeli pembeli;
    private cMakanan makanan[]; //array object
    private int jmkn, maxmkn, total;
    //constructor
    cPembelian(int max){
        maxmkn = max;
        makanan = new cMakanan[maxmkn];
        jmkn=0; total = 0; 
    }
    public void isiPembeli(cPembeli p){
        pembeli = new cPembeli(p.getNama());
        System.out.println("Isi Pembeli Sukses...");
    }
    public void tambahMakanan(cMakanan m){
        if(jmkn>=maxmkn){
            System.out.println("Keranjang penuh!");
        }else{
            makanan[jmkn] = new cMakanan(m.getNama(),m.getHarga());
            jmkn++;
            System.out.println("Tambah sukses...");
        }
    }
    public void lihatMakanan(){
        System.out.println(pembeli.ToString());
        System.out.println("Daftar Makanan");
        if(jmkn<=0){
            System.out.println("Kosong!");
        }else{
            for (int i = 0; i < jmkn; i++) {
                System.out.println(i+1+"."+makanan[i].ToString());
            }
        }
    }
    public void hpsMakanan(String hps){
        if(jmkn<=0){
            System.out.println("Kosong!");
        }else{
            boolean ada=false;
            for (int i = 0; i < jmkn; i++) {
                if(hps.equalsIgnoreCase(makanan[i].getNama())){
                    ada=true;
                    makanan[i] = null;
                    for (int j = i; j < jmkn; j++) {
                        if(j==jmkn-1){
                            makanan[j]=null;
                        }else{
                            makanan[j] = makanan[j+1];
                        }
                    }
                    jmkn--;
                    System.out.println("Hapus suksees");
                    break;
                }
            }
            if(ada==false){
                System.out.println("Makanan tidak ada!");
            }
        }
            
    }
}
