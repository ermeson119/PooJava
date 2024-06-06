package cachorro;

public class Cachorro {
    String nome;
    String cor;
    String estadoDeEspirito;
    int aultua;
    double peso;

    public Cachorro(String nome, String cor, int aultua, double peso) {
        this.nome = nome;
        this.cor = cor;
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

    public String latir(){
        return "AuoAuo!";
    }

    public String pegar(){
        return "Bolinha....";
    }
    public String interagir(String acao){
        if (acao.equals("carinho")){
            this.estadoDeEspirito = "Feliz";
        }else if(acao.equals("vai dormir")){
            this.estadoDeEspirito = "bravo";
        }else {
            this.estadoDeEspirito = "neutro";
        }
        return estadoDeEspirito;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                        ", cor='" + cor + '\'' +
                        ", estadoDeEspirito='" + estadoDeEspirito + '\'' +
                        ", aultua=" + aultua +
                        ", peso=" + peso;
    }
}
