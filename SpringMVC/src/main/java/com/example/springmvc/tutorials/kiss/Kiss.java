package com.example.springmvc.tutorials.kiss;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.io.*;

@Log4j2
public class Kiss {
   private static String path="C:\\ornek";

   //File Writer
   public void utilWriter(){
       //try with resource
       try(BufferedWriter bufferedWriter=
               new BufferedWriter(new FileWriter(path,true))){
           String value= JOptionPane.showInputDialog("biseyier gir");
           bufferedWriter.write(value);
           bufferedWriter.flush();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
   //Fle Reader
   public void utilReader(){
       //try with resource
       try(BufferedReader bufferedReader=
                   new BufferedReader(new FileReader(path))){
          String numRow="",sumRow="";
          while((numRow=bufferedReader.readLine())!=null){
              sumRow +=numRow;
           }
          log.info(sumRow);
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

    public static void main(String[] args) {
        Kiss kiss=new Kiss();
        //kiss.utilWriter();
         kiss.utilReader();
        }
}
