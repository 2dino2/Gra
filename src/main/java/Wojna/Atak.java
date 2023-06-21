package Wojna;

import Przeciwnicy.Wschod;
import Przeciwnicy.Zachod;

public class Atak {
    public void atak(Wschod wschod, Zachod zachod){
        zachod.setZdrowie(zachod.getZdrowie()-wschod.getAtak());
        zwyciezca(wschod, zachod);
    }
    public void atak(Zachod zachod, Wschod wschod){
        wschod.setZdrowie(wschod.getZdrowie()- zachod.getAtak());
        zwyciezca(wschod, zachod);
    }
    public void zwyciezca(Wschod wschod, Zachod zachod){
        if (wschod.getZdrowie()<=0){
            System.out.println("Wygrywa zachód");
        } else if (zachod.getZdrowie()<=0){
            System.out.println("Wygrywa wschód");
        }
    }
    public void wojna(Wschod wschod, Zachod zachod){
        while (wschod.getZdrowie()>0 && zachod.getZdrowie()>0){
            atak(wschod,zachod);
            atak(zachod, wschod);
        }
        zwyciezca(wschod,zachod);
    }
}
