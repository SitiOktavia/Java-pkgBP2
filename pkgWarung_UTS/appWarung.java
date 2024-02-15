package pkgWarung_UTS;
import java.util.Scanner;
public class appWarung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih=0;                
        cPembeli pb = new cPembeli("");
        cTransaksi transaksi = new cTransaksi(100);
        String menuM[]=new String[100];
        int incM[]=new int[100];
        String menuN[]=new String[100];
        int incN[]=new int[100];        
        int porsiM[]=new int[100];
        int porsiN[]=new int[100];
        int iporM=0, iporN=0;
        int totalInc=0;
        int inCM[]=new int[50];
        int inCN[]=new int[50];
        for (int i = 0; i < 50; i++) {
            inCM[i]=0;
            inCN[i]=0;
        }
        
        int idxMKN=7;
        cMakanan menuMKN[] = new cMakanan [50];
        menuMKN[0] = new cMakanan ("Seblak Original",10000);
        menuMKN[1] = new cMakanan ("Seblak Komplit",15000);
        menuMKN[2] = new cMakanan ("Mie Lava        ",10000);
        menuMKN[3] = new cMakanan ("Mie Magma       ",10000);
        menuMKN[4] = new cMakanan ("Bakso Aci       ",18000);
        menuMKN[5] = new cMakanan ("Bakso Aci Gledek",20000);
        menuMKN[6] = new cMakanan ("Bakso Aci Tulang",20000);
        menuMKN[7] = new cMakanan ("Risol Mayo      ",10000);
        
        int idxMNM=15;
        cMinuman menuMNM[] = new cMinuman [50];
        menuMNM[0] = new cMinuman ("Original",7000);
        menuMNM[1] = new cMinuman ("Dark Choco",9000);
        menuMNM[2] = new cMinuman ("VanillaBlue",9000);
        menuMNM[3] = new cMinuman ("Cappucino",9000);
        menuMNM[4] = new cMinuman ("Moccacino",9000);
        menuMNM[5] = new cMinuman ("Thai Tea",9000);
        menuMNM[6] = new cMinuman ("Green Tea",9000);
        menuMNM[7] = new cMinuman ("Red Velvet",9000);
        menuMNM[8] = new cMinuman ("Tiramisu",9000);
        menuMNM[9] = new cMinuman ("Strawberry",9000);
        menuMNM[10] = new cMinuman ("Blueberry",9000);
        menuMNM[11] = new cMinuman ("Banana",9000);
        menuMNM[12] = new cMinuman ("Avocado",9000);
        menuMNM[13] = new cMinuman ("Grape",9000);
        menuMNM[14] = new cMinuman ("Taro   ",9000);
        menuMNM[15] = new cMinuman ("Almond",10000);
        
        String nama = "xinchao";
        int pin = 928374;
        boolean nmT = false;
        boolean pT = false;
        do{
        System.out.println("=================== WELCOME ===================");
        System.out.println("LOGIN");
        System.out.print("=>  Nama :");
        String nm = sc.next();   
        System.out.print("=>  PIN  :");
        int P = sc.nextInt();
        if(nm.equals(nama)){
            nmT=true;
        }else{
            System.out.println("Nama yang dimasukkan salah!");
            nmT=false;
        }if(P==pin){
            pT = true;
        }else{
            System.out.println("PIN yang dimasukkan salah!");   
            pT = false;
        }
        if(nmT==true&&pT==true){
        System.out.println("================== XIN CHAO ==================");
        do{
        System.out.println("MENU UTAMA"
                        +"\n1. Master Menu Sajian"
                        +"\n2. Transaksi"
                        +"\n3. Selesai");
        System.out.print(" Pilih => ");
        pilih = sc.nextInt();
        System.out.println("");
        switch(pilih){
            case 1:
                int pilihMM=0;
                do{
                System.out.println("------------- Master Menu Sajian -------------");
                System.out.println("1.  Master Menu Makanan");
                System.out.println("2.  Master Menu Minuman");
                System.out.println("3.  Kembali ke menu utama");
                System.out.print("  Pilih   =>  ");
                pilihMM=sc.nextInt();
                System.out.println("");
                switch(pilihMM){
                    case 1:
                        int pilihMMKN=0;
                        do{
                            System.out.println("------------ Master Menu Makanan -------------");
                            System.out.println("1.  Tambah Menu Makanan");
                            System.out.println("2.  Ubah Menu Makanan");
                            System.out.println("3.  Hapus Menu Makanan");
                            System.out.println("4.  Lihat Menu Makanan");
                            System.out.println("5.  Kembali");
                            System.out.print("  Pilih =>  ");
                            pilihMMKN = sc.nextInt();
                            System.out.println("");
                            switch(pilihMMKN){
                                case 1:
                                    System.out.println("             Tambah Menu Makanan ");
                                    System.out.print("Masukkan nama menu  : ");
                                    String nMKN1 = sc.next();
                                    String nMKN2 = sc.nextLine();
                                    String nMKN = nMKN1 + nMKN2;
                                    System.out.print("Masukkan harga menu : ");
                                    int hMKN = sc.nextInt();
                                    System.out.println("\nPastikan data yang Anda masukkan sudah benar"
                                                    +  "\n1. Lanjut                2.Batal");
                                    System.out.print(" Pilih    => ");
                                    int lanjut = sc.nextInt();
                                    if(lanjut==1){
                                    menuMKN[idxMKN+1] = new cMakanan (nMKN,hMKN);
                                    idxMKN++;  
                                    System.out.println("Penambahan berhasil");
                                    }
                                    System.out.println("");  
                                    break;
                                case 2:
                                    System.out.println("             Ubah Menu Makanan ");
                                    System.out.print("Cari menu yang akan diubah : ");
                                    String crubah1 = sc.next();
                                    String crubah2 = sc.nextLine();
                                    String crubah = crubah1 + crubah2;
                                    boolean ada=false;
                                    for (int i = 0; i <=idxMKN; i++) {
                                        if(crubah.equalsIgnoreCase(menuMKN[i].getNama())){
                                            ada=true;
                                            System.out.print("Ubah nama : ");
                                            String ubahN1 = sc.next();
                                            String ubahN2 = sc.nextLine();
                                            String ubahN = ubahN1 + ubahN2;
                                            System.out.print("Ubah harga: Rp");
                                            int ubahH = sc.nextInt();                 
                                            System.out.println("\nPastikan data yang Anda masukkan sudah benar"
                                                    +  "\n1. Lanjut                2.Batal");
                                            System.out.print(" Pilih    => ");
                                            lanjut = sc.nextInt();
                                            if(lanjut==1){
                                            menuMKN[i] = new cMakanan (ubahN,ubahH);
                                            System.out.println("Pengubahan berhasil");
                                            }
                                            System.out.println("");
                                            break;
                                        }
                                    }
                                    if(ada==false){
                                        System.out.println("Menu tidak ada!");
                                    }
                                    System.out.println("");
                                    break;
                                case 3:
                                    boolean adaH=false;
                                    System.out.print("Cari menu yang akan dihapus : ");
                                    String hps1 = sc.next();
                                    String hps2 = sc.nextLine();
                                    String hps = hps1 + hps2;
                                    System.out.println("\nPastikan data yang Anda masukkan sudah benar"
                                                    +  "\n1. Lanjut                2.Batal");
                                    System.out.print(" Pilih    => ");
                                    lanjut = sc.nextInt();
                                    if(lanjut==1){
                                        for (int i = 0; i <= idxMKN; i++) {
                                            if(hps.equalsIgnoreCase(menuMKN[i].getNama())){
                                                adaH=true;
                                                menuMKN[i] = null;
                                                for (int j = i; j < idxMKN+1; j++) {
                                                    if(j==idxMKN){
                                                        menuMKN[j]=null;
                                                    }else{
                                                        menuMKN[j] = menuMKN[j+1];
                                                    }
                                                }
                                            idxMKN--;
                                            System.out.println("Penghapusan berhasil");
                                            break;
                                            }                                            
                                        }
                                    }
                                    if(adaH==false){
                                        System.out.println("Makanan tidak ada!");
                                    }
                                    break;
                                case 4:
                                    System.out.println("------------ Daftar Menu Makanan ------------");
                                    System.out.println("  MENU                                  Harga");
                                    for (int i = 0; i <=idxMKN; i++) {
                                        System.out.println(i+1+"."+menuMKN[i].ToString());                                        
                                    }
                                    System.out.println("");
                                    break;
                                case 5:
                                    break;
                            }
                        }while(pilihMMKN!=5);
                        break;
                    case 2:
                         int pilihMMNM=0;
                        do{
                            System.out.println("------------ Master Menu Minuman -------------");
                            System.out.println("1.  Tambah Menu Minuman");
                            System.out.println("2.  Ubah Menu Minuman");
                            System.out.println("3.  Hapus Menu Minuman");
                            System.out.println("4.  Lihat Menu Minuman");
                            System.out.println("5.  Kembali");
                            System.out.print("  Pilih =>  ");
                            pilihMMNM = sc.nextInt();
                            System.out.println("");
                            switch(pilihMMNM){
                                case 1:
                                    System.out.println("             Tambah Menu Minuman ");
                                    System.out.print("Masukkan nama menu  : ");
                                    String nMNM1 = sc.next();
                                    String nMNM2 = sc.nextLine();
                                    String nMNM = nMNM1 + nMNM2;
                                    System.out.print("Masukkan harga menu : ");
                                    int hMNM = sc.nextInt();
                                    System.out.println("\nPastikan data yang Anda masukkan sudah benar"
                                                    +  "\n1. Lanjut                2.Batal");
                                    System.out.print(" Pilih    => ");
                                    int lanjut = sc.nextInt();
                                    if(lanjut==1){
                                    menuMNM[idxMNM+1] = new cMinuman (nMNM,hMNM);
                                    idxMNM++;
                                    System.out.println("Penambahan berhasil");
                                    }
                                    System.out.println("");
                                    break;
                                case 2:
                                    System.out.println("             Ubah Menu Minuman ");
                                    System.out.print("Cari menu yang akan diubah : ");
                                    String crubah1 = sc.next();
                                    String crubah2 = sc.nextLine();
                                    String crubah = crubah1 + crubah2;
                                    boolean ada=false;                             
                                        for (int j = 0; j <=idxMNM; j++) {
                                            if(crubah.equalsIgnoreCase(menuMNM[j].getNama())){
                                                ada=true;
                                                System.out.print("Ubah nama : ");
                                                String ubahN1 = sc.next();
                                                String ubahN2 = sc.nextLine();
                                                String ubahN = ubahN1 + ubahN2;
                                                System.out.print("Ubah harga: Rp");
                                                int ubahH = sc.nextInt();           
                                                System.out.println("\nPastikan data yang Anda masukkan sudah benar"
                                                                +  "\n1. Lanjut                2.Batal");
                                                System.out.print(" Pilih    => ");
                                                lanjut = sc.nextInt();
                                                if(lanjut==1){                                    
                                                menuMNM[j] = new cMinuman (ubahN,ubahH);
                                                System.out.println("");
                                                System.out.println("Pengubahan berhasil");
                                                }
                                                System.out.println("");
                                            break;
                                            }
                                            
                                        }                                    
                                    if(ada==false){
                                        System.out.println("Menu tidak ada!");
                                    }
                                    
                                    System.out.println("");
                                    break;
                                case 3:
                                    boolean adaH=false;
                                    System.out.print("Cari menu yang akan dihapus : ");
                                    String hps1 = sc.next();
                                    String hps2 = sc.nextLine();
                                    String hps = hps1 + hps2;
                                    System.out.println("\nPastikan data yang Anda masukkan sudah benar"
                                                    +  "\n1. Lanjut                2.Batal");
                                            System.out.print(" Pilih    => ");
                                            lanjut = sc.nextInt();
                                            if(lanjut==1){
                                                for (int i = 0; i <= idxMNM; i++) {
                                                    if(hps.equalsIgnoreCase(menuMNM[i].getNama())){
                                                        adaH=true;
                                                        menuMNM[i] = null;
                                                        for (int j = i; j < idxMNM+1; j++) {
                                                            if(j==idxMNM){
                                                                menuMNM[j]=null;
                                                            }else{
                                                                menuMNM[j] = menuMNM[j+1];
                                                            }
                                                        }
                                                        idxMNM--;
                                                        System.out.println("Penghapusan berhasil");
                                                        break;
                                                    }
                                                }
                                                if(adaH==false){
                                                    System.out.println("Makanan tidak ada!");
                                                }
                                            }
                                    break;
                                case 4:
                                    System.out.println("------------ Daftar Menu Minuman ------------");
                                    System.out.println("  MENU                           Harga");
                                    for (int i = 0; i <=idxMNM; i++) {
                                        System.out.println(i+1+"."+menuMNM[i].ToString());                                        
                                    }
                                    System.out.println("");
                                    break;
                                case 5:
                                    break;
                            }
                        }while(pilihMMNM!=5);
                        break;
                }
                }while(pilihMM!=3);
                break;
            case 2:
                int pilihT=0;
                do{
                    System.out.println("-------------- Menu Transaksi ---------------");
                    System.out.println("1.  Isi Pembeli"
                                    +"\n2.  Makanan"
                                    +"\n3.  Minuman"
                                    +"\n4.  Data pembelian"
                                    +"\n5.  Pembayaran"
                                    +"\n6.  Kembali ke menu utama");
                    System.out.print("  Pilih => ");
                    pilihT = sc.nextInt();
                    System.out.println("");
                    switch(pilihT){
                        case 1:
                            System.out.print("Masukkan nama pembeli : ");     
                            String pembeli = sc.next();
                            System.out.println("\nPastikan data yang Anda masukkan sudah benar"
                                              + "\n1. Lanjut                2.Batal");
                            System.out.print(" Pilih    => ");
                            int lanjut = sc.nextInt();
                            if(lanjut==1){
                            pb.setNama(pembeli);
                            System.out.println("\nIsi pembeli berhasil");
                            System.out.println("");
                            }
                            System.out.println("");
                            break;
                        case 2:
                            int pilihTM=0;
                            do{
                            System.out.println("-------------- Transaksi Makanan -------------");
                            System.out.println("1.  Tambah Makanan");
                            System.out.println("2.  Lihat Keranjang Makanan");
                            System.out.println("3.  Hapus Makanan");
                            System.out.println("4.  Selesai");
                            System.out.print("  Pilih => ");
                            pilihTM = sc.nextInt();
                            System.out.println("");
                            switch(pilihTM){
                                case 1:
                                    int tambah=1;
                                    do{
                                    System.out.println("-------------- Menu Makanan -------------");
                                    System.out.println("Menu                                    Harga");
                                    for (int i = 0; i <=idxMKN; i++) {
                                        System.out.println(i+1+". "+menuMKN[i].getNama()+"\t\t\tRp"+menuMKN[i].getHarga());
                                    }
                                    System.out.println("0. Selesai");
                                    System.out.print("  Pilih  => ");
                                    tambah = sc.nextInt();
                                    if(tambah<=idxMKN+1&&tambah!=0){  
                                        System.out.print("Jumlah porsi : ");
                                        porsiM[iporM] = sc.nextInt();
                                        transaksi.tambahMakanan(menuMKN[tambah-1],porsiM[iporM]);
                                        inCM[tambah-1]=inCM[tambah-1]+menuMKN[tambah-1].getHarga()*porsiM[iporM];  
                                        iporM++;
                                    }
                                    }while(tambah!=0);
                                    System.out.println("");
                                    break;
                                case 2:
                                    System.out.println("------------- Keranjang Makanan ------------");
                                    transaksi.lihatMakanan();
                                    System.out.println("");
                                    break;
                                case 3:
                                    System.out.print("Masukkan nama makanan yang ingin dihapus : ");
                                    String h1 = sc.next();
                                    String h2 = sc.nextLine();
                                    String h = h1+h2;                                    
                                    System.out.println("\nPastikan data yang Anda masukkan sudah benar"
                                                    +  "\n1. Lanjut                2.Batal");
                                    System.out.print(" Pilih    => ");
                                    lanjut = sc.nextInt();
                                    if(lanjut==1){
                                    transaksi.hpsMakanan(h,0);
                                    }
                                    break;
                            }
                            }while(pilihTM!=4);
                            break;
                        case 3:
                            int pilihTN=0;
                            do{
                            System.out.println("-------------- Transaksi Minuman -------------");
                            System.out.println("1.  Tambah Minuman");
                            System.out.println("2.  Lihat Keranjang Minuman");
                            System.out.println("3.  Hapus Minuman");
                            System.out.println("4.  Selesai");
                            System.out.print("  Pilih => ");
                            pilihTN = sc.nextInt();
                            System.out.println("");
                            switch(pilihTN){
                                case 1:
                                    int tambah=1;
                                    do{
                                    System.out.println("-------------- Menu Minuman -------------");
                                    System.out.println("Menu                                Harga");
                                    for (int i = 0; i <=idxMNM; i++) {
                                        System.out.println(i+1+". "+menuMNM[i].getNama()+"\t\t\t   Rp"+menuMNM[i].getHarga());
                                    }
                                    System.out.println("0. Selesai");
                                    System.out.print("  Pilih  => ");
                                    tambah = sc.nextInt();
                                    if(tambah<=idxMNM+1&&tambah!=0){        
                                        System.out.print("Jumlah porsi : ");
                                        porsiN[iporN] = sc.nextInt();
                                        transaksi.tambahMinuman(menuMNM[tambah-1],porsiN[iporN]); 
                                        inCN[tambah-1]=inCN[tambah-1]+menuMNM[tambah-1].getHarga()*porsiN[iporN];
                                        iporN++;
                                    }
                                    }while(tambah!=0);
                                    System.out.println("");
                                    break;
                                case 2:
                                    System.out.println("------------- Keranjang Minuman ------------");
                                    transaksi.lihatMinuman();
                                    System.out.println("");
                                    break;
                                case 3:
                                    System.out.print("Masukkan nama minuman yang ingin dihapus : ");
                                    String h1 = sc.next();
                                    String h2 = sc.nextLine();
                                    String h = h1+h2;                                    
                                    System.out.println("\nPastikan data yang Anda masukkan sudah benar"
                                                    +  "\n1. Lanjut                2.Batal");
                                    System.out.print(" Pilih    => ");
                                    lanjut = sc.nextInt();
                                    if(lanjut==1){
                                    transaksi.hpsMinuman(h,0);
                                    }
                                    break;
                            }
                            }while(pilihTN!=4);
                            break;
                        case 4:
                            System.out.println("-------------- Data Pembelian -------------");
                            transaksi.isiPembeli(pb);                            
                            System.out.println(pb.ToString());
                            System.out.println("                 MAKANAN");
                            transaksi.lihatMakanan();
                            System.out.println("                 MINUMAN");
                            transaksi.lihatMinuman();
                            transaksi.total();
                            break;
                        case 5:
                            transaksi.bayar();
                            break;
                    }
                }while(pilihT!=6);
                break;
            case 3:
                System.out.println("-------------- Total Pemasukan -------------");
                System.out.println("                   MAKANAN");
                for (int i = 0; i < idxMKN+1; i++) {
                    menuM[i] = menuMKN[i].getNama();
                    incM[i] = inCM[i];  
                }
                for (int j = 0; j < idxMKN+1; j++) {
                        for (int k = 0; k < idxMKN+1; k++) {
                            if(incM[k]<incM[k+1]){
                                int t = incM[k];
                                incM[k] = incM[k+1];
                                incM[k+1] = t;
                                String tm = menuM[k];
                                menuM[k] = menuM[k+1];
                                menuM[k+1] = tm;
                            }
                        }
                    }
                for (int i = 0; i < idxMKN+1; i++) {
                    System.out.println(i+1+". "+menuM[i]+"\t\t\tRp"+incM[i]);
                
                }
                System.out.println("                   MINUMAN");
                for (int i = 0; i < idxMNM+1; i++) {
                    menuN[i] = menuMNM[i].getNama();
                    incN[i] = inCN[i];                                        
                }
                for (int j = 0; j < idxMNM+1; j++) {
                        for (int k = 0; k < idxMNM+1; k++) {
                            if(incN[k]<incN[k+1]){
                                int t = incN[k];
                                incN[k] = incN[k+1];
                                incN[k+1] = t;
                                String tm = menuN[k];
                                menuN[k] = menuN[k+1];
                                menuN[k+1] = tm;
                            }
                        }
                    }
                for (int i = 0; i < idxMNM+1; i++) {
                    System.out.println(i+1+". "+menuN[i]+"\t\t\t\tRp"+incN[i]);
                }
                for (int i = 0; i < idxMKN+1; i++) {
                    totalInc=totalInc+inCM[i];
                }
                for (int i = 0; i < idxMNM+1; i++) {
                    totalInc=totalInc+inCN[i];
                }
                System.out.println("\nTotal Pemasukan  : Rp"+totalInc);
                System.out.println("");
                break;
        }
        }while(pilih!=3);
        }
        }while(nmT==false||pT==false);
    }
}
