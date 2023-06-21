package Przeciwnicy;

public class Wschod {
    //Zmienne zdrowie i atak mogą być private
    protected int zdrowie;
    protected int atak;

    //konstruktor przeciwnika ze wschodu. Tworząc go w Test inicjuje wartosci zdrowie i atak
    public Wschod(int zdrowie, int atak) {
        this.zdrowie = zdrowie;
        this.atak = atak;
    }

    //getZdrowie jest, żeby łatwo można było w innych klasach uzyskać zdrowie
    public int getZdrowie() {
        return zdrowie;
    }

    //setZdrowie jest używane tak samo jak get
    public void setZdrowie(int zdrowie) {
        this.zdrowie = zdrowie;
    }

    //to samo
    public int getAtak() {
        return atak;
    }

    //toString nie jest uzywany, ale moze byc jakbym chcial wyświetlić stan przeciwnika
    @Override
    public String toString() {
        return "Wschod{" +
                "zdrowie=" + zdrowie +
                ", atak=" + atak +
                '}';
    }
}
