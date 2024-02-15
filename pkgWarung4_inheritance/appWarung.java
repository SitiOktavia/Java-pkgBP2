package pkgWarung4_inheritance;
import java.util.Scanner;
public class appWarung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih=0, pilih1=0;
        
        cPembeli pb = new cPembeli(" ");
        cMakanan menu[] = new cMakanan[5];
        
        cPembelian beli = new cPembelian(3);
        
        menu[0]=new cMakanan("Sate", 15000);
        menu[1]=new cMakanan("Soto", 12000);
        menu[2]=new cMakanan("Gule", 16000);
        menu[3]=new cMakanan("Bakso", 10000);
        menu[4]=new cMakanan("Pecel", 8000);
        
        
        
        cMinuman minum = new cMinuman("Es",3000);
        System.out.println(minum.ToString());
        
        
        
        
        do{
            System.out.println("    APP WARUNG");
            System.out.println("1. Pembeli");
            System.out.println("2. Menu");
            System.out.println("3. Transaksi");
            System.out.println("4. Selesai");
            System.out.print("Pilih  : ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    //sub menu pembeli
                    System.out.print("Nama Pembeli    :");
                    String nm = sc.next();
                    pb.setNama(nm);
                    break;
                case 2:
                    //sub menu mknn
                    System.out.println("");
                    System.out.println("Daftar Menu Makanan");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(i+1+"."+menu[i].ToString());
                    }
                    break;
                case 3:
                    //sub menu beli
                    int pilihb=0;
                    do{
                        System.out.println("");
                        System.out.println(" Pembelian");
                        System.out.println("1. Isi Pembeli");
                        System.out.println("2. Tambah Makanan");
                        System.out.println("3. Hapus Makanan");
                        System.out.println("4. Lihat Makanan");
                        System.out.print("=> Pilih  : ");
                        pilihb = sc.nextInt();
                        switch(pilihb){
                            case 1:
                                beli.isiPembeli(pb);
                                break;
                            case 2:
                                System.out.println("Menu = ");
                                String mn = sc.next();
                                boolean ada=false;
                                for (int i = 0; i < menu.length; i++) {
                                    if(mn.equalsIgnoreCase(menu[i].getNama())){
                                        ada=true;
                                        beli.tambahMakanan(menu[i]);
                                        break;
                                    }
                                }
                                if(ada=false){
                                    System.out.println("Menu tidak ada");
                                }
                                break;
                            case 3:
                                System.out.print("Menu hapus  : ");
                                String hps = sc.next();
                                beli.hpsMakanan(hps);
                                break;
                            case 4:
                                beli.lihatMakanan();
                                break;
                            case 5:
                                System.out.println("Kembali ke menu utama");
                                break;
                        }
                    }while(pilihb!=5);
                    break;
                case 4:
                    System.out.println("Terima kasih");
                    break;
            }
        }while(pilih!=4);
    }
}
