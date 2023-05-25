import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<String>buah=new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        boolean hasil=true;
        
       while(hasil){
        System.out.println("Membuat CRUD sederhana");
        System.out.println("Menu:");
        System.out.println("1.tambah data");
        System.out.println("2.hapus data");
        System.out.println("3.update data");
        System.out.println("4.lihat data");
        System.out.println("5 keluar");
        System.out.print("Pilih Menu:");
        Integer a=scan.nextInt();
        switch(a){
            case 1->  tambahData(scan);
            case 2-> hapusData(scan);
            case 3 -> updateData(scan);
            case 4->lihatData(scan);
            case 5 -> hasil=false;
           
        }
       System.out.println("---------------------------");
        if(hasil){
            System.out.print("apakah ada yang lain:");
            String cek=scan.next();
            if(cek.equalsIgnoreCase("tidak")){
                hasil=false;
            }
        }

       }
       
        
    }
    //untuk tambah data
    public static void tambahData(Scanner scan) {
        System.out.print("masukan data:");
        String b=scan.next();
        buah.add(b);
        System.out.println("data berhasil ditambah");
        
    }
    //untuk hapus data
    public static void hapusData(Scanner scan) {
        System.out.print("masukan data yang akan di hapus:");
         String b=scan.next();
         buah.remove(b);
         System.out.println("data berhasil di hapus");
    }
    //untuk update data
    public static void updateData(Scanner scan) {
        System.out.print("masukan index yang inggin di update");
        int d=scan.nextInt();
        //cek apakah indexnya benar
        if(d>=0 && d<buah.size()){
            System.out.print("masukan data baru:");
            String e=scan.next();
            buah.set(d,e);
            System.out.println("berhasil di update");
        }else{
            System.out.println("index yang anda masukan salah");
        }

    }
    public static void lihatData(Scanner scan) {
        System.out.println("daftar buah");
        for(int i=0;i<buah.size();i++){
            System.out.println(i+":"+buah.get(i));
        }
    }

}


