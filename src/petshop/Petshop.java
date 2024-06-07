package petshop;

import animal.Animal;
import animal.Cachorro;

public class Petshop {

    public void darBanho(Animal animal) {
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro) {
        cachorro.setEstadoDeEspirito("Tosado");
    }

    public void deixarNoHotal(Animal animal){
        animal.setEstadoDeEspirito("Com saudades");
    }
}
