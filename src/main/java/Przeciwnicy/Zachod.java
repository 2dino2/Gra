package Przeciwnicy;

public class Zachod{
    //ta klasa dziala identycznie jak klasa Wschod. Tam są komentarze do wszystkiego
    protected int zdrowie;
    protected int atak;

    public Zachod(int zdrowie, int atak) {
        this.zdrowie = zdrowie;
        this.atak = atak;
    }

    public int getZdrowie() {
        return zdrowie;
    }

    public void setZdrowie(int zdrowie) {
        this.zdrowie = zdrowie;
    }

    public int getAtak() {
        return atak;
    }

    @Override
    public String toString() {
        return "Zachod{" +
                "zdrowie=" + zdrowie +
                ", atak=" + atak +
                '}';
    }
}
