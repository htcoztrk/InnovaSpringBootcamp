package com.example.springmvc.web;

import com.example.springmvc.model.Student;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Log4j2
public class ResponseBodyExample {

    @GetMapping("/birinci")
    @ResponseBody
    public String birinciMethod(){
        return "yukleniyor";
    }

    @GetMapping("/ikinci")
    public String ikinciMethod(){
        return "index";
    }

    @GetMapping("/ucuncu")
    public String ucuncuMethod(){
        return "/other/deneme";
    }
    @GetMapping("/dorduncu")
    public String dorduncuMethod(Model model){
        model.addAttribute("param_key","sayfaya gonderilen deger");
        return "/other/params";
    }
    ///Path Variable
    @GetMapping("/besinci/{param1}")
    public String besinciMethod(Model model,@PathVariable(name="param1") int sayi){
        model.addAttribute("param_key","merhabalar"+sayi);
        return "pathvariable";
    }
    @GetMapping({"/altinci/{param1}","/altinci"})
    public String altinciMethod(Model model,@PathVariable(name="param1",required = false) Integer sayi){

        model.addAttribute("param_key","altinci method"+sayi);
        return "pathvariable";
    }
    @GetMapping({"/yedinci/{param1}","/yedinci"})
    public String yedinciMethod(Model model,@PathVariable(name="param1",required = false) Integer sayi){
        if(sayi!=null)
            model.addAttribute("param_key","altinci method"+sayi);
        else
            model.addAttribute("param_key","altinci method");

        return "pathvariable";
    }
    ///request param
    @GetMapping("/sekizinci")
    public String sekizinciMethod(Model model,@RequestParam(name="query") Integer sayi){
        model.addAttribute("param_key","sayi:"+sayi);
        return "pathvariable";
    }
    @GetMapping("/dokuzuncu")
    public String dokuzuncuMethod(Model model,@RequestParam(name="query", required=false, defaultValue= "0") Long sayi){
        model.addAttribute("param;key","Data id:"+sayi);
        return  "pathvariable";
    }
    //8080/onuncu?adi=hatice&soyadi=ozturk
    @GetMapping("/onuncu")
    public String onuncuMethod(Model model,
                               @RequestParam(name="adi", required=false, defaultValue="adini gir") String adi,
                               @RequestParam(name="soyadi", required=false, defaultValue="soyadini gir") String soyadi
                               ){
        model.addAttribute("param;key","ad soyad: "+adi+soyadi);
        return  "pathvariable";
    }

    @GetMapping("/onbirinci")
    public String onbirinciMethod(Model model){
        Student student=Student
        return  "pathvariable";
    }
}
