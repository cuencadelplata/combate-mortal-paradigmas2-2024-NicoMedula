public class Tanque extends Ejercito {

    private int disparosRecibidos = 0;
    private Escudo escudo;
    private double vidaInicial;

    public Tanque() {
        this.vida = 4;  
        this.vidaInicial = vida; 
    }

    public void setVidaTanque(double valor) {
        this.vida = valor;
        this.vidaInicial = valor; 
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public void recibirDisparoTanque(){
        
        double dañoPorDisparo;

    if (escudo != null) {
        dañoPorDisparo = vidaInicial / 4; 
    } else {
        dañoPorDisparo = vidaInicial / 2; 
    }

    vida -= dañoPorDisparo;

    if (vida < 0) {
        vida = 0;
    }

        
       
    }

    public String getEstadodevidaTanque(){
        
        if (vida>0) {
            return "El tanque sigue con vida";
            
        }else{
            return "El tanque ah muerto";
        }
    }

    public double getVidaDeTanque(){
        return vida;
    }

}
