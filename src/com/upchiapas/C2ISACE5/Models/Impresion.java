package com.upchiapas.C2ISACE5.Models;

public class Impresion {

    public void imprecionHora(int H, int M, int S){
        System.out.println("Hora ingresada: "+H+":"+M+":"+S);
    }
    public void ErrorHora(){
        System.out.println("Solo puede ingresar de 1 a 24 horas");
    }
    public void ErrorMinutos(){
        System.out.println("Solo puede ingresar de 0 a 59 Minutos");
    }
    public void ErrorSegundos(){
        System.out.println("Solo puede ingresar de 0 a 59 Segundos");
    }
}
