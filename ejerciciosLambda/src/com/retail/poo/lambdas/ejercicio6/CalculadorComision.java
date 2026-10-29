package com.retail.poo.lambdas.ejercicio6;

@FunctionalInterface 
public interface CalculadorComision {

    double calcular(double montoSubtotal, boolean esEnvioDomicilio);
}
