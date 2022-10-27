package com.praktikum3;
import java.util.* ;

public class hitung {

    public int Volume(Balok sisi) {
        return  4 * ((int) sisi.getPanjang() * (int) sisi.getLebar() * (int) sisi.getTinggi());
    }

    public int Luas(Balok sisi) {
        return ( (int) sisi.getPanjang() * (int) sisi.getLebar() * (int) sisi.getTinggi());
    }


}
