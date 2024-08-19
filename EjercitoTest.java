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
*/

import org.junit.Test;

public class EjercitoTest {


    @Test
    public void soldado_puede_disparar_Test(){
        Soldado s1 = new Soldado();

        s1.setDisparo(1);
        assert s1.getDisparo() == 1;
    }
    
}
