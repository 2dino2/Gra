package Wojna;

import Przeciwnicy.Wschod;
import Przeciwnicy.Zachod;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.kohsuke.randname.RandomNameGenerator;

public class Atak {
    public void odzywki(int atak){
        ChuckNorrisQuotes joke = new ChuckNorrisQuotes();
        RandomNameGenerator rn = new RandomNameGenerator();
        System.out.println(rn.next()+" powiedział: "+joke.getRandomQuote()+" i zabrał przeciwnikowi "+atak+" życia.");
    }
    public void atak(Wschod wschod, Zachod zachod){
        zachod.setZdrowie(zachod.getZdrowie()-wschod.getAtak());
        odzywki(wschod.getAtak());
        zwyciezca(wschod, zachod);
    }
    public void atak(Zachod zachod, Wschod wschod){
        wschod.setZdrowie(wschod.getZdrowie()- zachod.getAtak());
        odzywki(zachod.getAtak());
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
            odzywki(wschod.getAtak());
            atak(zachod, wschod);
            odzywki(zachod.getAtak());
        }
        zwyciezca(wschod,zachod);
    }
}
