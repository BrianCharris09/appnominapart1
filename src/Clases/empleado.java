/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.text.DecimalFormat;
import java.util.Objects;

/**
 *
 * @author SENA
 */
public class empleado {
    
    private String nombreCompleto;
    private double salarioBasico;
    private int diasTrabajados;
    private double salarioDevengado = 0;
    private double auxilioDeTrasporte = 0;
    private double totalDevengado = 0;
    private double salud = 0;
    private double pension = 0;
    private double totalNetoPagado = 0;

    public empleado(String nombreCompleto, double salarioBasico, int diasTrabajados) {
        this.nombreCompleto = nombreCompleto;
        this.salarioBasico = salarioBasico;
        this.diasTrabajados = diasTrabajados;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public double getSalarioDevengado() {
        return salarioDevengado;
    }

    public void setSalarioDevengado(double salarioDevengado) {
        this.salarioDevengado = salarioDevengado;
    }

    public double getAuxilioDeTrasporte() {
        return auxilioDeTrasporte;
    }

    public void setAuxilioDeTrasporte(double auxilioDeTrasporte) {
        this.auxilioDeTrasporte = auxilioDeTrasporte;
    }

    public double getTotalDevengado() {
        return totalDevengado;
    }

    public void setTotalDevengado(double totalDevengado) {
        this.totalDevengado = totalDevengado;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getPrension() {
        return pension;
    }

    public void setPrension(double prension) {
        this.pension = prension;
    }

    public double getTotalNetoPagado() {
        return totalNetoPagado;
    }

    public void setTotalNetoPagado(double totalNetoPagado) {
        this.totalNetoPagado = totalNetoPagado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final empleado other = (empleado) obj;
        if (Double.doubleToLongBits(this.salarioBasico) != Double.doubleToLongBits(other.salarioBasico)) {
            return false;
        }
        if (this.diasTrabajados != other.diasTrabajados) {
            return false;
        }
        if (Double.doubleToLongBits(this.salarioDevengado) != Double.doubleToLongBits(other.salarioDevengado)) {
            return false;
        }
        if (Double.doubleToLongBits(this.auxilioDeTrasporte) != Double.doubleToLongBits(other.auxilioDeTrasporte)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalDevengado) != Double.doubleToLongBits(other.totalDevengado)) {
            return false;
        }
        if (Double.doubleToLongBits(this.salud) != Double.doubleToLongBits(other.salud)) {
            return false;
        }
        if (Double.doubleToLongBits(this.pension) != Double.doubleToLongBits(other.pension)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalNetoPagado) != Double.doubleToLongBits(other.totalNetoPagado)) {
            return false;
        }
        return Objects.equals(this.nombreCompleto, other.nombreCompleto);
    }
    
    
    
    //Metodos
    
    public void calcSalarioDevengado(){
        this.salarioDevengado = (this.salarioBasico/30)*this.diasTrabajados;
    }
    
    public void calcAuxilioTrasporte(double salarioMinimo, double auxilioTrasporte){
        this.auxilioDeTrasporte = 0;
        if (this.salarioBasico<(salarioMinimo*2)) {
            this.auxilioDeTrasporte = auxilioTrasporte/30 * this.diasTrabajados;
        }
    }
    
    public void calcTotalDesvengado(){
        this.totalDevengado = salarioDevengado + auxilioDeTrasporte;
    }
    
    
    public void calcValorSalud(){
        this.salud = (this.totalDevengado - this.auxilioDeTrasporte )*0.04;
    }
    
    public void calcValorPension(){
        this.pension = (this.totalDevengado - this.auxilioDeTrasporte )*0.04;
    }
    
    public void calcTotalNeto(){
        this.totalNetoPagado = this.totalDevengado - this.salud - this.pension;
    }
    
    
}
