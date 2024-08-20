/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoravalor;

/**
 *ejemplo simple de polimorfismo
 * @author strdh
 */
abstract class CalculadoraValor {

    public abstract double calculadoraValorFinal(double valorbase) ;
    public static void main(String[]args){
        double valorbase = 150;
        CalculadoraValor calculadoraNormal = new CalculadoraValor(){
            @Override
            public double calculadoraValorFinal(double valorbase) {
                return valorbase;
            }  
        };
        System.out.println("Valor final (sin descuento ni impuesto):" + calculadoraNormal.calculadoraValorFinal(valorbase));
        
        CalculadoraValor calculadoraDescuento = new CalculadoraValorConDescuento(0.30);
        System.out.println("Valor final con descuento del 30%: " + calculadoraDescuento.calculadoraValorFinal(valorbase));
        CalculadoraValor calculadoraImpuesto = new CalculadoraValorConImpuestos(0.12);
        System.out.println("Valor final con impuesto del 12%: " + calculadoraImpuesto.calculadoraValorFinal(valorbase));
    }

}
