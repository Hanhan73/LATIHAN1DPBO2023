# Saya Farhan Muzhaffar Tiras Putra NIM 2105879 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
# untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
# Aamiin.

# import class dari file
from Mahasiswa import Mahasiswa

# deklrasi variabel
i = 0
isFound = False

# deklarasi array
mhs = []
# looping while dengan syarat masukkan user bukan 5 yang berarti exit dari program
# looping ini bekerja untuk menentukan apa yang diinginkan oleh user, ada 5 query yaitu create, read, update dan exit
# untuk menentukan query yang sesuai dengan yang diminta user saya menggunakan fungsi if else (untuk python) yang sesuai dengan menu,
# 1 untuk create, 2 untuk read, 3 untuk update, 4 untuk delete, dan 5 untuk exit
while i != 5:

    # menampilkan menu

    print("")
    print("Program Informasi Daftar Mahasiswa")
    print("1. Create")
    print("2. Read")
    print("3. Update")
    print("4. Delete")
    print("5. Exit")
    print("Masukkan Query yang diinginkan:")

    # meminta masukkan query berapa yang diinginkan user
    i = int(input())
    print("")

    #  if else untuk menentukan query yang diinginkan user

    # input 1 untuk create
    if i == 1:

        #  meminta masukkan user untuk menambahkan data baru
        print("Masukkan NIM Mahasiswa: ")
        nim = str(input())
        print("Masukkan Nama Mahasiswa: ")
        nama = str(input())
        print("Masukkan Prodi Mahasiswa: ")
        prodi = str(input())
        print("Masukkan Fakultas Mahasiswa: ")
        fakultas = str(input())
        #  objek dimasukkan ke dalam array

        mhs.append(Mahasiswa(nim, nama, prodi, fakultas))
        print("DATA BARU BERHASIL DITAMBAHKAN!")

    # input 2 untuk read

    elif i == 2:
        #  cek terlebih dahulu apakah list kosong atau tidak

        if not mhs:
            print("DATA MAHASISWA KOSONG!")
        else:
            #  menampilkan isi dari list dengan looping for dan setiap attributnya ditampilkan dengan memanggil getter masing-masing attribut

            n = 1
            for Mhs in mhs:
                print("Data Lengkap Mahasiswa: ")
                print(n, end=". ")
                print("NIM          :", Mhs.get_nim())
                print("   Nama         :", Mhs.get_nama())
                print("   Prodi        :", Mhs.get_prodi())
                print("   Fakultas     :", Mhs.get_fakultas())
                n += 1

    # input 3 untuk update
    elif i == 3:
        #  cek terlebih dahulu apakah list kosong atau tidak

        if not mhs:
            print("DATA MAHASISWA KOSONG!")
        else:
            #  meminta masukkan usuer untuk nim yang akan dicari dan akan di-update
            print("Masukkan NIM Mahasiswa yang akan di-Update: ")
            cari = str(input())

            #  looping untuk mencari nim yang diminta oleh user
            #  jika data ditemukan maka user diminta untuk memasukkan data baru yang akan diubah
            for Mhs in mhs:
                if cari == Mhs.get_nim():
                    print("Masukkan NIM Mahasiswa: ")
                    nim = str(input())
                    print("Masukkan Nama Mahasiswa: ")
                    nama = str(input())
                    print("Masukkan Prodi Mahasiswa: ")
                    prodi = str(input())
                    print("Masukkan Fakultas Mahasiswa: ")
                    fakultas = str(input())

                    Mhs.set_nim(nim)
                    Mhs.set_nama(nama)
                    Mhs.set_prodi(prodi)
                    Mhs.set_fakultas(fakultas)

                    #  isFound berubah karena nim berhasil ditemukan
                    isFound = True

            #  jika nim ditemukan dan jika tidak ditemukan
            if isFound == True:
                print("DATA BERHASIL DI-UPDATE!")
            else:
                print("DATA TIDAK DAPAT DITEMUKAN!")

    # input 4 untuk delete
    elif i == 4:
        #  cek terlebih dahulu apakah list kosong atau tidak

        if not mhs:
            print("DATA MAHASISWA KOSONG!")
        else:
            #  meminta masukkan usuer untuk nim yang akan dicari dan akan di-delete
            print("Masukkan NIM Mahasiswa yang akan di-Delete: ")
            cari = str(input())
            n = 0
            #  looping untuk mencari nim yang diminta oleh user
            #  jika data ditemukan maka user diminta untuk memasukkan data baru yang akan dihapus
            for Mhs in mhs:

                if cari == Mhs.get_nim():
                    mhs.pop(n)
                    #  isFound berubah karen nim berhasil ditemukan
                    isFound = True
                n += 1

            #  jika nim ditemukan dan jika tidak ditemukan
            if isFound == True:
                print("DATA BERHASIL DI-DELETE!")
            else:
                print("DATA TIDAK DAPAT DITEMUKAN!")
    else:
        print("TERIMA KASIH!")
