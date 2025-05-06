package Taller;

import java.util.Scanner;

public class CalculadoraDescuentos {
    public static void descontar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa el precio del producto");
        int precio = scanner.nextInt();
        double totalDescontado;
        double precioFinal;
        for (int descuento = 10; descuento <= 50; descuento += 10){
            totalDescontado = (precio * descuento)/100;
            precioFinal = precio - totalDescontado;
            System.out.println("descuento de " + descuento + "%" + " " + "de" + " " + precio + " " + "es" + " " + precioFinal);
        }
        scanner.close();
    }
}