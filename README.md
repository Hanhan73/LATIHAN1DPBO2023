# LATIHAN1DPBO2023

## Janji
 Saya Farhan Muzhaffar Tiras Putra NIM 2105879 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
 untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. 
 Aamiin.
 
## Soal
  Buatlah program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang menampilkan informasi daftar mahasiswa (sekumpulan objek mahasiswa) dan memiliki fitur menambah, mengubah, dan menghapus data. Setiap mahasiswa memiliki data nama, NIM, program studi, fakultas, dan foto profil (khusus bahasa PHP).

## Design Program menggunakan class diagram

![image](https://user-images.githubusercontent.com/96176429/219071333-eca1a3ff-4dea-46fc-9693-d16addfe9afd.png)

A. Class Mahasiswa:

* Atribut:

  - nim = NIM Mahasiswa
  - nama = Nama Mahasiswa
  - prodi = Program Studi Mahasiswa
  - fakultas = Fakultas Mahasiswa

* Method:
  - get_nim() = mendapatkan nim
  - get_nama() = mendapatkan nama
  - get_prodi() = mendapatkan prodi
  - get_fakultas() = mendapatkan fakultas
  - set_nim() = menetapkan value nim
  - set_nama() = menetapkan value nama
  - set_prodi() = menetapkan value prodi
  - set_fakultas() = menetapkan value fakultas

## Alur Program
A. Program dibuka atau dijalankan
 > Ketika program pertama kali dijalankan maka akan keluar sebuah menu yang berisi 5 pilihan yaitu Create, Read, Update, Delete dan Exit

B. Ketika memilih salah satu query
 1. Create
  > User akan diminta untuk memasukkan masukkan seperti NIM, Nama, Prodi, dan Fakultas jika berhasil maka akan mengeluarkan text berhasil
 2. Read
  > Program akan menampilkan semua data mahasiswa yang sudah dimasukkan user     
 3. Update
  > User akan diminta untuk memasukkan NIM mana yang akan diganti. Jika NIM tersebut ditemukan maka user akan diminta kembali untuk memasukkan masukkan seperti NIM, Nama, Prodi, dan Fakultas untuk diupdate dengan data tersebut. Jika berhasil maka akan keluar text berhasil. Jika NIM tidak ditemukan maka akan mengeluarkan text NIM tidak ditemukan
 4. Delete
  > User akan diminta untuk memasukkan NIM mana yang nantinya akan dihapus. Jika ditemukan maka object yang NIM nya itu akan dihapus. Jika tidak ditemukan maka akan mengeluarkan text tidak ditemukan
 5. Exit
  > User akan keluar dari Program
        
 ## Dokumentasi
 - Menu
 
 ![Menu](https://user-images.githubusercontent.com/96176429/219078351-3e06abed-b479-42eb-99f0-5395a13f89c1.png)
 
 - Create
 
 ![Create](https://user-images.githubusercontent.com/96176429/219078513-84a6d847-e0de-47a5-afbb-3de6cdcf6069.png)
 
 - Read
 
 ![Read](https://user-images.githubusercontent.com/96176429/219078550-75266490-d685-4006-956e-d5579c991a14.png)
 
 - Update
 
 ![Update](https://user-images.githubusercontent.com/96176429/219078587-596d9712-bb07-4d82-a71b-b9ef3bbe79ca.png)

 - Delete
 
 ![Delete](https://user-images.githubusercontent.com/96176429/219078630-a053a6bc-91f0-4adc-8f09-9d562a947727.png)

 - Exit
 
 ![Exit](https://user-images.githubusercontent.com/96176429/219078665-89156d4b-613a-40d8-b92d-3ddc8dbcc709.png)

 
