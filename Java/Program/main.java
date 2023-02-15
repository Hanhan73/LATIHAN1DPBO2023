/* Saya Farhan Muzhaffar Tiras Putra NIM 2105879 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin. */

// import library
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.lang.*;

//deklarasi class main
public class main{
    public static void main(String[] args){

        // deklrasi variabel
        int i, n = 0;
        String nim, nama, prodi, fakultas;

        // deklrasi list menggunakan library
        ArrayList<Mahasiswa> list = new ArrayList<>();

        //deklarasi scanner untuk input
        Scanner sc = new Scanner(System.in);

        /*looping while dengan syarat masukkan user bukan 5 yang berarti exit dari program
        looping ini bekerja untuk menentukan apa yang diinginkan oleh user, ada 5 query yaitu create, read, update dan exit
        untuk menentukan query yang sesuai dengan yang diminta user saya menggunakan switch yang sesuai dengan menu,
        1 untuk create, 2 untuk read, 3 untuk update, 4 untuk delete, dan 5 untuk exit*/
        while(n != 5){

            // menampilkan menu
            System.out.println("Program Informasi Daftar Mahasiswa");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Masukkan Query yang diinginkan: ");

            // meminta masukkan query berapa yang diinginkan user
            n = sc.nextInt();
            sc.nextLine();

            // switch untuk menentukan query yang diinginkan user
            switch(n) {
                // case 1 untuk create
                case 1:

                    // meminta masukkan user untuk menambahkan data baru
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    nim = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan Prodi Mahasiswa: ");
                    prodi = sc.nextLine();
                    System.out.print("Masukkan Fakultas Mahasiswa: ");
                    fakultas = sc.nextLine();

                    // instansiasi object tanpa parameter
                    Mahasiswa temp = new Mahasiswa();

                    // inputan user dimasukkan ke dalam temp dulu menggunakan setter masing-masing attribut
                    temp.set_nim(nim);
                    temp.set_nama(nama);
                    temp.set_prodi(prodi);
                    temp.set_fakultas(fakultas);

                    // objek dimasukkan ke dalam list
                    list.add(temp);

                    System.out.println("");
                    System.out.println("DATA BARU BERHASIL DITAMBAHKAN!");
                    
                    break;
                 // case 2 untuk read
                case 2:

                  //deklarasi boolean untuk mengetahui kosong atau tidak list
                  boolean isEmpty = list.isEmpty();
                  // cek terlebih dahulu apakah list kosong atau tidak
                  if(isEmpty == true){
                      System.out.println("DATA MAHASISWA KOSONG!");
                    
                  }else{
                    // menampilkan isi dari list dengan looping for dan setiap attributnya ditampilkan dengan memanggil getter masing-masing attribut
                    for(i = 0; i < list.size(); i++){
                      System.out.println(Integer.toString(i+1)+". " + "NIM          : " + list.get(i).get_nim());
                      System.out.println("   Nama         : " + list.get(i).get_nama());
                      System.out.println("   Prodi        : " + list.get(i).get_prodi());
                      System.out.println("   Fakultas     : " + list.get(i).get_fakultas());
                      System.out.println("");
                    }
                  }
                    break;
                    
                case 3:
                  //deklarasi boolean untuk mengetahui kosong atau tidak list
                  isEmpty = list.isEmpty();
                  //deklarasi boolean untuk mengetahui sudah ketemu atau belum NIM
                  boolean isFound = false;

                  // cek terlebih dahulu apakah list kosong atau tidak
                  if(isEmpty == true){
                      System.out.println("DATA MAHASISWA KOSONG!");
                  }
                  else{
                    String cari;
                    System.out.print("Masukkan NIM Mahasiswa yang akan di-Update: ");

                    // meminta masukkan usuer untuk nim yang akan dicari dan akan di-update
                    cari = sc.nextLine();

                    // looping untuk mencari nim yang diminta oleh user
                    // jika data ditemukan maka user diminta untuk memasukkan data baru yang akan diubah
                    for(i = 0; i < list.size(); i++){
                    if(cari.compareTo(list.get(i).get_nim()) == 0){

                            System.out.print("Masukkan NIM Mahasiswa: ");
                            nim = sc.nextLine();
                            System.out.print("Masukkan Nama Mahasiswa: ");
                            nama = sc.nextLine();
                            System.out.print("Masukkan Prodi Mahasiswa: ");
                            prodi = sc.nextLine();
                            System.out.print("Masukkan Fakultas Mahasiswa: ");
                            fakultas = sc.nextLine();

                            temp = new Mahasiswa();
                            temp.set_nim(nim);
                            temp.set_nama(nama);
                            temp.set_prodi(prodi);
                            temp.set_fakultas(fakultas);
                            list.set(i, temp);

                            // isFound berubah karena nim berhasil ditemukan
                            isFound = true;
                      }
                    }
                  }
                  
                  // jika nim ditemukan dan jika tidak ditemukan
                  if(isFound == true){
                      System.out.println("DATA BERHASIL DI-UPDATE!");
                  }
                  else{
                      System.out.println("DATA TIDAK DAPAT DITEMUKAN!");
                  }
                    break;
                    
                case 4:
                  isEmpty = list.isEmpty();
                  isFound = false;
                  String cari;

                  // cek terlebih dahulu apakah list kosong atau tidak
                  if(isEmpty == true){
                      System.out.println("DATA MAHASISWA KOSONG!");
                  }
                  else{

                    // meminta masukkan usuer untuk nim yang akan dicari dan akan di-delete
                    System.out.print("Masukkan NIM Mahasiswa yang akan di-Delete: ");
                    cari = sc.nextLine();

                    // looping untuk mencari nim yang diminta oleh user
                    // jika data ditemukan maka user diminta untuk memasukkan data baru yang akan dihapus
                    for(i = 0; i < list.size(); i++){
                        if(cari.compareTo(list.get(i).get_nim()) == 0){
                                list.remove(i);
                                // isFound berubah karena nim berhasil ditemukan
                                isFound = true;
                              }
                            }
                          }
                          
                  // jika nim ditemukan dan jika tidak ditemukan
                  if(isFound == true){
                      System.out.println("DATA BERHASIL DI-DELETE!");
                  }
                  else{
                      System.out.println("DATA TIDAK DAPAT DITEMUKAN!");
                  }
                    break;
                default:
                System.out.println("TERIMA KASIH!");

                    break;
            }
        }
    }
}
