package com.alurachallenge.exchangeprin;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class cambio {

    public Dusd camdivi(String camdiv) {
        System.out.println(camdiv);

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c354dd40be16aaa36c89d14a/latest/" + camdiv);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
             // Imprimir la respuesta JSON
            Dusd dusd = new Gson().fromJson(response.body(), Dusd.class);

            // Acceder a las monedas
            for (String moneda : dusd.conversion_rates().keySet()) {
                double valor = dusd.conversion_rates().get(moneda);

            }

            // Si deseas acceder a una moneda específica, por ejemplo "USD":
            String monedaEspecifica = "USD"; // Cambia esto si necesitas otra moneda
            if (dusd.conversion_rates().containsKey(monedaEspecifica)) {
                double dolar = dusd.conversion_rates().get(monedaEspecifica);
                System.out.println("El valor de la moneda es: " + dolar);
            } else {
                System.out.println("La moneda " + monedaEspecifica + " no se encontró en la respuesta.");
            }


            return dusd;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("***");

        }




    }
}