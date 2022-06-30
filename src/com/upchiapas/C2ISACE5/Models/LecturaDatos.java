package com.upchiapas.C2ISACE5.Models;

import java.util.Scanner;

public class LecturaDatos {
    Validacion validar = new Validacion();
    int H,M,S;
    Scanner entrada = new Scanner(System.in);
    public void lecturaDatos(){
        System.out.println("Ingrese los siguientes datos");
        do{
            System.out.println("Hora");
            H = entrada.nextInt();
        } while(!validar.validarHora(H));
        do{
            System.out.println("Minutos");
            M = entrada.nextInt();
        }while(!validar.validarMinutos(M));
        do{
            System.out.println("Segundos");
            H = entrada.nextInt();
        }while(!validar.validarSegundos(S));
        validar.impresion.imprecionHora(H,M,S);
    }
}
