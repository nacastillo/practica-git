package nicastillo.unidad1;

public class Unidad1 {

    public static void main(String[] args) {
        System.out.println("Bienvenidos a POO y Git");
        var planta = new SerVivo("Manzano", 100);
        planta.presentarse();
        var plantaPosta = new Planta ("Pasto", 200);
        plantaPosta.hacerFotosintesis();
    }
}

class SerVivo {
    
    String nombre;
    int diasDeVida;
    
    public void respirar () {
        System.out.println("Soy un ser vivo y respiro!");
    }

    public void presentarse () {
        System.out.println(String.format("Ante todo me presento, ¡soy %s y nací hace %d dias!", nombre, diasDeVida));
    }

    public SerVivo(String nombre, int diasDeVida) {
        this.nombre = nombre;
        this.diasDeVida = diasDeVida;
    }    
}

class Planta extends SerVivo {
    
    int cantidadHojas;
    
    public Planta (String nombre, int diasDeVida) {
        super(nombre, diasDeVida);
    }    
    
    void hacerFotosintesis () {
        System.out.println("Soy una planta, puedo hacer fotosíntesis!");
    }
}
