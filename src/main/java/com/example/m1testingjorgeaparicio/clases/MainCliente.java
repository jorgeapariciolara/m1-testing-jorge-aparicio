package com.example.m1testingjorgeaparicio.clases;

import com.example.m1testingjorgeaparicio.objetos.Cliente;
import com.example.m1testingjorgeaparicio.objetos.Factura;
import com.example.m1testingjorgeaparicio.objetos.Telefono;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCliente {

    public static void main(String[] args) {

        // Creo el array para introducir los datos de los clientes y, dentro de ellos, crearé los clientes con
        //su Array para Teléfonos y su Array para Facturas

        // el Array de los Clientes
        List<Cliente> cliente = new ArrayList<>();

        // el Arrray de los Teléfonos (dentro del Cliente)
        Telefono telefono1 = new Telefono ();
        telefono1.setDomicilio1("919191915");
        telefono1.setMovil1("619191915");
        telefono1.setTrabajo1("916515151");

        // el Arrray de las Facturas (dentro del Cliente)
        Factura factura1 = new Factura ();
        factura1.setComida(64.80);
        factura1.setConsulta(55.00);
        factura1.setMedicamentos(67.75);

        // y el objeto cliente
        cliente.add (new Cliente("99999999Z", "José Luis", "Flores",
                "Romero", 42, telefono1, true, factura1));

        // Creo algunos clientes de prueba
        Telefono telefono2 = new Telefono ();
        telefono2.setMovil1("619191987");
        telefono2.setTrabajo1("916515121");
        Factura factura2= new Factura ();
        factura2.setComida(14.80);
        factura2.setConsulta(25.00);
        factura2.setMedicamentos(37.75);
        cliente.add (new Cliente("88888888Y", "Mª José", "García",
                "García", 17, telefono2, true, factura2));

        Telefono telefono3 = new Telefono ();
        telefono3.setDomicilio1("919191321");
        telefono3.setMovil1("619191900");
        Factura factura3= new Factura ();
        factura3.setComida(114.80);
        factura3.setConsulta(25.00);
        factura3.setMedicamentos(77.00);
        cliente.add (new Cliente("77777777X", "Mª José", "Romero",
                "García", 37, telefono3, false, factura3));

        Telefono telefono4 = new Telefono ();
        telefono4.setMovil1("619654980");
        Factura factura4= new Factura ();
        factura4.setComida(44.80);
        factura4.setConsulta(45.00);
        factura4.setMedicamentos(37.75);
        cliente.add (new Cliente("66666666W", "Pedro", "Blanco",
                "García", 29, telefono4, true, factura4));

        Telefono telefono5 = new Telefono ();
        telefono5.setDomicilio1("919190202");
        Factura factura5= new Factura ();
        factura5.setComida(164.80);
        factura5.setConsulta(15.00);
        factura5.setMedicamentos(317.75);
        cliente.add (new Cliente("55555555V", "Lorena", "Marcos",
                "Moreno", 52, telefono5, false, factura5));



        // Con el OBJETO SCANNER puedo introducir datos a través de la consola
        Scanner scanner = new Scanner (System.in);


        while (true) {

            System.out.println("¡Bienvenido! Por favor, seleccione una opción:");
            System.out.println("0.- SALIR DE LA APLICACIÓN");
            System.out.println("1.- Ver todos los clientes");
            System.out.println("2.- Buscar un cliente (por DNI)");
            System.out.println("3.- Crear un nuevo cliente");
            System.out.println("4.- Modificar un cliente (por DNI)");
            System.out.println("5.- Borrar un cliente (por DNI)");
            System.out.println("6.- Borrar todos los clientes");
            System.out.println("7.- Calcular los gastos de un cliente (por DNI)");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 0) {
                System.out.println("Ha seleccionado la opción 0 - SALIR DE LA APLICACIÓN");
                System.out.println("¿Desea salir de la aplicación?");
                String respuesta0 = scanner.nextLine();
                if(respuesta0.equalsIgnoreCase("si")) {
                    break;
                } else {
                    continue;
                }

            } else if (opcion == 1) {
                System.out.println("Ha seleccionado la opción 1 - VER TODOS LOS CLIENTES");
                if (!cliente.isEmpty()) {
                    // Saco por pantalla la información de los clientes con un
                    // Bucle for each => para cada elemento de la clase Cliente, imprime sus datos
                    for(Cliente clientes : cliente) {
                        System.out.println(clientes);
                    }
                } else {
                    System.out.println("No existen clientes registrados");
                    continue;
                }

            } else if (opcion == 2) {

            } else if (opcion == 3) {

            } else if (opcion ==4) {

            } else if (opcion == 5) {

            } else if (opcion == 6) {
                System.out.println("Ha seleccionado la opción 6 - BORRAR TODOS LOS CLIENTES");
                System.out.println("¿Seguro que desea borrar todos los registros?");
                String respuesta6 = scanner.nextLine();
                if(respuesta6.equalsIgnoreCase("si")) {
                    cliente.clear();
                } else {
                    continue;
                }

            } else if (opcion == 7) {

            } else {
                System.out.println("EL NÚMERO INTRODUCIDO NO ES UNA OPCIÓN VÁLIDA" + "\n" +
                        "POR FAVOR, INTRODUZCA UN NÚMERO VÁLIDO.");
            }


        }

        System.out.println("Fin del programa");

        scanner.close();


    }
}
