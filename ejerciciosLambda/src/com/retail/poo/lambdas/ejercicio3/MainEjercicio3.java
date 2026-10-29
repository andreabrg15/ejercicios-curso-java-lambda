package com.retail.poo.lambdas.ejercicio3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainEjercicio3 {

    public static void main(String[] args) {

        // Lista de SKUs con duplicados
        List<String> skus = Arrays.asList(
            "SKU-902", "SKU-101", "SKU-505",
            "SKU-101", "SKU-902", "SKU-303"
        );

        Stream<String> depurarSkusDuplicados = skus.stream().distinct();
        Stream<String> ordenarSkus = depurarSkusDuplicados.sorted();

        List<String> skusOrdenadosAlfabeticamente = ordenarSkus
            .collect(Collectors.toList());

        System.out.println("\nSKUs originales: " + skus);
        System.out.println("SKUs depurados: " + skusOrdenadosAlfabeticamente);
    }
}
