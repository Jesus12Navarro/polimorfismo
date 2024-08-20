/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoravalor;

/**
 *
 * @author strdh
 */
public class CalculadoraValorConDescuento extends CalculadoraValor{
    private double descuento;
    
    public CalculadoraValorConDescuento(double descuento){
        this.descuento = descuento;
    }
    @Override
    public double calculadoraValorFinal(double valorbase) {
        return valorbase * (1 - descuento);
    }
    
}
