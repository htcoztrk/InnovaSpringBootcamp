package com.example.springmvc.tutorials;

public class StringBuilderExample {
    public static void main(String[] args) {
        //1.yol
        String adi="hatice";
        String soyadi="ozturk";
        System.out.println(adi+soyadi);

        //2.yol
        String result=adi.concat(soyadi);
        System.out.println(result);

        //3.yol
        //servis, database, karsi taraftan ne gelecegini bilmiyorsak
        //asenkron
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("").append(adi).append(soyadi);
        System.out.println(stringBuilder);

        //4.yol
        //senkron
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(adi).append(soyadi);
        System.out.println(stringBuffer);
    }
}
