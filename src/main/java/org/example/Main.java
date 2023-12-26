package org.example;

import java.util.Scanner;

public class Main {
    public static int indiceCocheMasBarato(Coche coches[]){//Calculo cual de todos los coches que le pase es el mas economico
        float precio;
        int indice=0;

        precio=coches[0].getPrecio();
        for (int i=1;i<coches.length;i++){//Me va a retornar el indice del coche mas barato
            if(coches[i].getPrecio()<precio){
                precio= coches[i].getPrecio();
                indice=i;

            }
        }
        return indice;
    }
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        String marca,modelo;
        float precio;
        int numeroVehiculos,indiceBarato;

        System.out.println("Ingrese la cantidad de vehiculos: ");
        numeroVehiculos=entrada.nextInt();

        //Instancio el objeto coche
        Coche coches[]=new Coche[numeroVehiculos];//Creo tantos objetos como el usuario desee

        for (int i=0;i<coches.length;i++){//Coche.lenght has
            entrada.nextLine();//Para borrar buffer

            System.out.println("Digite las caracteristicas del Coche"+(i+1)+": ");

            System.out.print("Introduzca la marca: ");
            marca= entrada.nextLine();
            System.out.print("Introduzca el modelo:");
            modelo=entrada.nextLine();
            System.out.print("Introduzca el precio: ");
            precio= entrada.nextFloat();

            coches[i]=new Coche(marca,modelo,precio);//Cada vez que el bucle de una vuelta se va almacenar un nuevo coche.


        }
        indiceBarato=indiceCocheMasBarato(coches);//Como es estatico no hace falta crear objetos. Se puede llamar directamente
        System.out.println("El coche mas barato es: "+coches[indiceBarato].mostrarDatos());






    }
}