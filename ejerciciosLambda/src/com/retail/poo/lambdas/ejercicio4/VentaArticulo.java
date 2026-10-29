package com.retail.poo.lambdas.ejercicio4;

public class VentaArticulo {

    private String articulo;
    private int unidadesVendidas;

    public VentaArticulo(String articulo, int unidadesVendidas) {
        this.articulo = articulo;
        this.unidadesVendidas = unidadesVendidas;
    }

    // Getters y Setters
    public String getArticulo() {
        return articulo;
    }
    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }
    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }
}
