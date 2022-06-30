package com.upchiapas.C2ISACE5.Models;

public class Validacion {
    Impresion impresion = new Impresion();
    public boolean validarHora(int H){
        boolean bandera = true;
        if(H<1 ||H>24){
            impresion.ErrorHora();
            bandera = false;
        } else
            System.out.println("La hora es correcta");
        return bandera;
    }
    public boolean validarMinutos(int M){
        boolean bandera = true;
        if(M<0 ||M>59){
            impresion.ErrorMinutos();
            bandera = false;
        } else
            System.out.println("Los minutos son correctos");
        return bandera;
    }
    public boolean validarSegundos(int S){
        boolean bandera = true;
        if(S<0 ||S>59){
            impresion.ErrorSegundos();
            bandera = false;
        } else
            System.out.println("Los segundos son correctos");
        return bandera;
    }
}
