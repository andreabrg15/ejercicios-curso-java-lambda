package com.retail.poo.lambdas.ejercicio4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainEjercicio4 {

    public static void main(String[] args) {

        // Lista de ventas de artículos
        List<VentaArticulo> ventas = Arrays.asList(
            new VentaArticulo("Arroz", 45),
            new VentaArticulo("Leche", 80),
            new VentaArticulo("Pan", 120),
            new VentaArticulo("Café", 65),
            new VentaArticulo("Galletas", 95)
        );

        Stream<VentaArticulo> ordenarVentas = ventas.stream()
        .sorted( (a,b) -> 
        Integer.compare(b.getUnidadesVendidas(), a.getUnidadesVendidas()));

        Stream<VentaArticulo> top3Ventas = ordenarVentas.limit(3);

        System.out.println("\n---Top 3 artículos más vendidos---");
        top3Ventas.forEach(venta ->
            System.out.println(
                venta.getArticulo() + ": "
                + venta.getUnidadesVendidas() + " unidades"
            )
        );
    }
}
