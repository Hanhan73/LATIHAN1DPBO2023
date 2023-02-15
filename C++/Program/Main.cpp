/* Saya Farhan Muzhaffar Tiras Putra NIM 2105879 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin. */

// import library dan file
#include <bits/stdc++.h>
#include <list>
#include "Mahasiswa.cpp"

int main()
{
    // deklrasi variabel
    int i, n = 0;
    string nim, nama, prodi, fakultas, cari;

    // deklrasi list menggunakan library
    list<Mahasiswa> lList;

    /*looping while dengan syarat masukkan user bukan 5 yang berarti exit dari program
    looping ini bekerja untuk menentukan apa yang diinginkan oleh user, ada 5 query yaitu create, read, update dan exit
    untuk menentukan query yang sesuai dengan yang diminta user saya menggunakan switch yang sesuai dengan menu,
    1 untuk create, 2 untuk read, 3 untuk update, 4 untuk delete, dan 5 untuk exit*/
    while (n != 5)
    {
        // instansiasi object tanpa parameter
        Mahasiswa temp;

        // menampilkan menu
        cout << '\n'
             << "Program Informasi Daftar Mahasiswa" << '\n';
        cout << "1. Create" << '\n';
        cout << "2. Read" << '\n';
        cout << "3. Update" << '\n';
        cout << "4. Delete" << '\n';
        cout << "5. Exit" << '\n';
        cout << "Masukkan Query yang diinginkan: ";

        // meminta masukkan query berapa yang diinginkan user
        cin >> n;
        cout << '\n';

        // switch untuk menentukan query yang diinginkan user
        switch (n)
        {
            // case 1 untuk create
        case 1:
            // meminta masukkan user untuk menambahkan data baru
            cout << "Masukkan NIM Mahasiswa: ";
            cin >> nim;
            cout << "Masukkan Nama Mahasiswa: ";
            cin >> nama;
            cout << "Masukkan Prodi Mahasiswa: ";
            cin >> prodi;
            cout << "Masukkan Fakultas Mahasiswa: ";
            cin >> fakultas;

            // inputan user dimasukkan ke dalam temp dulu menggunakan setter masing-masing attribut
            temp.set_nim(nim);
            temp.set_nama(nama);
            temp.set_prodi(prodi);
            temp.set_fakultas(fakultas);

            // objek dimasukkan ke dalam list
            lList.push_back(temp);

            cout << "DATA BARU BERHASIL DITAMBAHKAN!" << '\n';
            break;
            // case 2 untuk read
        case 2:

            // cek terlebih dahulu apakah list kosong atau tidak
            if (lList.empty())
            {
                cout << '\n'
                     << "DATA MAHASISWA KOSONG!" << '\n';
            }
            else
            {
                // menampilkan isi dari list dengan looping for dan setiap attributnya ditampilkan dengan memanggil getter masing-masing attribut
                i = 0;
                cout << "Data Lengkap Mahasiswa: ";

                for (list<Mahasiswa>::iterator it = lList.begin(); it != lList.end(); it++)
                {
                    cout << '\n'
                         << (i + 1) << '.' << " NIM           : " << it->get_nim() << '\n';
                    cout << "   Nama          : " << it->get_nama() << '\n';
                    cout << "   Program Studi : " << it->get_prodi() << '\n';
                    cout << "   Fakultas      : " << it->get_fakultas() << "\n";
                    i++;
                }
            }
            break;
            // case 3 untuk update
        case 3:
            // cek terlebih dahulu apakah list kosong atau tidak
            if (lList.empty())
            {
                cout << '\n'
                     << "DATA MAHASISWA KOSONG!" << '\n';
            }
            else
            {
                // deklarasi boolean untuk menentukan apakah data ditemukan atau tidak
                bool isFound = false;
                // meminta masukkan usuer untuk nim yang akan dicari dan akan di-update
                cout << "Masukkan NIM Mahasiswa yang akan di-Update: ";
                cin >> cari;

                // looping untuk mencari nim yang diminta oleh user
                // jika data ditemukan maka user diminta untuk memasukkan data baru yang akan diubah
                for (list<Mahasiswa>::iterator it = lList.begin(); it != lList.end(); it++)
                {
                    if (cari == it->get_nim())
                    {
                        cout << "Masukkan NIM Mahasiswa: ";
                        cin >> nim;
                        cout << "Masukkan Nama Mahasiswa: ";
                        cin >> nama;
                        cout << "Masukkan Prodi Mahasiswa: ";
                        cin >> prodi;
                        cout << "Masukkan Fakultas Mahasiswa: ";
                        cin >> fakultas;

                        it->set_nim(nim);
                        it->set_nama(nama);
                        it->set_prodi(prodi);
                        it->set_fakultas(fakultas);
                        // isFound berubah karena nim berhasil ditemukan
                        isFound = true;
                    }
                }
                // jika nim ditemukan dan jika tidak ditemukan
                if (isFound == true)
                {
                    cout << "DATA BERHASIL DI-UPDATE!" << '\n';
                }
                else
                {
                    cout << "DATA TIDAK DAPAT DITEMUKAN!" << '\n';
                }
            }
            break;
        case 4:

            // cek terlebih dahulu apakah list kosong atau tidak
            if (lList.empty())
            {
                cout << '\n'
                     << "DATA MAHASISWA KOSONG!" << '\n';
            }
            else
            {
                // deklarasi boolean untuk menentukan apakah data ditemukan atau tidak
                bool isFound = false;
                cout << "Masukkan NIM Mahasiswa yang akan di-Delete: ";
                // meminta masukkan usuer untuk nim yang akan dicari dan akan di-delete
                cin >> cari;

                // looping untuk mencari nim yang diminta oleh user
                // jika data ditemukan maka user diminta untuk memasukkan data baru yang akan dihapus
                for (list<Mahasiswa>::iterator it = lList.begin(); it != lList.end(); it++)
                {
                    if (cari == it->get_nim())
                    {
                        it = lList.erase(it);
                        // isFound berubah karena nim berhasil ditemukan
                        isFound = true;
                    }
                }
                // jika nim ditemukan dan jika tidak ditemukan
                if (isFound == true)
                {
                    cout << "DATA BERHASIL DI-DELETE!" << '\n';
                }
                else
                {
                    cout << "DATA TIDAK DAPAT DITEMUKAN!" << '\n';
                }
            }
            break;
        default:
            cout << "TERIMA KASIH!" << '\n';

            break;
        }
    }

    return 0;
}
