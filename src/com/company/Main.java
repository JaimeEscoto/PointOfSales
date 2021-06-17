package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner reader = new Scanner(System.in);


        int cantidadProductos;
        int control=0;

        // crear producto
        String namep;
        double unitPricep;
        double unitCostp;
        int inventoryp;

        System.out.println("Cuantos productos va tener la caja: ");
        cantidadProductos =reader.nextInt();
        CashRegister micaja = new CashRegister(cantidadProductos);


        while(control!=20) {
            System.out.println("Menu");
            System.out.println("1. Crear Producto");
            System.out.println("2. Listar Productos");
            System.out.println("20. Salir");
            control =reader.nextInt();
            if(control==1)
            {
                System.out.println("Ingrese nombre: ");
                namep =reader.next();
                System.out.println("Ingrese Precio Unitario: ");
                unitPricep =reader.nextDouble();
                System.out.println("Ingrese Costo Unitario: ");
                unitCostp =reader.nextDouble();
                System.out.println("Ingrese el Inventario: ");
                inventoryp =reader.nextInt();

                micaja.createProduct(new Product(0,namep,unitPricep,unitCostp,inventoryp));


            }

        }

        for (int i = 0; i < micaja.products.length; i++) {
            if(micaja.products[i]!=null)
            {
                System.out.println(micaja.products[i].getId());
                System.out.println(micaja.products[i].getName());
                System.out.println(micaja.products[i].getInventory());
            }
        }


    }
}
