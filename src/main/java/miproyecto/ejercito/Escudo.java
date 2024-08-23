package miproyecto.ejercito;

public class Escudo {
    
    private double porcentajeReduccion;

    public Escudo(double porcentajeReduccion){
        this.porcentajeReduccion=porcentajeReduccion;
    }

    public double getPorcentajedeReduccion(){
        return porcentajeReduccion;
    }

    public double reducirDaño(double dañoOriginal){
        return dañoOriginal * (1-porcentajeReduccion);
    }
}
