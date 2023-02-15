/* Saya Farhan Muzhaffar Tiras Putra NIM 2105879 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin. */

// deklarasi class
public class Mahasiswa
{

    // attibut private bertipe data string
    private String nim;
    private String nama;
    private String prodi;
    private String fakultas;

    // constructor tanpa parameter
    public Mahasiswa()
    {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.fakultas = "";
    }

    // constructor dengan parameter nim, nama, prodi, dan fakultas
    public Mahasiswa(String nim, String nama, String prodi, String fakultas)
    {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    // setter dan getter untuk setiap atribut nim, nama, prodi dan fakultas
    public String get_nim()
    {
        return this.nim;
    }

    public void set_nim(String nim)
    {
        this.nim = nim;
    }

    public String get_nama()
    {
        return this.nama;
    }

    public void set_nama(String nama)
    {
        this.nama = nama;
    }

    public String get_prodi()
    {
        return this.prodi;
    }

    public void set_prodi(String prodi)
    {
        this.prodi = prodi;
    }

    public String get_fakultas()
    {
        return this.fakultas;
    }

    public void set_fakultas(String fakultas)
    {
        this.fakultas = fakultas;
    }

};
