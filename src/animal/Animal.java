package animal;

public abstract class Animal  {
    protected String nome;
    protected String cor;
    protected String estadoDeEspirito;
    protected int autura;
    protected double peso;

    public Animal() {
    }

    public Animal(String nome, String cor, int autura , double peso) {
        this.nome = nome;
        this.cor = cor;
        this.autura = autura;
        this.peso = peso;
    }

    public int getAutura() {
        return autura;
    }

    public void setAutura(int autura) {
        this.autura = autura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    enum EstadoDeEspirito {
        FELIZ, TRISTE, BRAVO, NEUTRO
    }

    public String interagir(String acao){

        switch (acao){
            case "carinho": this.estadoDeEspirito = String.valueOf(EstadoDeEspirito.FELIZ);break;
            case "vai dormir": this.estadoDeEspirito = String.valueOf(EstadoDeEspirito.BRAVO);break;
            case "pisou na patinha": this.estadoDeEspirito = String.valueOf(EstadoDeEspirito.TRISTE);break;
            default: this.estadoDeEspirito = String.valueOf(EstadoDeEspirito.NEUTRO);break;
        }
        return this.estadoDeEspirito;
    }

    public abstract void soar();



}
