package com.example.springmvc.software.prensible.composition;

public class Test {

    public static void main(String[] args) {
        Yazar yazar=new Yazar();
        yazar.setYazarAdi("fyoder");
        yazar.setYazarSoyadi("dostoyevski");

        System.out.println(yazar);

        Kitap kitap=new Kitap();
        kitap.setKitapAdi("suc ve ceza");
        kitap.setKitapFiyati(100);
        kitap.setYazar(yazar);

        System.out.println(kitap.toString());

    }
}
