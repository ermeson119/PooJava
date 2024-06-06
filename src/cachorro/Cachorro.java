package cachorro;

public class Cachorro {
    private String nome;
    private String cor;
    private String estadoDeEspirito;
    private int aultua;
    private double peso;

    public Cachorro() {
    }

    public Cachorro(String nome, String cor, String estadoDeEspirito, int aultua, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.estadoDeEspirito = estadoDeEspirito;
        this.aultua = aultua;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAultua() {
        return aultua;
    }

    public void setAultua(int aultua) {
        this.aultua = aultua;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public String latir(){
        return "AuoAuo!";
    }

    public String pegar(){
        return "Bolinha....";
    }
    public String interagir(String acao){
        switch (acao){
            case "carinho": this.estadoDeEspirito = "Feliz";break;
            case "vai dormir": this.estadoDeEspirito = "Bravo";break;
            case "pisou na patinha": this.estadoDeEspirito = "Triste";break;
            default: this.estadoDeEspirito = "neutro";break;
        }
        return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return
                "nome= '" + nome + '\'' +
                        ", cor= '" + cor + '\'' +
                        ", estadoDeEspirito= '" + estadoDeEspirito + '\'' +
                        ", aultua= " + aultua +
                        ", peso= " + peso;
    }
}
