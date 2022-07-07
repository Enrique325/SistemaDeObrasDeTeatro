package Modelo;

public class ObraTeatral {
    private String nombreObra;
    private String generoObra;
    private String resumenObra;
    private String actorPrincipalObra;
    private String actorSecundarioObra;
    private double precioBoletoObra;

    public ObraTeatral(String nombreObra, String generoObra, String resumenObra, String actorPrincipalObra, String actorSecundarioObra, double precioBoletoObra) {
        this.nombreObra = nombreObra;
        this.generoObra = generoObra;
        this.resumenObra = resumenObra;
        this.actorPrincipalObra = actorPrincipalObra;
        this.actorSecundarioObra = actorSecundarioObra;
        this.precioBoletoObra = precioBoletoObra;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    public String getGeneroObra() {
        return generoObra;
    }

    public void setGeneroObra(String generoObra) {
        this.generoObra = generoObra;
    }

    public String getResumenObra() {
        return resumenObra;
    }

    public void setResumenObra(String resumenObra) {
        this.resumenObra = resumenObra;
    }

    public String getActorPrincipalObra() {
        return actorPrincipalObra;
    }

    public void setActorPrincipalObra(String actorPrincipalObra) {
        this.actorPrincipalObra = actorPrincipalObra;
    }

    public String getActorSecundarioObra() {
        return actorSecundarioObra;
    }

    public void setActorSecundarioObra(String actorSecundarioObra) {
        this.actorSecundarioObra = actorSecundarioObra;
    }

    public double getPrecioBoletoObra() {
        return precioBoletoObra;
    }

    public void setPrecioBoletoObra(double precioBoletoObra) {
        this.precioBoletoObra = precioBoletoObra;
    }

   

    @Override
    public String toString() {
        return "Nombre: " + getNombreObra() + "Género: " + getGeneroObra() + "Resumen: " + getResumenObra() + "Actor Principal: " + getActorPrincipalObra()+ "Actor Secundario: "+ getActorSecundarioObra()+ "Precio Boleto: " + getPrecioBoletoObra();
    }
    
    
}
