package miproyecto.ejercito;



/*
    Se requiere tener Soldados, Tanques, Buques
    Todos pueden disparar.
    Todos pueden recibir un disparo
    El soldado muere de un solo disparo 
    El tanque queda sin vida en 2 disparos
    El buque queda sin vida en 3 disparos
    Todos deberían poder preguntar si esta vivo.
    Se requiere poder armar un Escudo y pasarlo a un item (sea Soldado, Tanque o Buque)
    El escudo puede tener un porcentaje que  disminuye el daño (Si el escudo tiene un 50%, entonces el daño hace solo el 50% cuando se recibe)
    ChuckNorris: puede matar a todos pero nadie lo puede matar a el (ni tanques, soldados ni buques)
 */
public class Ejercito {

    double vida;
    double disparo;

    

    public void setVida(int valor){
        vida=valor;

    }

    public double getVida(){
        return vida;
    }

    public void setDisparo(int valor){
        disparo=valor;
    }

    public double getDisparo(){
        return disparo;
    }


    




}