/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author SENA
 */
public class empresa {
    
    private double salarioMinimo;
    private double auxilioTrasporte;
    private double netoPagado = 0;
    private LocalDate fechaActual = LocalDate.now();

    public empresa(double salarioMinimo, double auxilioTrasporte) {
        this.salarioMinimo = salarioMinimo;
        this.auxilioTrasporte = auxilioTrasporte;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double getAuxilioTrasporte() {
        return auxilioTrasporte;
    }

    public void setAuxilioTrasporte(double auxilioTrasporte) {
        this.auxilioTrasporte = auxilioTrasporte;
    }

    public double getNetoPagado() {
        return netoPagado;
    }

    public void setNetoPagado(double netoPagado) {
        this.netoPagado = netoPagado;
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(LocalDate fechaActual) {
        this.fechaActual = fechaActual;
    }

    
    
    
}
