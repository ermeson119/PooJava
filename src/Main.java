import cachorro.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Pit bull","Preto","vai dormir",3, 4 );
        System.out.println(cachorro1);
        System.out.println("Barulho do cachorro: "+cachorro1.latir());
        System.out.println("Pega: " + cachorro1.pegar());
        System.out.println("O estadodo do cachorro é: "+ cachorro1.interagir("vai dormir")+"\n");

        Cachorro cachorro2 = new Cachorro("Viralata","Caramelo","pisou na patinha",2, 2 );
        System.out.println(cachorro2);
        System.out.println("Barulho do cachorro: "+cachorro1.latir());
        System.out.println("Pega: " + cachorro1.pegar());
        System.out.println("O estadodo do cachorro é: "+ cachorro1.interagir("pisou na patinha")+"\n");

        Cachorro cachorro3 = new Cachorro("salsicha","Preto","carinho",2, 3 );
        System.out.println(cachorro3);
        System.out.println("Barulho do cachorro: "+cachorro1.latir());
        System.out.println("Pega: " + cachorro1.pegar());
        System.out.println("O estadodo do cachorro é: "+ cachorro1.interagir("carinho"));
    }
}