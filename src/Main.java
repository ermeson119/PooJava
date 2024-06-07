import animal.Cachorro;
import animal.Gato;
import petshop.Petshop;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Pit bull","Preto",3, 4 );
        System.out.println(cachorro1);
        System.out.println("Barulho do Cachorro: ");
        cachorro1.soar();
        System.out.println("Pega: " + cachorro1.pegar());
//        System.out.println("O estadodo do cachorro é: "+ cachorro1.interagir("carinho")+"\n");

        Gato gato1 = new Gato("Frajola","Preto",4, 4 );
        System.out.println(gato1);
        System.out.println("Barulho do Gato: ");
        gato1.soar();
        System.out.println("O estadodo do cachorro é: "+ cachorro1.interagir("pisou na patinha"));

        Petshop petshop = new Petshop();
        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());
        petshop.tosar(cachorro1);
        petshop.deixarNoHotal(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        System.out.println("\n Gatoo");
        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());
        petshop.deixarNoHotal(gato1);
        System.out.println(gato1.getEstadoDeEspirito());





    }
}