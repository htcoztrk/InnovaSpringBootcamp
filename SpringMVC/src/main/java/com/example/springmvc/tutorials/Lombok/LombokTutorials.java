package com.example.springmvc.tutorials.Lombok;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.util.Objects;

@Data //getter, setter,hashcode, equals methodlarını sagliyor
@AllArgsConstructor  //parametreli
@NoArgsConstructor //parametresiz
@Builder
public class LombokTutorials {
    //eger hashcode ve equals kullanmak istemiyorsak,
    //yukarida data anot yerine asagida getter setter anotlarini kullanitiz
    //@Getter @Setter
    public String id;
    public String name;
    public String surname;


    public static void main(String[] args) {
        LombokTutorials s=LombokTutorials.builder().id("1").build();
    }

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LombokTutorials that = (LombokTutorials) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }*/
}
