package com.example.springmvc.software.prensible.association;
//association=siniflar arasi zayif bicimidir
//musteri olmadan da market vardir

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class SuperMarket {
    private String adi;
    private String sehirAdi;
}
