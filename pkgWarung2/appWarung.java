/*
OOP => class
1. kalimat proses : Budi membeli sate
2. class : pembeli, makanan
3. lengkapi isi class : data & method (berkaitan)
4. menu program di main
*/
package pkgWarung2;
import java.util.Scanner;
class cPembeli{
    //data
    private String nama;
    private String alamat;
    //method
    cPembeli(String n, String a){
    //constructor
        nama =n; alamat=a;
        System.out.println("Pembeli"+nama+"dibuat...");
    } 
    public void setNama(String n){
        nama=n;
    }
    public void setAlamat(String a){
        alamat=a;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String ToString(){
        return nama+"["+alamat+"]";
    }
}
class cMakanan{
    //data
    private String menuMakanan;
    private int hMakanan;
    //method
    cMakanan(String mn, int hrg){
    //constructor
        menuMakanan=mn; hMakanan=hrg;
        System.out.println("Menu"+menuMakanan+"dibuat...");
    }
    public void setMenuMakanan(String mn){
        menuMakanan=mn;
    }
    public void setHargaMakanan(int hrg){
        hMakanan=hrg;
    }
    public String getMenuMakanan (){
        return menuMakanan;
    }
    public int getHargaMakanan(){
        return hMakanan;
    }
    public String ToString(){
        return menuMakanan+"["+hMakanan+"]";
    }
}
public class appWarung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cMakanan mkn = new cMakanan("Sate",15000);
        cPembeli pb = new cPembeli ("Budi", "Rungkut");
        int pilih=0;        
        do{
            System.out.println("WARUNG HAPPY"
                    + "\n1.Makanan"
                    + "\n2.Pembeli"
                    + "\n3.Selesai");
            System.out.print("Pilih   : ");
            pilih=sc.nextInt();
            switch(pilih){
                case 1:
                    int pilih1=0;
                    do{
                        System.out.println("    MAKANAN");
                        System.out.println("    1. Buat data");
                        System.out.println("    2. Lihat data");
                        System.out.println("    3. Ubah data");
                        System.out.println("    4. Kembali");
                        System.out.print("  Pilih : ");
                        pilih1=sc.nextInt();
                        switch(pilih1){
                            case 1:
                                System.out.print("Nama  : ");
                                String n = sc.next();
                                System.out.print("Harga : ");
                                int h = sc.nextInt();
                                mkn = new cMakanan(n,h);
                                break;
                            case 2:
                                String t = mkn.ToString();
                                System.out.println("Menu : "+t);
                                break;  
                            case 3:
                                System.out.print("Harga baru  : ");
                                int hb = sc.nextInt();
                                mkn.setHargaMakanan(hb);
                                break;
                            case 4:
                                System.out.println("Ke Menu Utama...");
                                break;    
                        }
                    }while(pilih1!=4);
                    break;
                case 2:
                    int pilih2=0;
                    do{
                        System.out.println("    MAKANAN");
                        System.out.println("    1. Buat data");
                        System.out.println("    2. Lihat data");
                        System.out.println("    3. Ubah data");
                        System.out.println("    4. Kembali");
                        System.out.print("  Pilih : ");
                        pilih2=sc.nextInt();
                        switch(pilih2){
                            case 1:
                                System.out.println("Nama : ");
                                String nm = sc.next();
                                System.out.println("Alamat :");
                                String a = sc.next();
                                pb = new cPembeli(nm,a);
                                break;
                            case 2:
                                String p = pb.ToString();
                                System.out.println("Pembeli :"+p);
                                break;
                            case 3:
                                System.out.print("Alamat baru : ");
                                String ab = sc.next();
                                pb.setAlamat(ab);
                                break;
                            case 4:
                                System.out.println("Ke menu utama..");
                                break;
                        }
                    }while(pilih2!=2);
                    break;  
                case 3:
                    break;
            }
        }while(pilih!=3);
    }
}
