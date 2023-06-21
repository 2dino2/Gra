package Wojna;

import Przeciwnicy.Wschod;
import Przeciwnicy.Zachod;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.kohsuke.randname.RandomNameGenerator;

public class Atak {
    public static void odzywki(int atak){
        ChuckNorrisQuotes joke = new ChuckNorrisQuotes();
        RandomNameGenerator rn = new RandomNameGenerator();
        System.out.println(rn.next()+" powiedział: "+joke.getRandomQuote()+" i zabrał przeciwnikowi "+atak+" życia.");
    }
    public static void atak(Wschod wschod, Zachod zachod){
        zachod.setZdrowie(zachod.getZdrowie()-wschod.getAtak());
        odzywki(wschod.getAtak());
        zwyciezca(wschod, zachod);
    }
    public static void atak(Zachod zachod, Wschod wschod){
        wschod.setZdrowie(wschod.getZdrowie()- zachod.getAtak());
        odzywki(zachod.getAtak());
        zwyciezca(wschod, zachod);
    }
    public static void zwyciezca(Wschod wschod, Zachod zachod){
        if (wschod.getZdrowie()<=0){
            System.out.println("Wygrywa zachód");
        } else if (zachod.getZdrowie()<=0){
            System.out.println("Wygrywa wschód");
        }
    }
    public static boolean wschodZyje(Wschod wschod){
        return wschod.getZdrowie() > 0;
    }
    public static boolean zachodZyje(Zachod zachod){
        return zachod.getZdrowie() > 0;
    }
    public static void wojna(Wschod wschod, Zachod zachod){
        for (int i = 0; i < 100; i++) {
            if (wschodZyje(wschod) && zachodZyje(zachod)){
                atak(wschod,zachod);
                odzywki(wschod.getAtak());
            }
            if (wschodZyje(wschod) && zachodZyje(zachod)){
                atak(zachod, wschod);
                odzywki(zachod.getAtak());
            }
        }
        zwyciezca(wschod,zachod);
    }
}
