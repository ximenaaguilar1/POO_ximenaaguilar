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
    public static double calcularIndiceMasaCorporal(double estatura,double peso) {
        return peso / Math.pow(estatura, 2);
    }
    public static String clasificarIndiceMasaCorporal(double inc){
        String value = **;
        if(imc<18) {
            value = "desnutricion";
        }else if(imc<=24.99)
            value= "normal";
        return value;
        public static double calculateBMI(double weight, double height) {
            // Convertir altura a metros
            double heightMeters = height / 100.0;
            // Calcular BMI
            return weight / (heightMeters * heightMeters);
        }

        public static String interpretBMI(double bmi) {
            if (bmi < 18.5) {
                return "Peso bajo";
            } else if (bmi >= 18.5 && bmi <= 24.99) {
                return "Peso normal";
            } else if (bmi >= 25 && bmi <= 29.99) {
                return "Sobrepeso";
            } else if (bmi >= 30 && bmi <= 34.99) {
                return "Obesidad leve";
            } else if (bmi >= 35 && bmi <= 39.99) {
                return "Obesidad media";
            } else {
                return "Obesidad mórbida";
            }
        }

        public static double calculateLeanBodyMass(double weight, double height, char gender) {
            double heightMeters = height / 100.0;
            if (gender == 'F') {
                return (1.07 * weight) - 148 * Math.pow((weight / heightMeters), 2);
            } else {
                return (1.10 * weight) - 128 * Math.pow((weight / heightMeters), 2);
            }
        }

        public static double calculateBasalMetabolism(double weight, double height, int age, char gender) {
            if (gender == 'F') {
                return 655.1 + (9.563 * weight) + (1.85 * height) - (4.676 * age);
            } else {
                return 66.5 + (13.75 * weight) + (5.003 * height) - (6.775 * age);

    }

        }

        

    }
}
