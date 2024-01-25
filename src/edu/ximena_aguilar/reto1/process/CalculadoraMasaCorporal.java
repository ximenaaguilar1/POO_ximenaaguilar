package edu.ximena_aguilar.reto1.process;

/**
 * Esta clase sirve para realizar calculos de masa corporal incluye los metodos:
 * inidice de masa corporal
 * calculo de masa corporal magra
 * calculo de metabolismo basal
 **/

public class CalculadoraMasaCorporal {
    /**
     * este metodo sirve para calcular el indice de masa corporal basado en
     * su peso y estatura
     * @param estatura estatura del paciente en centimetros
     * @param peso peso del paciente en kilogramos
     * @return indice de masa cororal
     */
    public static double calcularIndiceMasaCorporal(double estatura,double peso){
        return peso/Math.pow(estatura,2);
        

    }
}
