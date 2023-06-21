package Test;

import Przeciwnicy.Wschod;
import Przeciwnicy.Zachod;
import Wojna.Atak;

public class TestWojny {
    public static void main(String[] args) {
        Wschod wschod = new Wschod(100,30);
        Zachod zachod = new Zachod(80, 30);
        Atak.atak(wschod, zachod);
        Atak.atak(zachod, wschod);
        Atak.wojna(wschod, zachod);
    }
}
