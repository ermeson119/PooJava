package animal;

public class Animal  {
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

    public void soar(){
        System.out.println(" ");
    }



}
