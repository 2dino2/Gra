package Wojna;

import Przeciwnicy.Wschod;
import Przeciwnicy.Zachod;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.kohsuke.randname.RandomNameGenerator;

public class Atak {

    /*odzywki uzywają bibliotek z mavena
    zarty o chucku norrisie i random name generator
    zrobiłem tą metodę, żeby kod był czystszy, bo wykorzystuje ją po każdym ataku
     */
    public static void odzywki(int atak){
        ChuckNorrisQuotes joke = new ChuckNorrisQuotes();
        RandomNameGenerator rn = new RandomNameGenerator();
        System.out.println(rn.next()+" powiedział: "+joke.getRandomQuote()+" i zabrał przeciwnikowi "+atak+" życia.");
    }
    //nie zrobiłem interface, wiec zrobiłem łatwo dwie takie same metody
    //wywolując tą metodę na początku wpisje atakującego, a potem kogo atakuje
    //zdrowie=zdrowie-przeciwnik.atak
    //po ataku wykorzystuje metode wyzej odzywki i zwyciezca, ktory jest nizej
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
    //zwyciezca patrzy, czy ktos ma mniej lub 0 zdrowia
    //jeżeli tak, to wyświetla komunikat, że drugi wugrywa
    public static void zwyciezca(Wschod wschod, Zachod zachod){
        if (wschod.getZdrowie()<=0){
            System.out.println("Wygrywa zachód");
        } else if (zachod.getZdrowie()<=0){
            System.out.println("Wygrywa wschód");
        }
    }
    //jeżeli wschód żyje, to zwraca prawdę
    public static boolean wschodZyje(Wschod wschod){
        return wschod.getZdrowie() > 0;
    }
    //to samo
    public static boolean zachodZyje(Zachod zachod){
        return zachod.getZdrowie() > 0;
    }
    //przeciwnicy walczą do momentu, w którym jeden nie zginie
    //po kazdym ataku są odzywki i na koncu komunikat kto wygrał
    public static void wojna(Wschod wschod, Zachod zachod){
        for (int i = 0; i < 100; i++) {
            if (wschodZyje(wschod) && zachodZyje(zachod)){
                zachod.setZdrowie(zachod.getZdrowie()-wschod.getAtak());
                odzywki(wschod.getAtak());
            }
            if (wschodZyje(wschod) && zachodZyje(zachod)){
                wschod.setZdrowie(wschod.getZdrowie()- zachod.getAtak());
                odzywki(zachod.getAtak());
            }
        }
        zwyciezca(wschod,zachod);
    }
}
