public class Tanque extends Ejercito {

    private double disparosRecibidos;

    public void recibirDisparoTanque(){
        disparosRecibidos++;

        if (disparosRecibidos >= 2){
            vida=0;
        }else{
            vida=vida/2;
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
