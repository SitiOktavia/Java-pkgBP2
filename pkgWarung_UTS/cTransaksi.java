package pkgWarung_UTS;
import java.util.Scanner;
public class cTransaksi {
    Scanner sc = new Scanner(System.in);
    private cPembeli pembeli;
    private cMakanan makanan[];
    private cMinuman minuman[];
    private int porsiM[] = new int[50];
    private int porsiN[] = new int[50];    
    public int maxMKN, maxMNM, idxTM=0, idxTN=0,totalM=0, totalN=0, total=0,TporsiM=0,TporsiN=0;
    //constructor
    cTransaksi(int max){
        maxMKN = max; maxMNM = max;
        makanan = new cMakanan[maxMKN];
        minuman = new cMinuman[maxMNM];
        porsiM[0]=0; porsiN[0]=0;
    }
    public void isiPembeli(cPembeli p){
        pembeli = new cPembeli(p.getNama());
    }
    public void tambahMakanan(cMakanan m, int porsi){
        if(TporsiM>=maxMKN){
            System.out.println("Keranjang penuh!");
        }else{
            TporsiM=TporsiM+porsi;
            makanan[idxTM] = new cMakanan(m.getNama(),m.getHarga());
            int p = porsi;
            totalM = totalM + (makanan[idxTM].getHarga()*p);
            System.out.println("");
            System.out.println("Penambahan berhasil");
            System.out.println("Total   :  Rp"+totalM);
            System.out.println("\n");
            idxTM++;
            porsiM[idxTM]=porsiM[idxTM]+porsi;
        }
    }
    public void lihatMakanan(){
        if(idxTM<=0){
            System.out.println("Kosong!");
        }else{
            System.out.println("  Menu\t\t\tHarga\tPorsi\tTotal");
            for (int i = 0; i < idxTM; i++) {
                System.out.println(i+1+"."+makanan[i].getNama()+"\tRp"+makanan[i].getHarga()
                        +"   "+porsiM[i+1]+"\tRp"+makanan[i].getHarga()*porsiM[i+1]);
            }            
            System.out.println("\nTotal   :  Rp"+totalM);
            System.out.println("");
        }
    }
    public void hpsMakanan(String hps, int porsi){
        if(idxTM<=0){
            System.out.println("Keranjang kosong!");
        }else{
            boolean ada=false;
            for (int i = 0; i < idxTM; i++) {
                if(hps.equalsIgnoreCase(makanan[i].getNama())){
                    ada=true;
                    totalM = totalM-makanan[i].getHarga()*porsiM[i+1];
                    TporsiM=TporsiM-porsi;
                    makanan[i] = null;
                    for (int j = i; j < idxTM; j++) {
                        if(j==idxTM-1){
                            makanan[j]=null;
                        }else{
                            makanan[j] = makanan[j+1];
                            porsiM[j+1] = porsiM[j+2];
                        }
                    }
                    idxTM--;
                    System.out.println("\nPenghapusan berhasil");
                    System.out.println("");
                    break;
                }
            }
            if(ada==false){
                System.out.println("Makanan tidak ada!");
            }
        }
            
    }
    public void tambahMinuman(cMinuman m, int porsi){        
        if(TporsiN>=maxMNM){
            System.out.println("Keranjang penuh!");
        }else{
            TporsiN=TporsiN+porsi;
            minuman[idxTN] = new cMinuman(m.getNama(),m.getHarga());
            totalN = totalN + minuman[idxTN].getHarga()*porsi;
            System.out.println("");            
            System.out.println("Penambahan berhasil");
            System.out.println("Total   :  Rp"+totalN);
            System.out.println("\n");
            idxTN++;
            porsiN[idxTN]=porsiN[idxTN]+porsi;
        }
    }
    public void lihatMinuman(){
        if(idxTN<=0){
            System.out.println("Kosong!");
        }else{
            System.out.println("  Menu\t\t\tHarga\tPorsi\tTotal");
            for (int i = 0; i < idxTN; i++) {
                System.out.println(i+1+"."+minuman[i].getNama()+"\t\tRp"+minuman[i].getHarga()
                        +"   "+porsiN[i+1]+"\tRp"+minuman[i].getHarga()*porsiN[i+1]);
            }            
            System.out.println("\nTotal   :  Rp"+totalN);
            System.out.println("");
        }
    }
    public void hpsMinuman(String hps,int porsi){
        if(idxTN<=0){
            System.out.println("Keranjang kosong!");
        }else{
            boolean ada=false;
            for (int i = 0; i < idxTN; i++) {
                if(hps.equalsIgnoreCase(minuman[i].getNama())){
                    ada=true;
                    totalN = totalN-minuman[i].getHarga()*porsiM[i+1];
                    TporsiN=TporsiN-porsi;
                    minuman[i] = null;
                    for (int j = i; j < idxTN; j++) {
                        if(j==idxTN-1){
                            minuman[j]=null;
                        }else{
                            minuman[j] = minuman[j+1];
                            porsiN[j+1] = porsiN[j+2];
                        }
                    }
                    idxTN--;
                    System.out.println("Penghapusan berhasil");
                    System.out.println("");
                    break;
                }
            }
            if(ada==false){
                System.out.println("Minuman tidak ada!");
            }
        }
            
    }
    public void total(){
        total = totalN+totalM;
        System.out.println("Grand Total : Rp"+total);
    }
    public void bayar(){        
        System.out.println("Total yang harus dibayar    : Rp"+total);
        System.out.print("Masukkan nominal pembayaran : Rp");
        int bayar = sc.nextInt();
        int kembalian = bayar-total;
        System.out.println("Total kembalian : Rp"+kembalian);
        System.out.println("");
    }
}
