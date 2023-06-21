package Przeciwnicy;

public class Wschod {
    protected int zdrowie;
    protected int atak;

    public Wschod(int zdrowie, int atak) {
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

    public void setAtak(int atak) {
        this.atak = atak;
    }

    @Override
    public String toString() {
        return "Wschod{" +
                "zdrowie=" + zdrowie +
                ", atak=" + atak +
                '}';
    }
}
