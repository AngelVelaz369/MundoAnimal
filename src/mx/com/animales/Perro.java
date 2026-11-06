package mx.com.animales;

import java.sql.SQLOutput;

public class Perro extends Animal implements Movible{
    public Perro(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println(" | Sonido : Guau");
    }
    @Override
    public void moverse(){
        System.out.println(" | Movimiento : Corre");
    }
}
