import cachorro.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Pit bull","Preto",3, 4 );

        System.out.println(cachorro1);
        System.out.println("Barulho do cachorro: "+cachorro1.latir());
        System.out.println("Pega: " + cachorro1.pegar());
        System.out.println("O estadodo do cachorro é: "+ cachorro1.interagir("carinho"));
    }
}