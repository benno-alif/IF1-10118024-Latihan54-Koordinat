package com.benno;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Koordinat
     */

public class Main {

    public static void main(String[] args) {
        WarnaKoordinat obj = new WarnaKoordinat(10, 4, "Jingga");

        System.out.println("Warna Koordinat : " + obj.getNamaWarna());
        System.out.print("Koordin Sumbu x : " + obj.getX());
        System.out.println(", y : " + obj.getY());
    }
}
