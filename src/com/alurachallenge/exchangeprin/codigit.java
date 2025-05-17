package com.alurachallenge.exchangeprin;

import java.text.DecimalFormat;
import java.util.Scanner;

public class codigit {

    public static void main(String[] args) {

        String moneda = "United States Dollar";
        String abreviatura = "USD";
        String pais = "Estados Unidos";
        double valor = 1;

        System.out.println("\n *** Bienvenido a Exchange Coins Dollars ***");
        System.out.println(" *************************");
        System.out.println("\n Nombre de la moneda : " + moneda);
        System.out.println(" Moneda : " + abreviatura);
        System.out.println(" Pais   : " + pais);
        System.out.println(" Valor  : " + valor + " $");


        String moneda1 = "Australian Dollar";
        String abreviatura1 = "AUD";
        String pais1 = "Australia";
        double valor1 = 0.64;

        System.out.println("\n *************************");
        System.out.println("\n Nombre de la moneda : " + moneda1);
        System.out.println(" Moneda : " + abreviatura1);
        System.out.println(" Pais   : " + pais1);
        System.out.println(" Valor  : " + valor1 + " $");


        String moneda2 = "Brunei Dollar";
        String abreviatura2 = "BND";
        String pais2 = "Brunei";
        double valor2 = 0.77;

        System.out.println("\n *************************");
        System.out.println("\n Nombre de la moneda : " + moneda2);
        System.out.println(" Moneda : " + abreviatura2);
        System.out.println(" Pais   : " + pais2);
        System.out.println(" Valor  : " + valor2 + " $");


        String moneda3 = "Belize Dollar";
        String abreviatura3 = "BZD";
        String pais3 = "Belize";
        double valor3 = 0.5;

        System.out.println("\n *************************");
        System.out.println("\n Nombre de la moneda : " + moneda3);
        System.out.println(" Moneda : " + abreviatura3);
        System.out.println(" Pais   : " + pais3);
        System.out.println(" Valor  : " + valor3 + " $");
        System.out.println("\n *************************");


        String menu = """
              \n*** Tipos de cambio ***
              
              1 - USD → AUD
              2 - AUD → USD
              3 - USD → BND
              4 - BND → USD
              5 - USD → BZD
              6 - BZD → USD
              7 - Salir
              
              *** Escriba el numero de la opcion del tipo de cambio que desea ***
              
              """;

        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 7){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("¿Cuantos AUD desea comprar?");
                    double valUAUD = teclado.nextDouble();
                    double cambio = valUAUD * valor1;
                    System.out.println("**  su cambio es : "+ cambio + " $ - "+ abreviatura1);
                    break;
                case 2:
                    System.out.println("¿Cuantos AUD desea vender?");
                    double valAUD = teclado.nextDouble();
                    double cambio2 = (valAUD * valor )/ valor1;
                    System.out.println("**  su cambio es : "+ cambio2 + " $ - "+ abreviatura);
                    break;
                case 3:
                    System.out.println("¿Cuantos BND desea comprar?");
                    double valUBND = teclado.nextDouble();
                    double cambio3 = valUBND * valor2;
                    System.out.println("**  su cambio es : "+ cambio3 + " $ - "+ abreviatura2);
                    break;
                case 4:
                    System.out.println("¿Cuantos BND desea vender?");
                    double valBND = teclado.nextDouble();
                    double cambio4 = (valBND * valor )/ valor2;
                    DecimalFormat df = new DecimalFormat("#.00");
                    String camF = df.format(cambio4);
                    System.out.println("**  su cambio es : "+ camF + " $ - "+ abreviatura);
                    break;
                case 5:
                    System.out.println("¿Cuantos BZD desea comprar?");
                    double valUBZD = teclado.nextDouble();
                    double cambio5 = valUBZD * valor3;
                    System.out.println("**  su cambio es : "+ cambio5 + " $ - "+ abreviatura2);
                    break;
                case 6:
                    System.out.println("¿Cuantos BZD desea vender?");
                    double valBZD = teclado.nextDouble();
                    double cambio6 = (valBZD * valor )/ valor3;
                    System.out.println("**  su cambio es : "+ cambio6 + " $ - "+ abreviatura);
                    break;
                case 7:
                    System.out.println("Cerrando programa, Gracias por la preferencia");
                    break;

                default:
                    System.out.println("opcion no valida, vuelva a intentar");


            }
        }
    }
}

