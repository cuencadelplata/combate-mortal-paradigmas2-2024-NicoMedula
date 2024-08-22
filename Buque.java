public class Buque extends Ejercito {


    private double  vidaInicial;
    private Escudo escudo;

    public Buque() {
        this.vida = 4;  
        this.vidaInicial = vida; 
    }

    public void setVidaBuque(double valor) {
        this.vida = valor;
        this.vidaInicial = valor; 
    }

    public void recibirDisparoBuque(Ejercito ejer){

        double dañoPorDisparo;

        if (escudo != null) {
            dañoPorDisparo = vidaInicial / 5; 
        } else {
            dañoPorDisparo = vidaInicial / 3; 
        }
    
        vida -= dañoPorDisparo;
    
        if (vida < 0) {
        setVida(0);
        }
    
    }

    public double getVidaBuque(){
        return vida;
    }

    public String getEstadodevidaBuque() {

        if (vida>0) {
            return "El buque sigue con vida";
            
        }else{
            
            return "El buque ah muerto";
        }
       
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    
}
