public class Soldado extends Ejercito {
    
    public void recibirDisparoSoldado(){
        vida=0;
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
