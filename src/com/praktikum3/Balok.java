package com.praktikum3;

public class Balok {
        private int Panjang ;
        private int Lebar ;
        private int Tinggi ;

    //GetSet Panjang
    public int getPanjang() {
        return Panjang;
    }
    public void setPanjang(int panjang) {
        Panjang = panjang;
    }

    //GetSet Lebar
    public int getLebar() {
        return Lebar;
    }
    public void setLebar(int lebar) {
        Lebar = lebar;
    }

    // GetSet Tinggi
    public int getTinggi() {
        return Tinggi;
    }
    public void setTinggi(int tinggi) {
        Tinggi = tinggi;
    }

    void hasil (){
        hitung ht = new hitung();
        System.out.println("Hasil Luas Balok : " + ht.Luas(this));
        System.out.println("Hasil Volume Balok : " + ht.Volume(this));
    }
}
