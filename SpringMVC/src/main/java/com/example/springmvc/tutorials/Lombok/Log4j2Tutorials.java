package com.example.springmvc.tutorials.Lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@Builder
@Log4j2
public class Log4j2Tutorials {
    private String id;
    private String name;
    private String surname;

    public Log4j2Tutorials(){
        this.id="1";
        this.name="hatice";
        this.surname="ozturk";

    }
    //shift+f6=refactor
    //alt+insert=getter,setter
    //ctrl+shift+o=maven clean, install
    public static void main(String[] args) {
        Log4j2Tutorials tutorials=new Log4j2Tutorials();
        if(tutorials.getName().equals("hatice")){
            log.info("adınız... hatice tebrikler");
        }
        else{
            log.info("uzgunuz hatice degilsiniz");
        }
        System.out.println(tutorials);
    }
}
