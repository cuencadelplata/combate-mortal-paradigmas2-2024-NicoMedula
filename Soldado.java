public class Soldado extends Ejercito {

    private Escudo escudo;
    public double valorVida=vida;
    int contEscudo = 0;

   

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }
    
    public void recibirDisparoSoldado(){
        
        double dañoOriginal = vida;
        
        


        if (escudo != null && contEscudo==0) {

            dañoOriginal = escudo.reducirDaño(dañoOriginal);
            contEscudo+= 1;
           

        }

        vida -= dañoOriginal;

        if (vida < 0) {
            vida = 0;
        }

        
       
    }

    public String getEstadodevidaSoldado(){
        
        if (vida>0) {
            return "El soldado sigue con vida";
            
        }else{
            return "El soldado ah muerto";
        }
    }

    public double getVidadeSoldado(){
        return vida;
    }


}
