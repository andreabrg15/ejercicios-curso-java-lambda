package com.retail.poo.lambdas.ejercicio5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.IntSummaryStatistics;

public class MainEjercicio5 {

    public static void main(String[] args) {

        // Montos de Tickets cobrados en caja
        List<Integer> tickets = Arrays.asList(
            150, 250, 80, 400, 120, 300
        );

        IntStream TicketStream = tickets.stream().mapToInt(monto -> monto);

        IntSummaryStatistics estadisticasTickets = TicketStream.summaryStatistics();

        System.out.println("\n---Resumen de ventas en cajas---");
        System.out.println(
            "Total de transacciones: " + estadisticasTickets.getCount()
        );
        System.out.println(
            "Venta mínima: $" + estadisticasTickets.getMin()
        );
        System.out.println(
            "Venta máxima: $" + estadisticasTickets.getMax()
        );
        System.out.println(
            "Venta total acumulada: $" + estadisticasTickets.getSum()
        );
        System.out.printf(
            "Ticket promedio: $%.2f%n", estadisticasTickets.getAverage()
        );
    }
}
