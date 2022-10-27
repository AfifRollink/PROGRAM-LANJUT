package com.praktikum3;

import java.util.* ;

public class Main {
    public static void main(String[] args) {
        Balok myObj = new Balok();
        Scanner sc = new Scanner(System.in);

        System.out.println("===== MENGHITUNG LUAS DAN VOLUME BALOK =====");
        System.out.print("[-] Masukkan Panjang : ");
        myObj.setPanjang(sc.nextInt()) ;
        System.out.print("[-] Masukkan Lebar : ");
        myObj.setLebar(sc.nextInt());
        System.out.print("[-] Masukkan Tinggi : ");
        myObj.setTinggi(sc.nextInt());

        myObj.hasil();

    }
}