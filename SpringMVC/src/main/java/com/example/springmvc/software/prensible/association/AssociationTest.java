package com.example.springmvc.software.prensible.association;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AssociationTest {
    public static void main(String[] args) {
        Musteri musteri=Musteri.builder().adi("hatice").sehri("elz,g").build();

        SuperMarket superMarket=SuperMarket.builder().adi("mahfan gida").sehirAdi("mehfo").build();

        //loose coupling zyif baglanti=association
        log.info("musteri: "+musteri.getAdi()+" market: "+superMarket.getAdi());
    }
}

