package main.java;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a massa (kg): ");
        float massa = scan.nextFloat();

        System.out.print("Informe a altura (m): ");
        double altura = scan.nextDouble();

        System.out.print("Informe ao volume (m): ");
        float volume = scan.nextFloat();
        
        CorpoHumano c1 = new CorpoHumano(massa, volume, altura);
        
        double imc = c1.calcularIMC();
        System.out.printf("O IMC calculado é: %.2f\n", imc);
    }
}