package Modelo;

public class FuncionTeatral {
    private ObraTeatral obraTeatralFuncion;
    private Fecha fechaFuncion;
    private String horaPresemtacionFuncion;

    public FuncionTeatral(ObraTeatral obraTeatralFuncion, Fecha fechaFuncion, String horaPresemtacionFuncion) {
        this.obraTeatralFuncion = obraTeatralFuncion;
        this.fechaFuncion = fechaFuncion;
        this.horaPresemtacionFuncion = horaPresemtacionFuncion;
    }

    public ObraTeatral getObraTeatralFuncion() {
        return obraTeatralFuncion;
    }

    public void setObraTeatralFuncion(ObraTeatral obraTeatralFuncion) {
        this.obraTeatralFuncion = obraTeatralFuncion;
    }

    public Fecha getFechaFuncion() {
        return fechaFuncion;
    }

    public void setFechaFuncion(Fecha fechaFuncion) {
        this.fechaFuncion = fechaFuncion;
    }

    public String getHoraPresemtacionFuncion() {
        return horaPresemtacionFuncion;
    }

    public void setHoraPresemtacionFuncion(String horaPresemtacionFuncion) {
        this.horaPresemtacionFuncion = horaPresemtacionFuncion;
    }

    @Override
    public String toString() {
        return "Obra: " + getObraTeatralFuncion() + "Fecha función: " + getFechaFuncion() + "Hora de la función: " + getHoraPresemtacionFuncion();
    }
    
    
    
}
