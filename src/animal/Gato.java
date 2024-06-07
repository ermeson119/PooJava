package animal;


public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nome, String cor, int autura, double peso) {
        super(nome, cor, autura, peso);
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
        return autura;
    }

    public void setAultua(int aultua) {
        this.autura = aultua;
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

    @Override
    public void soar() {
        System.out.println("Miau Miau");
    }

    @Override
    public String interagir(String acao) {
        return super.interagir(acao);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "autura=" + autura +
                ", cor='" + cor + '\'' +
                ", estadoDeEspirito='" + estadoDeEspirito + '\'' +
                ", nome='" + nome + '\'' +
                ", peso=" + peso +
                '}';
    }
}
