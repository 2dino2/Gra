package Test;

import Przeciwnicy.Wschod;
import Przeciwnicy.Zachod;
import Wojna.Atak;

public class TestWojny {
    public static void main(String[] args) {
        //tworze przeciwnika wschód ze zdrowiem 100 i atakiem 30
        Wschod wschod = new Wschod(100,30);
        //tworzę przeciwnika zachod ze zdrowiem 80 i atakiem 30
        Zachod zachod = new Zachod(80, 30);
        //używam ataków i potem wojny, żeby jeden przeciwnik zginął
        Atak.atak(wschod, zachod);
        Atak.atak(zachod, wschod);
        Atak.wojna(wschod, zachod);
    }
}
