<?php
/* Saya Farhan Muzhaffar Tiras Putra NIM 2105879 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin. */

//import file 
require('Mahasiswa.php');

// instansiasi object dengan parameter, nim, nama, prodi, dan fakultas
$mhs1 = new Mahasiswa("2105879", "Farhan", "ILKOM", "FPMIPA");
$mhs2 = new Mahasiswa("2105768", "Wati", "PILKOM", "FPMIPA");
$mhs3 = new Mahasiswa("2104657", "Budi", "Manajemen", "FPEB");
$mhs4 = new Mahasiswa("2103546", "Nino", "PJKR", "FPOK");
$mhs5 = new Mahasiswa("2102435", "Rahma", "Pariwisata", "FPIPS");

//memasukkan object ke dalam array
$mhs = array($mhs1, $mhs2, $mhs3, $mhs4, $mhs5);

//menampilkan data mahasiswa
echo "<br> Data Mahasiswa <br>";

for ($i = 0; $i < 5; $i++) {
    echo $i + 1 . ". NIM          :" . $mhs[$i]->get_nim() . "<br>";
    echo "   Nama           :" . $mhs[$i]->get_nama() . "<br>";
    echo "   Prodi          :" . $mhs[$i]->get_prodi() . "<br>";
    echo "   Fakultas       :" . $mhs[$i]->get_fakultas() . "<br><br>";
}

// instansiasi object dengan parameter, nim, nama, prodi, dan fakultas
$mhs6 = new Mahasiswa("2100324", "Fatin", "B.Inggris", "FPBS");
$mhs7 = new Mahasiswa("2100213", "Ari", "DKV", "FPSD");

//menambah object baru ke dalam array
array_push($mhs, $mhs6, $mhs7);

//menampillkan data mahasiswa yang sudah ditampilkan
echo "<br> Data Mahasiswa ditambah dengan yang baru <br>";

for ($i = 0; $i < 7; $i++) {
    echo $i + 1 . ". NIM          :" . $mhs[$i]->get_nim() . "<br>";
    echo "   Nama           :" . $mhs[$i]->get_nama() . "<br>";
    echo "   Prodi          :" . $mhs[$i]->get_prodi() . "<br>";
    echo "   Fakultas       :" . $mhs[$i]->get_fakultas() . "<br><br>";
}

//menghapus object dari dalam array
\array_splice($mhs, 2, 1);
\array_splice($mhs, 3, 1);

//menampilkan data mahasiswa yang sudah ada dihapus beberapa
echo "<br> Data Mahasiswa baru yang sudah ada yang didelete <br>";
for ($i = 0; $i < 5; $i++) {
    echo $i + 1 . ". NIM          :" . $mhs[$i]->get_nim() . "<br>";
    echo "   Nama           :" . $mhs[$i]->get_nama() . "<br>";
    echo "   Prodi          :" . $mhs[$i]->get_prodi() . "<br>";
    echo "   Fakultas       :" . $mhs[$i]->get_fakultas() . "<br><br>";
}
