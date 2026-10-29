package com.retail.poo.lambdas.ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainEjercicio2 {

    public static void main(String[] args) {

        List<Double> preciosdeLista = Arrays.asList(
            100.0, 250.0, 500.0, 800.0
        );

        Stream<Double> descontarPrecios = preciosdeLista.stream()
        .map(precio -> precio * 0.85);

        List<Double> preciosConDescuento = descontarPrecios.collect(Collectors.toList());

        System.out.println("\n----Precios originales----");
        preciosdeLista.forEach(precio -> System.out.println("$" + precio));
        System.out.println("\n----Precios con 15% de descuento----");
        preciosConDescuento.forEach(precio -> System.out.println("$" + precio));
    }
}
