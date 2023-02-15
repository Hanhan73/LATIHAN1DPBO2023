<?php
/* Saya Farhan Muzhaffar Tiras Putra NIM 2105879 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin. */

// deklarasi class
class Mahasiswa
{
    // attibut private
    private $nim;
    private $nama;
    private $prodi;
    private $fakultas;

    // constructor dengan parameter nim, nama, prodi, dan fakultas
    public function __construct($nim = '', $nama = '', $prodi = '', $fakultas = '')
    {
        $this->nim = $nim;
        $this->nama = $nama;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
    }

    // setter dan getter untuk setiap atribut nim, nama, prodi dan fakultas
    public function get_nim()
    {
        return $this->nim;
    }
    public function set_nim($nim)
    {
        $this->nim = $nim;
    }

    public function get_nama()
    {
        return $this->nama;
    }
    public function set_nama($nama)
    {
        $this->nama = $nama;
    }

    public function get_prodi()
    {
        return $this->prodi;
    }
    public function set_prodi($prodi)
    {
        $this->prodi = $prodi;
    }

    public function get_fakultas()
    {
        return $this->fakultas;
    }
    public function set_fakultas($fakultas)
    {
        $this->fakultas = $fakultas;
    }
};
