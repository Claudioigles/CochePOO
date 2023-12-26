package org.example;

public class Coche {
    //Atributos
    private String marca;
    private String modelo;
    private float precio;


    //Metodo COnstructor
    public Coche(String __marca,String __modelo,float __precio){
        marca=__marca;
        modelo=__modelo;
        precio=__precio;
    }

    //Metodo Getters

    public float getPrecio() {
        return precio;
    }

    //metodo Mostrar Datos
    public String mostrarDatos(){
        return "La marca de mi auto es: "+marca+" y modelo: "+modelo+ ".Me costo:$ "+getPrecio();
    }
}
