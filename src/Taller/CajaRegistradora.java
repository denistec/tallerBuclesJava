package Taller;
import java.util.Scanner;

public class CajaRegistradora {
    public static void calcularTotal () {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int cantidad = 0;
        int total;
        int precio;
        int totalGeneral = 0;
        int pagoCliente;

        do{
            System.out.println("escoje una opcion del manu:");
            System.out.println("1. hamburguesa $50");
            System.out.println("2. papas $30");
            System.out.println("3. refresco $20");
            System.out.println("4. salir");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    precio = 50;
                    break;
                case 2:
                    precio = 30;
                    break;
                case 3:
                    precio = 20;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("escoje una opcion de la lista");
            }
        if (opcion == 1){
            System.out.println("cuantas unidades de este pedido quieres? ");
            cantidad = scanner.nextInt();
            total = cantidad * 50;
            totalGeneral += total;
            System.out.println("el total de la(s) hamburguesa(s) es " + totalGeneral);
            }
            if (opcion == 2){
                System.out.println("cuantas unidades de este pedido quieres? ");
                cantidad = scanner.nextInt();
                total = cantidad * 30;
                totalGeneral += total;
                System.out.println("el total de las papas es " + total);
            }
            if (opcion == 3){
                System.out.println("cuantas unidades de este pedido quieres? ");
                cantidad = scanner.nextInt();
                total = cantidad * 20;
                totalGeneral += total;
                System.out.println("el total del refresco es " + total);
            }
            System.out.println("el total general es: " + totalGeneral);
        } while (opcion != 4);
        System.out.println("con cuanto dinero vas a pagar?");
        pagoCliente = scanner.nextInt();
        if (pagoCliente == totalGeneral){
            System.out.println("ok, gracias por tu pago");
        } if (pagoCliente > totalGeneral){
            int cambio = pagoCliente - totalGeneral;
            System.out.println("tu cambio es:" + cambio);
        } if (pagoCliente < totalGeneral){
            int faltante = totalGeneral - pagoCliente;
            System.out.println("te falta pagar: " + faltante);
        }
        scanner.close();

    }




}