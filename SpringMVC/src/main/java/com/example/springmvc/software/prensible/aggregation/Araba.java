package com.example.springmvc.software.prensible.aggregation;

public class Araba {
    private Motor motor;
    public double getToplamFiyat(){
        motor=new Motor();
        return motor.getMotorFiyat()+2000;
    }
}
