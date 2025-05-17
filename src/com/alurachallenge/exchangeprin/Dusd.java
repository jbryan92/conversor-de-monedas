package com.alurachallenge.exchangeprin;

import java.util.Map;

public record Dusd(String base_code,
                    Map<String,Double> conversion_rates) {

}

