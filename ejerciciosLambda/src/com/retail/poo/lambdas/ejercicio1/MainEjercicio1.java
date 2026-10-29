package com.retail.poo.lambdas.ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainEjercicio1 {

    public static void main(String[] args) {
        
        // Lista con productos en Anaquel
        List<Producto> productos = Arrays.asList(
            new Producto("Leche", 32.50),
            new Producto("Cereal", 65.00),
            new Producto("Café", 89.90),
            new Producto("Galletas", 25.00),
            new Producto("Detergente", 72.00)
        );

        // Filtrar productos con precio mayor a 50
        System.out.println("\n----Productos con precio mayor a $50----");
        Stream<Producto> productosFiltrados = productos.stream()
        .filter(producto -> producto.getPrecio() > 50);

        // Imprimir los productos filtrados en Consola
        productosFiltrados
        .forEach(producto -> System.out.println(producto.getNombre() + " - $" + producto.getPrecio()));
    }
}
