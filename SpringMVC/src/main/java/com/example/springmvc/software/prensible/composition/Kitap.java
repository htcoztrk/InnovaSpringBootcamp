package com.example.springmvc.software.prensible.composition;

public class Kitap {

    private String kitapAdi;
    private int kitapFiyati;
    //composition
    private Yazar yazar;

    public Kitap() {
    }

    public Kitap(String kitapAdi,int kitapFiyati,Yazar yazar) {
        this.kitapAdi = kitapAdi;
        this.kitapFiyati=kitapFiyati;
        this.yazar=yazar;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", kitapFiyati=" + kitapFiyati +
                ", yazar=" + yazar +
                '}';
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }

    public int getKitapFiyati() {
        return kitapFiyati;
    }

    public void setKitapFiyati(int kitapFiyati) {
        this.kitapFiyati = kitapFiyati;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }
}
