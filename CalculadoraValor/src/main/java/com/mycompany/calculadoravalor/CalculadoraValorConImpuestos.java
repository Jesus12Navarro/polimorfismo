/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoravalor;

/**
 *
 * @author strdh
 */
public class CalculadoraValorConImpuestos extends CalculadoraValor{
    private double impuesto;
    
    public CalculadoraValorConImpuestos(double impuesto){
        this.impuesto = impuesto;
        
    }

    @Override
    public double calculadoraValorFinal(double valorbase) {
        return valorbase * (1+ impuesto);
    }

}
