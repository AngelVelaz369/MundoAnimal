package mx.com.animales;

public class Main {
    public static void main(String[] args) {
        Animal[] animales = {
                new Perro("SoloVino", 3),
                new Gato("elNegro", 6),
                new Vaca("Lechera", 9)
        };

        for(Animal animal : animales){
            animal.showInfo();
            animal.hacerSonido();
            ((Movible) animal).moverse();
        }
    }
}