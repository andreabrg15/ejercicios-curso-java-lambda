package com.retail.poo.lambdas.ejercicio6;

public class MainEjercicio6 {

    public static void main(String[] args) {

        // Implementación de Interfaz con expresión lambda
        CalculadorComision calculador = (montoSubtotal, esEnvioDomicilio) -> {
            if(esEnvioDomicilio) {
                return montoSubtotal * 0.10; // 10% de comisión para envíos a domicilio
            } else {
                return 0; // Sin comisión para ventas en tienda
            }
        };

        // Por ejemplo, calculamos la comisión para una venta con envío a domicilio
        double subtotal = 500.0;
        boolean envioDomicilio = true;
        double comisionAdicionalVenta = calculador.calcular(subtotal, envioDomicilio);
        double costoEnvio = envioDomicilio ? 50.0 : 0.0; // Costo de envío fijo

        System.out.println("\n---Desglose de venta---");
        System.out.println("Subtotal de la venta: $" + subtotal);
        System.out.println("¿Es envío a domicilio? " + envioDomicilio);
        System.out.println("Comisión adicional por venta con envío: $" + comisionAdicionalVenta);
        System.out.println("Costo de envío: $" + costoEnvio);
        System.out.println("Total a pagar: $" + (subtotal + comisionAdicionalVenta + costoEnvio));

    }
}
