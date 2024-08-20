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

    //Soldado puede disparar
    @Test
    public void soldado_puede_disparar_Test(){
        Soldado s1 = new Soldado();

        s1.setDisparo(1);
        assert s1.getDisparo() == 1;
    }

    //Tanque puede disparar
    @Test 
    public void tanque_puede_disparar_Test(){
        Tanque t1 = new Tanque();
        t1.setDisparo(2);

        assert t1.getDisparo() == 2;
    }

    //Buque puede disparar
    @Test 
    public void buque_puede_disparar_Test(){
        Buque b1 = new Buque();
        b1.setDisparo(3);

        assert b1.getDisparo() == 3;
    }


    //Soldado pue recibir disparo y muere de 1 diparo
    @Test
    public void soldado_puede_recibir_disparo_y_muere_de_1_disparo(){
        Soldado s1 = new Soldado();


        s1.setVida(1);
        s1.recibirDisparoSoldado();

        assert s1.getVidadeSoldado()==0;

    }

    //Tanque puede recibir disparo y muere de 2 diparos
    @Test
    public void tanque_puede_recibir_disparo_y_muere_de_2_disparos(){
        Tanque t1 = new Tanque();


        t1.setVida(1);
        t1.recibirDisparoTanque();
        t1.recibirDisparoTanque();

        assert t1.getVidaDeTanque()== 0;
       

    }

    //Buque puede recibir disparo y muere de 3 diparos
    @Test
    public void buque_puede_recibir_disparo_y_muere_de_3_disparos(){
        Buque b1 = new Buque();


        b1.setVida(9);
        b1.recibirDisparoBuque();
        b1.recibirDisparoBuque();
        b1.recibirDisparoBuque();

        assert b1.getVidaBuque()== 0;
        

    }

    //Soldado puede preguntar si esta vivo o muerto
    @Test
    public void soldado_puede_preguntar_si_esta_vivo_o_muerto_Test(){

        Soldado s1 = new Soldado();

        s1.recibirDisparoSoldado();

        assert s1.getEstadodevidaSoldado() == "El soldado ah muerto";
    }

    //Tanque puede preguntar si esta vivo o muerto
    @Test
    public void tanque_puede_preguntar_si_esta_vivo_o_muerto_Test(){

        Tanque t1 = new Tanque();

        t1.setVida(2);
        t1.recibirDisparoTanque();
        t1.recibirDisparoTanque();

        assert t1.getEstadodevidaTanque() == "El tanque ah muerto";
    }

    //Buque puede preguntar si esta vivo o muerto
    @Test
    public void buque_puede_preguntar_si_esta_vivo_o_muerto_Test(){

        Buque b1 = new Buque();

        b1.setVida(2);
        b1.recibirDisparoBuque();
        b1.recibirDisparoBuque();
        b1.recibirDisparoBuque();

        assert b1.getEstadodevidaBuque() == "El buque ah muerto";
    }
    
}
