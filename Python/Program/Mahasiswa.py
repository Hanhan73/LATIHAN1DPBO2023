# Saya Farhan Muzhaffar Tiras Putra NIM 2105879 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
# untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
# Aamiin.

# deklarasi class
class Mahasiswa:

    # deklarasi private atribut
    __nim = ""
    __nama = ""
    __prodi = ""
    __fakultas = ""

    # constructor dengan parameter nim, nama, prodi, dan fakultas
    def __init__(self, nim="", nama="", prodi="", fakultas=""):
        self.__nim = nim
        self.__nama = nama
        self.__prodi = prodi
        self.__fakultas = fakultas

    # setter dan getter untuk masing masing attribut nim, nama, prodi dan fakultas
    def get_nim(self):
        return self.__nim

    def set_nim(self, nim):
        self.__nim = nim

    def get_nama(self):
        return self.__nama

    def set_nama(self, nama):
        self.__nama = nama

    def get_prodi(self):
        return self.__prodi

    def set_prodi(self, prodi):
        self.__prodi = prodi

    def get_fakultas(self):
        return self.__fakultas

    def set_fakultas(self, fakultas):
        self.__fakultas = fakultas
