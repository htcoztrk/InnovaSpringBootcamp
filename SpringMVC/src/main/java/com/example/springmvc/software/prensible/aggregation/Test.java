package com.example.springmvc.software.prensible.aggregation;

public class Test {
    Araba araba=new Araba();

    public static void main(String[] args) {
        Araba araba=new Araba();
        double fiyat=araba.getToplamFiyat();
        System.out.println(fiyat);
    }
}
