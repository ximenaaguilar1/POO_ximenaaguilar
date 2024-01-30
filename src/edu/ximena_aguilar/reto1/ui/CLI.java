package edu.ximena_aguilar.reto1.ui;

public class CLI {
    public static void showMenu(){
        switgc(option){
            public static void showMenu() {
                System.out.println("Seleccione una opción:");
                System.out.println("A. Cálculo de masa corporal (índice de masa corporal)");
                System.out.println("B. Cálculo de masa corporal magra");
                System.out.println("C. Cálculo de metabolismo basal (gasto energético basal)");

                char option = scanner.next().charAt(0);
                switch (option) {
                    case 'A':
                        calculateBMI();
                        break;
                    case 'B':
                        calculateLeanBodyMass();
                        break;
                    case 'C':
                        calculateBasalMetabolism();
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        public static void calculateBMI() {
                        // Solicitar datos del usuario
                        System.out.println("Ingrese el peso en kg:");
                        double weight = scanner.nextDouble();
                        System.out.println("Ingrese la estatura en cm:");
                        double height = scanner.nextDouble();

                        // Llamar al método de cálculo de BMI
                        // e imprimir el resultado
                        double bmi = Calculations.calculateBMI(weight, height);
                        System.out.println("Índice de masa corporal (IMC): " + bmi);
                        System.out.println("Interpretación:");
                        System.out.println(Calculations.interpretBMI(bmi));
                    }

                    public static void calculateLeanBodyMass() {
                        // Solicitar datos del usuario
                        System.out.println("Ingrese el peso en kg:");
                        double weight = scanner.nextDouble();
                        System.out.println("Ingrese la estatura en cm:");
                        double height = scanner.nextDouble();
                        System.out.println("Ingrese el sexo (M para hombre, F para mujer):");
                        char gender = scanner.next().charAt(0);
// Llamar al método de cálculo de masa corporal magra
                        // e imprimir el resultado
                        double leanBodyMass = Calculations.calculateLeanBodyMass(weight, height, gender);
                        System.out.println("Masa corporal magra: " + leanBodyMass + " kg");
                    }

                    public static void calculateBasalMetabolism() {
                        // Solicitar datos del usuario
                        System.out.println("Ingrese el peso en kg:");
                        double weight = scanner.nextDouble();
                        System.out.println("Ingrese la estatura en cm:");
                        double height = scanner.nextDouble();
                        System.out.println("Ingrese la edad:");
                        int age = scanner.nextInt();
                        System.out.println("Ingrese el sexo (M para hombre, F para mujer):");
                        char gender = scanner.next().charAt(0);

                        // Llamar al método de cálculo del metabolismo basal
                        // e imprimir el resultado
                        double basalMetabolism = Calculations.calculateBasalMetabolism(weight, height, age, gender);
                        System.out.println("Metabolismo basal: " + basalMetabolism + " kcal/día");
                    }

                    }
            }


        }
}
