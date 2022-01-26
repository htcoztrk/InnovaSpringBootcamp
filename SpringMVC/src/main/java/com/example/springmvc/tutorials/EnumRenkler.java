package com.example.springmvc.tutorials;

import lombok.Getter;

public enum EnumRenkler {
    MAVI,YESIL,TURUNCU
}
enum EnumRenkler2{
    MAVI(1,"Mavi"),YESIL(2,"Yesil"),TURUNCU(2,"Turuncu");

    @Getter
    private final int id;
    @Getter
    private final String renkAdi;
    private EnumRenkler2(int id, String renkAdi) {
       this.id=id;
       this.renkAdi=renkAdi;
    }
}
class Test{
    public static void main(String[] args) {
        EnumRenkler renkler1=EnumRenkler.MAVI;
        System.out.println(renkler1);

        EnumRenkler2 renkler2= EnumRenkler2.MAVI;
        String renkler22= EnumRenkler2.YESIL.toString();
        String adi=EnumRenkler2.TURUNCU.getRenkAdi();
        int id=EnumRenkler2.TURUNCU.getId();
        System.out.println(renkler2);
        System.out.println(renkler22);
        System.out.println(adi);
        System.out.println(id);


    }
}