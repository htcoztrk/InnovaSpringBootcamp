package com.example.springmvc.tutorials;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String jsonObject="html, css, js";
        //bu syringi parcalayalim
        //1.yol
        String [] result=jsonObject.split(",");
        for(String temp:result){
            System.out.println(temp);
        }

        //2.yol
        StringTokenizer tokenizer=new StringTokenizer(jsonObject,",# ");
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());

        }


    }
}
