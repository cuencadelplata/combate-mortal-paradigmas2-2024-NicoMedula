public class Buque extends Ejercito {

    private double recibeDisparo;

    public void recibirDisparoBuque(){

        recibeDisparo++;

        if (recibeDisparo >=3) {
            vida=0;
        }else{
            vida=vida/3;
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
}
