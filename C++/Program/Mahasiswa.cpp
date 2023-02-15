/* Saya Farhan Muzhaffar Tiras Putra NIM 2105879 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin. */

// import library
#include <iostream>
#include <string>

using namespace std;

// deklarasi kelas
class Mahasiswa
{

    // attibut private bertipe data string
private:
    string nim;
    string nama;
    string prodi;
    string fakultas;

    // public Methods
public:
    // constructor tanpa parameter
    Mahasiswa()
    {
        this->nim = "";
        this->nama = "";
        this->prodi = "";
        this->fakultas = "";
    }

    // constructor dengan parameter nim, nama, prodi, dan fakultas
    Mahasiswa(string nim, string nama, string prodi, string fakultas)
    {
        this->nim = nim;
        this->nama = nama;
        this->prodi = prodi;
        this->fakultas = fakultas;
    }

    // setter dan getter untuk setiap atribut nim, nama, prodi dan fakultas
    string get_nim()
    {
        return this->nim;
    }

    void set_nim(string nim)
    {
        this->nim = nim;
    }

    string get_nama()
    {
        return this->nama;
    }

    void set_nama(string nama)
    {
        this->nama = nama;
    }

    string get_prodi()
    {
        return this->prodi;
    }

    void set_prodi(string prodi)
    {
        this->prodi = prodi;
    }

    string get_fakultas()
    {
        return this->fakultas;
    }

    void set_fakultas(string fakultas)
    {
        this->fakultas = fakultas;
    }

    // deconstructor
    ~Mahasiswa()
    {
    }
};
