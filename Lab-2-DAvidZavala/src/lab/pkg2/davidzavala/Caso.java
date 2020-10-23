package lab.pkg2.davidzavala;

class Caso {

    private String lugar;
    private String Descripción;
    private String Tipo;
    private Detective Detectibe;
    private String Estado;

    public Caso() {
    }

    public Caso(String lugar, String Descripción, String Tipo, Detective Detectibe, String Estado) {
        this.lugar = lugar;
        this.Descripción = Descripción;
        this.Tipo = Tipo;
        this.Detectibe = Detectibe;
        this.Estado = Estado;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Detective getDetectibe() {
        return Detectibe;
    }

    public void setDetectibe(Detective Detectibe) {
        this.Detectibe = Detectibe;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Caso{" + "lugar=" + lugar + ", Descripci\u00f3n=" + Descripción + ", Tipo=" + Tipo + ", Detectibe=" + Detectibe + ", Estado=" + Estado + '}';
    }
    
    
}
