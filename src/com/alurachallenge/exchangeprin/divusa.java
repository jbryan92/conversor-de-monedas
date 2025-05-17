package com.alurachallenge.exchangeprin;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import com.alurachallenge.exchangeprin.Dusd;
import com.alurachallenge.exchangeprin.cambio;

public class divusa {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        cambio coin = new cambio();
        System.out.println("\n *** Bienvenido a Exchange Coins Dollars *** ");

        Dusd dusd = coin.camdivi("USD");

        String abreviatura = "USD";
        String abreviatura1 = "AUD";
        String abreviatura2 = "BND";
        String abreviatura3 = "BZD";
        double valorUSD = dusd.conversion_rates().get("USD");
        double valorAUD = dusd.conversion_rates().get("AUD");
        double valorBND = dusd.conversion_rates().get("BND");
        double valorBZD = dusd.conversion_rates().get("BZD");



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
                    double cambio = valUAUD * valorAUD;
                    System.out.println("**  su cambio es : "+ cambio + " $ - "+ abreviatura1);
                    break;
                case 2:
                    System.out.println("¿Cuantos AUD desea vender?");
                    double valAUD = teclado.nextDouble();
                    double cambio2 = (valAUD * valorUSD )/ valorAUD;
                    System.out.println("**  su cambio es : "+ cambio2 + " $ - "+ abreviatura);
                    break;
                case 3:
                    System.out.println("¿Cuantos BND desea comprar?");
                    double valUBND = teclado.nextDouble();
                    double cambio3 = valUBND * valorBND;
                    System.out.println("**  su cambio es : "+ cambio3 + " $ - "+ abreviatura2);
                    break;
                case 4:
                    System.out.println("¿Cuantos BND desea vender?");
                    double valBND = teclado.nextDouble();
                    double cambio4 = (valBND * valorUSD )/ valorBND;
                    DecimalFormat df = new DecimalFormat("#.00");
                    String camF = df.format(cambio4);
                    System.out.println("**  su cambio es : "+ camF + " $ - "+ abreviatura);
                    break;
                case 5:
                    System.out.println("¿Cuantos BZD desea comprar?");
                    double valUBZD = teclado.nextDouble();
                    double cambio5 = valUBZD * valorBZD;
                    System.out.println("**  su cambio es : "+ cambio5 + " $ - "+ abreviatura2);
                    break;
                case 6:
                    System.out.println("¿Cuantos BZD desea vender?");
                    double valBZD = teclado.nextDouble();
                    double cambio6 = (valBZD * valorUSD )/ valorBZD;
                    System.out.println("**  su cambio es : "+ cambio6 + " $ - "+ abreviatura);
                    break;
                case 7:
                    System.out.println("Cerrando programa, Gracias por la preferencia");
                    break;

                default:
                    System.out.println("opcion no valida, vuelva a intentar");

                    try {
                        var camdiv = lectura.nextLine();
                        Dusd busd = coin.camdivi(camdiv);
                        System.out.println(busd);

                    }catch (NumberFormatException e){
                        System.out.println("divisa no encontrada" +e.getMessage());
                    }
                    catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        System.out.println("Cerrando programa, Gracias por la preferencia");


                    }

            }
        }
    }


}
