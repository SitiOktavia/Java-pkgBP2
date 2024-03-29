package pkgFinalProjectUAS;
public class cDaftarTransaksi { //linked list queue
    cTransaksi front, rear; //simpul untuk menyimpan posisi depan belakang dari daftar transaksi
    int jumlah; //mendata jumlah transaksi yg masuk atau mendata jumlah biaya yang dibelanjakan
    cDaftarTransaksi(){ //default konstruktor
        front=rear=null;
        jumlah=0;
    }
    public cTransaksi getFront(){   //method untuk mengakses getter front untuk sambung transaksi
        return front;
    }
    public cTransaksi getRear(){
        return rear;
    }
    public void tambahTransaksi(cTransaksi baru){   //method
        if(rear==null){
            front=rear=baru;
        }
        else{
            rear.next=baru;
            rear=baru;
        }
        System.out.println("Penambahan sukses");
    }
    public void lihatTransaksi(){   //method
        int i=1;
        double total=0;
        System.out.println("Daftar Transaksi : ");
        for (cTransaksi t = front; t != null; t=t.next) {
            System.out.print(i+".");
            System.out.print(t.getKode()+"-");
            System.out.print(t.getPembeli()+"-");
            System.out.print(t.getBarang().getNama()+"-");  //akses object barang kemudian nama barang
            System.out.print(t.getJumlah()+"-");
            System.out.println(t.getStatus());
            i++;
            total=total+(t.getBarang().getHarga()*t.getJumlah());
        }
        System.out.println("Total Belanja   : "+total);
        System.out.println("Jumlah dibayar  : "+total);
    }
    public void lihatTransaksiMember(){
        int i=1;
        double total=0, diskon;
        System.out.println("Daftar Transaksi Member: ");
        for (cTransaksi t = front; t != null; t=t.next) {
            System.out.print(i+".");
            System.out.print(t.getKode()+"-");
            System.out.print(t.getPembeli()+"-");
            System.out.print(t.getBarang().getNama()+"-");  //akses object barang kemudian nama barang
            System.out.print(t.getJumlah()+"-");
            System.out.println(t.getStatus());
            i++;
            total=total+(t.getBarang().getHarga()*t.getJumlah());
        }
        System.out.println("Total Belanja   : "+total);
        System.out.println("Diskon          : "+(0.1*total));
        System.out.println("Jumlah dibayar  : "+(total-(0.1*total)));
    }
    public double lihatPemasukanMember2201(){
        cTransaksi t=front;
        double nominal=0;
        double total10=0;
        for(; t!=null; t=t.next){
            if(t.getStatus()==1 && t.getPembeli().compareToIgnoreCase("10")==0){
                //tambahkan sendiri cek member berdasarkan nama/kode pembeli
                nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                    nominal=nominal-(0.1*nominal);
                    total10=total10+nominal;
                    nominal=0;   
            }
        }
        return total10;
    }
    public double lihatPemasukanMember2202(){
        cTransaksi t=front;
        double nominal=0;
        double total11=0;
        for(; t!=null; t=t.next){
            if(t.getStatus()==1 && t.getPembeli().compareToIgnoreCase("11")==0){
                //tambahkan sendiri cek member berdasarkan nama/kode pembeli
                nominal=nominal+t.getBarang().getHarga()*t.getJumlah();               
                    nominal=nominal-(0.1*nominal);
                    total11=total11+nominal;
                    nominal=0;               
            }
        }
        return total11;
    }
    public double lihatPemasukanMember2203(){
        cTransaksi t=front;
        double nominal=0;
        double total12=0;
        for(; t!=null; t=t.next){
            if(t.getStatus()==1 && t.getPembeli().compareToIgnoreCase("12")==0){
                //tambahkan sendiri cek member berdasarkan nama/kode pembeli
                nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                
                    nominal=nominal-(0.1*nominal);
                    total12=total12+nominal;
                    nominal=0;
                
            }
        }
        return total12;
    }
    public void hapusTransaksi(int nomor){  //method
        cTransaksi t=front; //simpul temporary t
        cTransaksi prev=null;   //simpul prev
        int i=1;
        if(nomor==1){   //hapus posisi terdepan
            if(t.next==null){   //transaksi tinggal 1
                front=rear=null;
            }
            else{
                front=front.next;
                t.next=null;
            }
            System.out.println("["+t.getBarang().getNama()+"] dihapus");
        }
        else{
            for (; t!=null; t=t.next) { //pencarian no yg dihapus
                if(i==nomor){
                    break;
                }
                i++;
                prev=t; //prev menyimpan posisi simpul sebelum yang akan dihapus
            }
            //yg dihapus di ujung belakang
            if(t.next==null){   //di posisi ekor/belakang/rear
                rear=prev;
                rear.next=null;
            }
            else{
                prev.next=t.next;
                t.next=null;
            }
            System.out.println("["+t.getBarang().getNama()+"] dihapus");
        }
    }
    public void sambungTransaksi(cTransaksi depan, cTransaksi belakang){ //method, menghubungkan transaksi pembeli dengan transaksi di toko
        //sambungkan transaksi
        if(rear==null){ //transaksi toko masih kosong
            front=depan;
            rear=belakang;
        }
        else{
            //sambungkan transaksi
            rear.next=depan;
            //update posisi rear yg baru
            rear=belakang;
        }
    }
    public void prosesTransaksi(cTransaksi t){  //method mengubah status
        t.setStatus(1);
    }
    public void prosesTransaksiMember(cTransaksi t){
        //mendapatkan diskon
    }
    public int lihatDiproses(){
        cTransaksi t=front;
        int proses=0;
        for(; t!=null; t=t.next){
            if(t.getStatus()==1){
                proses++;
            }
        }
        return proses;
    }
    public int lihatBelumDiproses(){
        cTransaksi t=front;
        int proses=0;
        for(; t!=null; t=t.next){
            if(t.getStatus()==0){
                proses++;
            }
        }
        return proses;
    }
   public double lihatPemasukan(){
        cTransaksi t=front;
        double nominal=0;
        double total=0;
        for(; t!=null; t=t.next){
            if(t.getStatus()==1){
                //tambahkan sendiri cek member berdasarkan nama/kode pembeli
                nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                if(t.getPembeli().compareToIgnoreCase("10")==0||t.getPembeli().compareToIgnoreCase("11")==0||t.getPembeli().compareToIgnoreCase("12")==0){
                    nominal=nominal-(0.1*nominal);
                }  
                
                                
            }
            total=total+nominal;
            nominal=0;
        }
        return total;
   }
    public double lihatPemasukanYangBelumDiproses(){
        cTransaksi t=front;
        double nominal=0;
        double total=0;
        for(; t!=null; t=t.next){
            if(t.getStatus()==0){
                //tambahkan sendiri cek member berdasarkan nama/kode pembeli
                nominal=nominal+t.getBarang().getHarga()*t.getJumlah();
                if(t.getPembeli().compareToIgnoreCase("10")==0||t.getPembeli().compareToIgnoreCase("11")==0||t.getPembeli().compareToIgnoreCase("12")==0){
                    nominal=nominal-(0.1*nominal);
                }  
                                
            }
            total=total+nominal;
            nominal=0;
        }
        return total;
   }
}