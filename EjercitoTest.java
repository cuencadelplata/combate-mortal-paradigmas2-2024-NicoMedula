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

import static org.junit.Assert.assertEquals;

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
        Soldado s2 = new Soldado();

        s1.setVida(2);
        
        s1.recibirDisparoSoldado(s2);
        
        assert s1.getVidadeSoldado() == 0;

    }

    //Tanque puede recibir disparo y muere de 2 diparos
    @Test
    public void tanque_puede_recibir_disparo_y_muere_de_2_disparos(){
        Tanque t1 = new Tanque();
        Tanque t2 = new Tanque();


        t1.setVida(1);
        t1.recibirDisparoTanque(t2);
        t1.recibirDisparoTanque(t2);

        assert t1.getVidaDeTanque()== 0;
       

    }

    //Buque puede recibir disparo y muere de 3 diparos
    @Test
    public void buque_puede_recibir_disparo_y_muere_de_3_disparos(){
        Buque b1 = new Buque();
        Tanque t2 = new Tanque();


        b1.setVidaBuque(9);
        b1.recibirDisparoBuque(t2);
        b1.recibirDisparoBuque(t2);
        b1.recibirDisparoBuque(t2);

        assert b1.getVidaBuque()== 0;
        

    }

    //Soldado puede preguntar si esta vivo o muerto
    @Test
    public void soldado_puede_preguntar_si_esta_vivo_o_muerto_Test(){

        Soldado s1 = new Soldado();
        Soldado s2 = new Soldado();

        s1.recibirDisparoSoldado(s2);

        assert s1.getEstadodevidaSoldado() == "El soldado ah muerto";
    }

    //Tanque puede preguntar si esta vivo o muerto
    @Test
    public void tanque_puede_preguntar_si_esta_vivo_o_muerto_Test(){

        Tanque t1 = new Tanque();
        Tanque t2 = new Tanque();

        t1.setVida(2);
        t1.recibirDisparoTanque(t2);
        t1.recibirDisparoTanque(t2);

        assert t1.getEstadodevidaTanque() == "El tanque ah muerto";
    }

    //Buque puede preguntar si esta vivo o muerto
    @Test
    public void buque_puede_preguntar_si_esta_vivo_o_muerto_Test(){

        Buque b1 = new Buque();
        Tanque t2 = new Tanque();

        b1.setVida(2);
        b1.recibirDisparoBuque(t2);
        b1.recibirDisparoBuque(t2);
        b1.recibirDisparoBuque(t2);

        assert b1.getEstadodevidaBuque() == "El buque ah muerto";
    }
    

    //Soldado recibe disparo con 50% escudo
    @Test
    public void soldado_recibe_disparo_con_50_escudo_Test(){

        Soldado s1 = new Soldado();
        Escudo e1 = new Escudo(0.50);
        Soldado s2 = new Soldado();



        s1.setVida(4);
        s1.setEscudo(e1);

        s1.recibirDisparoSoldado(s2);
        s1.recibirDisparoSoldado(s2);
        
        

        assertEquals(0, s1.getVidadeSoldado(), 0.01);


    }

    //Tanque recibe disparo con 50% escudo
    @Test
    public void tanque_recibe_disparo_con_50_escudo_Test(){

        Tanque t1 = new Tanque();
        Escudo e1 = new Escudo(0.50);
        Tanque t2 = new Tanque();



        t1.setVidaTanque(1);
        t1.setEscudo(e1);

        t1.recibirDisparoTanque(t2);
        t1.recibirDisparoTanque(t2);
        t1.recibirDisparoTanque(t2);
       
       

        assertEquals(0, t1.getVidaDeTanque(), 0.01);
    }


    //Buque recibe disparo con 50% escudo
    @Test
    public void buque_recibe_disparo_con_50_escudo_Test(){

        Buque b1 = new Buque();
        Escudo e1 = new Escudo(0.50);
        Tanque t2 = new Tanque();



        b1.setVidaBuque(1);
        b1.setEscudo(e1);

        b1.recibirDisparoBuque(t2);
        

        assertEquals(0.80, b1.getVidaBuque(), 0.01);
    }


    @Test
    public void chucknorris_recibe_disparo_y_no_muere_Test(){

        ChuckNorris ch1 = new ChuckNorris();
        Tanque t1 = new Tanque();

        ch1.setVida(1);
        ch1.recibeDisparoCH(t1);

        assert ch1.getVida() == 1;


    }

    @Test 
    public void chucknorris_puede_matar_Test(){

        ChuckNorris ch1 = new ChuckNorris();
        Soldado s1 = new Soldado();

        s1.setVida(4);
        s1.recibirDisparoSoldado(ch1);

        assert s1.getVida()==0;
    }
}
